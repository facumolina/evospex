package wrapper;

import java.io.File;

/**
 * Generic runner
 * 
 * @author fmolina
 */
public abstract class Runner {

  protected String filename;
  protected String filePath;

  public Runner(File file) {
    this.filename = file.getName();
    this.filePath = file.getAbsolutePath();
  }

  protected abstract void setUp();
}
