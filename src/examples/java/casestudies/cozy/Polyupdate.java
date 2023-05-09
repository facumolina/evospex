package casestudies.cozy;

public class Polyupdate implements java.io.Serializable {
  protected Integer _var23;
  protected Integer _var426;

  public Polyupdate() {
    clear();
  }

  /*
  public void add0(Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }

  public void add1(Integer x1, Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  x.add(x1);
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }

  public void add2(Integer x1, Integer x2, Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  x.add(x1);
	  x.add(x2);
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  }
  */

  public void add3(Integer x1, Integer x2, Integer x3, Integer s) {
	  java.util.ArrayList<Integer> x = new java.util.ArrayList<>();
	  x.add(x1);
	  x.add(x2);
	  x.add(x3);
	  _var23 = s;
	  Integer _sum345639 = 0;
	  for (Integer _x345640 : x) {
		  _sum345639 = (_sum345639 + _x345640);
	  }
	  _var426 = _sum345639;
  } 
  
  public Polyupdate(java.util.ArrayList<Integer> x, Integer s) {
    _var23 = s;
    Integer _sum345639 = 0;
    for (Integer _x345640 : x) {
      _sum345639 = (_sum345639 + _x345640);
    }
    _var426 = _sum345639;
  }

  public void clear() {
    _var23 = 0;
    Integer _sum345641 = 0;
    _var426 = _sum345641;
  }

  public Integer sm() {
    return (_var23 + _var426);
  }

  public void a(Integer y) {
    Integer _conditional_result345643 = 0;
    if ((y > 0)) {
      _conditional_result345643 = (_var23 + y);
    } else {
      _conditional_result345643 = _var23;
    }
    Integer _var345637 = _conditional_result345643;
    Integer _var345638 = (_var426 + y);
    _var23 = _var345637;
    _var426 = _var345638;
  }
}
