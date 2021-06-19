module avltreelist

open util/integer

one sig Null {}
one sig EMPTY_LEAF {}

abstract sig Node {}

one sig N0,N1,N2 extends Node {}

abstract sig NodeValue {}

one sig V1,V2,V3 extends NodeValue {}

abstract sig AvlTreeList {}

one sig T0,T1,T2 extends AvlTreeList {}


-- Operational invariant after the semantics preserving translation
pred sourceRepOK [
    thizPre: AvlTreeList,
    thiz: AvlTreeList,
    root: AvlTreeList -> one (Node+Null+EMPTY_LEAF),
    value: Node -> one (NodeValue+Null),
    height: Node -> one Int,
    size: Node -> one Int,
    left: Node -> one (Node + Null + EMPTY_LEAF),
    right: Node -> one (Node + Null + EMPTY_LEAF)] {
    thizPre != thiz
}

-- Invariant to be learned
pred repOK[
    thizPre: AvlTreeList,
    thiz: AvlTreeList,
    root: AvlTreeList -> one (Node+Null+EMPTY_LEAF),
    value: Node -> one (NodeValue+Null),
    height: Node -> one Int,
    size: Node -> one Int,
    left: Node -> one (Node + Null + EMPTY_LEAF),
    right: Node -> one (Node + Null + EMPTY_LEAF)] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[
    thizPre: AvlTreeList,
    thiz: AvlTreeList,
    root: AvlTreeList -> one (Node+Null+EMPTY_LEAF),
    value: Node -> one (NodeValue+Null),
    height: Node -> one Int,
    size: Node -> one Int,
    left: Node -> one (Node + Null + EMPTY_LEAF),
    right: Node -> one (Node + Null + EMPTY_LEAF)] {
    repOK[thizPre, thiz, root, value, height, size, left, right] and 
    not sourceRepOK [thizPre, thiz, root, value, height, size, left, right]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[
    thizPre: AvlTreeList,
    thiz: AvlTreeList,
    root: AvlTreeList -> one (Node+Null+EMPTY_LEAF),
    value: Node -> one (NodeValue+Null),
    height: Node -> one Int,
    size: Node -> one Int,
    left: Node -> one (Node + Null + EMPTY_LEAF),
    right: Node -> one (Node + Null + EMPTY_LEAF)] {
    not repOK[thizPre, thiz, root, value, height, size, left, right] and 
    sourceRepOK [thizPre, thiz, root, value, height, size, left, right]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
