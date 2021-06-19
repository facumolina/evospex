module inttreeset

open util/integer

one sig Null {}

abstract sig Range {}

one sig R0 extends Range {}

one sig R1 extends Range {}

one sig R2 extends Range {}

abstract sig IntTree {}

one sig I0,I1 extends IntTree {}

abstract sig IntTreeSet {}

one sig T0,T1 extends IntTreeSet {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

-- Operational invariant after the semantics preserving translation
pred sourceRepOK [
    thizPre: IntTreeSet,
    thiz: IntTreeSet,
    tree: IntTreeSet -> one (IntTree + Null),
    size: IntTreeSet -> one Int,
    root: IntTree -> one (Range + Null),
    parent: Range -> one (Range + Null),
    left: Range -> one (Range + Null),
    right: Range -> one (Range + Null),
    key: Range -> one Int,
    min: Range -> one Int,
    color: Range -> one boolean] {
    thizPre != thiz
}

-- Invariant to be learned
pred repOK[
    thizPre: IntTreeSet,
    thiz: IntTreeSet,
    tree: IntTreeSet -> one (IntTree + Null),
    size: IntTreeSet -> one Int,
    root: IntTree -> one (Range + Null),
    parent: Range -> one (Range + Null),
    left: Range -> one (Range + Null),
    right: Range -> one (Range + Null),
    key: Range -> one Int,
    min: Range -> one Int,
    color: Range -> one boolean] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[
    thizPre: IntTreeSet,
    thiz: IntTreeSet,
    tree: IntTreeSet -> one (IntTree + Null),
    size: IntTreeSet -> one Int,
    root: IntTree -> one (Range + Null),
    parent: Range -> one (Range + Null),
    left: Range -> one (Range + Null),
    right: Range -> one (Range + Null),
    key: Range -> one Int,
    min: Range -> one Int,
    color: Range -> one boolean] {
    repOK[thizPre, thiz, tree, size, root, parent, left, right, key, min, color] and 
    not sourceRepOK [thizPre, thiz, tree, size, root, parent, left, right, key, min, color]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[
    thizPre: IntTreeSet,
    thiz: IntTreeSet,
    tree: IntTreeSet -> one (IntTree + Null),
    size: IntTreeSet -> one Int,
    root: IntTree -> one (Range + Null),
    parent: Range -> one (Range + Null),
    left: Range -> one (Range + Null),
    right: Range -> one (Range + Null),
    key: Range -> one Int,
    min: Range -> one Int,
    color: Range -> one boolean] {
    not repOK[thizPre, thiz, tree, size, root, parent, left, right, key, min, color] and 
    sourceRepOK [thizPre, thiz, tree, size, root, parent, left, right, key, min, color]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
