package evospex.target;

import org.jgrapht.Graph;
import org.jgrapht.graph.DirectedPseudograph;

import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.*;

/**
 * Represents to type graph of a class under analysis
 * The type graph contains one node for each type that is reachable through
 * the fields of the current cut, and there is a link labeled with l from node n1 to node n2
 * iff there is an attribute l that goes from the type represented by n1 to the type
 * represented by n2.
 */
public class TypeGraph {

  protected DirectedPseudograph<Class<?>, TypeGraphEdge> graph; // The actual graph

  /**
   * Constructor
   * @param cut is the cut under analysis
   */
  public TypeGraph(Class<?> cut) {
    if (cut == null)
      throw new IllegalArgumentException("The CUT can't be null");
    graph = new DirectedPseudograph<>(TypeGraphEdge.class);
    buildGraph(cut, new HashSet<>());
    System.out.println("Nodes: " + graph.vertexSet().toString());
    System.out.println("Edges: " + graph.edgeSet().toString());
  }

  /**
   * Recursively build the graph from the cut.
   * @param cut is the cut under analysis.
   * @param visited contains the name of the already visited classes.
   */
  private void buildGraph(Class<?> cut, Set<String> visited) {
    if (visited.add(cut.getName())) {
      if (!cut.getName().contains("java.util") && !java.lang.Error.class.isAssignableFrom(cut)) {
        // Only visit the fields of non java util classes
        // and that are not instances of java.lang.Error
        graph.addVertex(cut);
        // Get the fields of the given type
        Set<Class<?>> to_visit = new HashSet<>();
        List<Field> fields = getAllFields(new LinkedList<>(), cut);
        for (Field fld : fields) {
          if (!Modifier.isStatic(fld.getModifiers())) {
            // For each non static field
            String fld_decl_name = fld.getName();
            Class<?> fld_type = fld.getType();
            graph.addVertex(fld_type);
            graph.addEdge(cut, fld_type, new TypeGraphEdge(fld_decl_name));
            to_visit.add(fld_type);
          }
        }
        for (Class<?> cls : to_visit) {
          // Visit fields only for non-primitive types for now
          if (!cls.isPrimitive())
            buildGraph(cls, visited);
        }
      }
    }
  }

  /**
   * Returns the edges of the given vertex class
   */
  public Set<TypeGraphEdge> getOutgoingEdges(Class<?> vertexClass) {
    return graph.outgoingEdgesOf(vertexClass);
  }

  /**
   * Get the target vertex of the given edge
   */
  public Class<?> getTargetVertex(TypeGraphEdge edge) {
    return graph.getEdgeTarget(edge);
  }

  /**
   * Get all fields from the CUT (even the inherited ones)
   */
  private List<Field> getAllFields(List<Field> fields, Class<?> cut) {
    fields.addAll(Arrays.asList(cut.getDeclaredFields()));
    if (cut.getSuperclass() != null) {
      getAllFields(fields, cut.getSuperclass());
    }
    return fields;
  }

}
