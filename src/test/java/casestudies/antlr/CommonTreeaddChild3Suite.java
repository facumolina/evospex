package casestudies.antlr;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

//import casestudies.commonscollections.NodeCachingLinkedListadd3Suite0;

@RunWith(Suite.class)
@Suite.SuiteClasses({ CommonTreeaddChild3Suite0.class })
public class CommonTreeaddChild3Suite {

  public static void main(String[] args) {
    JUnitCore.runClasses(CommonTreeaddChild3Suite0.class);
  }

}
