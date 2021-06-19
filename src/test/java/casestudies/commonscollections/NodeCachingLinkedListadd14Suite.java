package casestudies.commonscollections;

import org.junit.runner.JUnitCore;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
NodeCachingLinkedListadd14Suite0.class, 
NodeCachingLinkedListadd14Suite1.class, 
NodeCachingLinkedListadd14Suite2.class, 
NodeCachingLinkedListadd14Suite3.class, 
NodeCachingLinkedListadd14Suite4.class, 
NodeCachingLinkedListadd14Suite5.class
})
public class NodeCachingLinkedListadd14Suite{ 
	
	public static void main(String[] args) {
		JUnitCore.runClasses(NodeCachingLinkedListadd14Suite0.class, 
				NodeCachingLinkedListadd14Suite1.class, 
				NodeCachingLinkedListadd14Suite2.class, 
				NodeCachingLinkedListadd14Suite3.class, 
				NodeCachingLinkedListadd14Suite4.class, 
				NodeCachingLinkedListadd14Suite5.class
				);
	}
	
}
