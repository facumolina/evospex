package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
NodeCachingLinkedListaddLast4Suite0.class, 
NodeCachingLinkedListaddLast4Suite1.class, 
NodeCachingLinkedListaddLast4Suite2.class, 
NodeCachingLinkedListaddLast4Suite3.class, 
NodeCachingLinkedListaddLast4Suite4.class, 
NodeCachingLinkedListaddLast4Suite5.class
})
public class NodeCachingLinkedListaddLast4Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(NodeCachingLinkedListaddLast4Suite0.class, 
				NodeCachingLinkedListaddLast4Suite1.class, 
				NodeCachingLinkedListaddLast4Suite2.class, 
				NodeCachingLinkedListaddLast4Suite3.class, 
				NodeCachingLinkedListaddLast4Suite4.class, 
				NodeCachingLinkedListaddLast4Suite5.class
				);
	}
	
}
