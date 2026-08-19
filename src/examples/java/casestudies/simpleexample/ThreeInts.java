package casestudies.simpleexample;

public class ThreeInts implements java.io.Serializable {
  
  private int a;
  private int b;
  private int c;

  public ThreeInts(int a, int b, int c) {
    this.a = a;
    this.b = b;
    this.c = c;
  }

  public void computeA() {
    this.a = this.b + this.c;
  }

  public int getA() {
    return a;
  }

}