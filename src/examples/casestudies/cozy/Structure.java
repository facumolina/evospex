package casestudies.cozy;

public class Structure implements java.io.Serializable {
  protected Integer _var62;

  public Structure() {
    clear();
  }

  public Structure(Integer x) {
    _var62 = ((x) + 1);
  }

  public void clear() {
    _var62 = ((0) + 1);
  }

  public Integer foo() {
    return _var62;
  }

  public void setX(Integer y) {
    _var62 = ((y) + 1);
  }
}
