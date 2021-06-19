module nodecachinglinkedlist

open util/integer

one sig Null {}

abstract sig Node {}

one sig N0 extends Node {}

one sig N1 extends Node {}

one sig N2 extends Node {}

abstract sig NodeValue {}

one sig V1 extends NodeValue {}

abstract sig NodeCachingLinkedList {}

one sig L0,L1 extends NodeCachingLinkedList {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

pred sourceRepOK [
    thizPre: NodeCachingLinkedList,
	thiz: NodeCachingLinkedList,
	header: NodeCachingLinkedList ->one (Node + Null),
	size: NodeCachingLinkedList ->one Int,
	modCount: NodeCachingLinkedList ->one Int,
	firstCachedNode: NodeCachingLinkedList ->one (Node + Null),
	cacheSize: NodeCachingLinkedList ->one Int, 
	maximumCacheSize: NodeCachingLinkedList ->one Int,
	previous: Node ->one (Node + Null),
	next: Node ->one (Node + Null),
	value: Node -> one (NodeValue+Null)] {
	thizPre != thiz
}

-- Invariant to be learned
pred repOK[
    thizPre: NodeCachingLinkedList,
	thiz: NodeCachingLinkedList,
	header: NodeCachingLinkedList ->one (Node + Null),
	size: NodeCachingLinkedList ->one Int,
	modCount: NodeCachingLinkedList ->one Int,
	firstCachedNode: NodeCachingLinkedList ->one (Node + Null),
	cacheSize: NodeCachingLinkedList ->one Int, 
	maximumCacheSize: NodeCachingLinkedList ->one Int,
	previous: Node ->one (Node + Null),
	next: Node ->one (Node + Null),
	value: Node -> one (NodeValue+Null)] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[
    thizPre: NodeCachingLinkedList,
	thiz: NodeCachingLinkedList,
	header: NodeCachingLinkedList ->one (Node + Null),
	size: NodeCachingLinkedList ->one Int,
	modCount: NodeCachingLinkedList ->one Int,
	firstCachedNode: NodeCachingLinkedList ->one (Node + Null),
	cacheSize: NodeCachingLinkedList ->one Int, 
	maximumCacheSize: NodeCachingLinkedList ->one Int,
	previous: Node ->one (Node + Null),
	next: Node ->one (Node + Null),
	value: Node -> one (NodeValue+Null)] {
	repOK[thizPre, thiz, header, size, modCount, firstCachedNode, cacheSize, maximumCacheSize, previous, next, value] and 
	not sourceRepOK [thizPre, thiz, header, size, modCount, firstCachedNode, cacheSize, maximumCacheSize, previous, next, value]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[
    thizPre: NodeCachingLinkedList,
	thiz: NodeCachingLinkedList,
	header: NodeCachingLinkedList ->one (Node + Null),
	size: NodeCachingLinkedList ->one Int,
	modCount: NodeCachingLinkedList ->one Int,
	firstCachedNode: NodeCachingLinkedList ->one (Node + Null),
	cacheSize: NodeCachingLinkedList ->one Int, 
	maximumCacheSize: NodeCachingLinkedList ->one Int,
	previous: Node ->one (Node + Null),
	next: Node ->one (Node + Null),
	value: Node -> one (NodeValue+Null)] {
	not repOK[thizPre, thiz, header, size, modCount, firstCachedNode, cacheSize, maximumCacheSize, previous, next, value] and 
	sourceRepOK [thizPre, thiz, header, size, modCount, firstCachedNode, cacheSize, maximumCacheSize, previous, next, value]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
