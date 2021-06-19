package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
NodeCachingLinkedListaddFirst4Suite0.class, 
NodeCachingLinkedListaddFirst4Suite1.class, 
NodeCachingLinkedListaddFirst4Suite2.class, 
NodeCachingLinkedListaddFirst4Suite3.class, 
NodeCachingLinkedListaddFirst4Suite4.class, 
NodeCachingLinkedListaddFirst4Suite5.class
})
public class NodeCachingLinkedListaddFirst4Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(NodeCachingLinkedListaddFirst4Suite0.class, 
				NodeCachingLinkedListaddFirst4Suite1.class, 
				NodeCachingLinkedListaddFirst4Suite2.class, 
				NodeCachingLinkedListaddFirst4Suite3.class, 
				NodeCachingLinkedListaddFirst4Suite4.class, 
				NodeCachingLinkedListaddFirst4Suite5.class
				);
	}
	
}
