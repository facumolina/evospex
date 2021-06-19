package geneticalgorithm.chromosome;

import org.jgap.ICloneHandler;

/**
 * This class implements a clone handler for the ExprGene entity.
 * @author fmolina
 */
public class ExprGeneValueCloneHandler implements ICloneHandler {

	/**
	 * Returns true if the given class is the ExprGene.
	 */
	public boolean isHandlerFor(Object a_obj, Class a_class) {
		if (a_class!=null) {
			return a_class.equals(ExprGeneValue.class);
		} else {
			return false;
		}
	}

	/**
	 * Perform the clone operation.
	 */
	public Object perform(Object a_obj, Class a_class, Object a_params)
			throws Exception {
		return ((ExprGeneValue)a_obj).clone();
	}

}
