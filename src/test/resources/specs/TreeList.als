module treelist

open util/integer

one sig Null {}

abstract sig AVLNode {}

one sig N0 extends AVLNode {}

one sig N1 extends AVLNode {}

one sig N2 extends AVLNode {}

abstract sig NodeValue {}

one sig V1,V2,V3 extends NodeValue {}

abstract sig TreeList {}

one sig T0,T1 extends TreeList {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

-- Operational invariant after the semantics preserving translation
pred sourceRepOK [
    thizPre: TreeList,
    thiz: TreeList,
    root: TreeList -> one (AVLNode + Null),
    size: TreeList -> one Int,
    left: AVLNode -> one (AVLNode + Null),
    leftIsPrevious: AVLNode -> one boolean,
    right: AVLNode -> one (AVLNode + Null),
    rightIsNext: AVLNode -> one boolean,
    height: AVLNode -> one Int,
    relativePosition: AVLNode -> one Int,
    value: AVLNode -> one (NodeValue+Null)] {
    thizPre != thiz
}

-- Invariant to be learned
pred repOK[
    thizPre: TreeList,
    thiz: TreeList,
    root: TreeList -> one (AVLNode + Null),
    size: TreeList -> one Int,
    left: AVLNode -> one (AVLNode + Null),
    leftIsPrevious: AVLNode -> one boolean,
    right: AVLNode -> one (AVLNode + Null),
    rightIsNext: AVLNode -> one boolean,
    height: AVLNode -> one Int,
    relativePosition: AVLNode -> one Int,
    value: AVLNode -> one (NodeValue+Null)] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[
    thizPre: TreeList,
    thiz: TreeList,
    root: TreeList -> one (AVLNode + Null),
    size: TreeList -> one Int,
    left: AVLNode -> one (AVLNode + Null),
    leftIsPrevious: AVLNode -> one boolean,
    right: AVLNode -> one (AVLNode + Null),
    rightIsNext: AVLNode -> one boolean,
    height: AVLNode -> one Int,
    relativePosition: AVLNode -> one Int,
    value: AVLNode -> one (NodeValue+Null)] {
    repOK[thizPre, thiz, root, size, left, leftIsPrevious, right, rightIsNext, height, relativePosition, value] and 
    not sourceRepOK [thizPre, thiz, root, size, left, leftIsPrevious, right, rightIsNext, height, relativePosition, value]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[
    thizPre: TreeList,
    thiz: TreeList,
    root: TreeList -> one (AVLNode + Null),
    size: TreeList -> one Int,
    left: AVLNode -> one (AVLNode + Null),
    leftIsPrevious: AVLNode -> one boolean,
    right: AVLNode -> one (AVLNode + Null),
    rightIsNext: AVLNode -> one boolean,
    height: AVLNode -> one Int,
    relativePosition: AVLNode -> one Int,
    value: AVLNode -> one (NodeValue+Null)] {
    not repOK[thizPre, thiz, root, size, left, leftIsPrevious, right, rightIsNext, height, relativePosition, value] and 
    sourceRepOK [thizPre, thiz, root, size, left, leftIsPrevious, right, rightIsNext, height, relativePosition, value]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
