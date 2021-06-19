package wrapper;

import java.io.File;

/**
 * Class used as intermediate to run Hamcrest specs
 * 
 * @author fmolina
 */
public class HamcrestRunner extends Runner {

  private String methodName; // Method for which we want to learn the post condition

  public HamcrestRunner(File file) {
    super(file);
    this.methodName = "";
  }

  @Override
  protected void setUp() {
    // TODO Auto-generated method stub

  }

}
