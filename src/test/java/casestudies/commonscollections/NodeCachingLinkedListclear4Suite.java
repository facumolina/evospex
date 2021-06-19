package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
NodeCachingLinkedListclear4Suite0.class, 
NodeCachingLinkedListclear4Suite1.class, 
NodeCachingLinkedListclear4Suite2.class, 
NodeCachingLinkedListclear4Suite3.class, 
NodeCachingLinkedListclear4Suite4.class, 
NodeCachingLinkedListclear4Suite5.class
})
public class NodeCachingLinkedListclear4Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(NodeCachingLinkedListclear4Suite0.class, 
				NodeCachingLinkedListclear4Suite1.class, 
				NodeCachingLinkedListclear4Suite2.class, 
				NodeCachingLinkedListclear4Suite3.class, 
				NodeCachingLinkedListclear4Suite4.class, 
				NodeCachingLinkedListclear4Suite5.class
				);
	}
	
}
