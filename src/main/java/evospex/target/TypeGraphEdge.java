package evospex.target;

import org.jgrapht.graph.DefaultEdge;

/**
 * Represents a labeled edge in our type graph
 * @author Facundo Molina <fmolina@dc.exa.unrc.edu.ar>
 */
public class TypeGraphEdge extends DefaultEdge {

  private static final long serialVersionUID = 1L;
  private String label;

  /**
   * Constructs a labeled edge
   * @param label is the label of the new edge.
   */
  public TypeGraphEdge(String label) {
    this.label = label;
  }

  /**
   * Gets the label associated with this edge.
   * @return the edge label
   */
  public String getLabel() {
    return label;
  }

  @Override
  public String toString() {
    return "(" + getSource() + " : " + getTarget() + " : " + label + ")";
  }

}
