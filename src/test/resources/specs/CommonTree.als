module commontree

open util/integer

one sig Null {}

abstract sig Collection_CommonTree {}
one sig L0 extends Collection_CommonTree {}

abstract sig CommonToken {}

one sig T0 extends CommonToken {}

one sig T1 extends CommonToken {}

one sig T2 extends CommonToken {}

abstract sig CommonTree {}

one sig CT0,CT1 extends CommonTree {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

-- Operational invariant after the semantics preserving translation
pred sourceRepOK [
    thizPre: CommonTree,
    thiz: CommonTree,
    children: CommonTree -> one (Collection_CommonTree+Null),
    token: CommonTree -> one (CommonToken + Null),
    startIndex: CommonTree -> one Int,
    stopIndex: CommonTree -> one Int,
    parent: CommonTree -> one (CommonTree + Null),
    childIndex: CommonTree -> one Int] {
    thizPre != thiz 
    and
    (thiz.token != Null)
}

-- Invariant to be learned
pred repOK[
    thizPre: CommonTree,
    thiz: CommonTree,
    children: CommonTree -> one (Collection_CommonTree+Null),
    token: CommonTree -> one (CommonToken + Null),
    startIndex: CommonTree -> one Int,
    stopIndex: CommonTree -> one Int,
    parent: CommonTree -> one (CommonTree + Null),
    childIndex: CommonTree -> one Int] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[
    thizPre: CommonTree,
    thiz: CommonTree,
    children: CommonTree -> one (Collection_CommonTree+Null),
    token: CommonTree -> one (CommonToken + Null),
    startIndex: CommonTree -> one Int,
    stopIndex: CommonTree -> one Int,
    parent: CommonTree -> one (CommonTree + Null),
    childIndex: CommonTree -> one Int] {
    repOK[thizPre, thiz, children, token, startIndex, stopIndex, parent, childIndex] and 
    not sourceRepOK [thizPre, thiz, children, token, startIndex, stopIndex, parent, childIndex]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[
    thizPre: CommonTree,
    thiz: CommonTree,
    children: CommonTree -> one (Collection_CommonTree+Null),
    token: CommonTree -> one (CommonToken + Null),
    startIndex: CommonTree -> one Int,
    stopIndex: CommonTree -> one Int,
    parent: CommonTree -> one (CommonTree + Null),
    childIndex: CommonTree -> one Int] {
    not repOK[thizPre, thiz, children, token, startIndex, stopIndex, parent, childIndex] and 
    sourceRepOK [thizPre, thiz, children, token, startIndex, stopIndex, parent, childIndex]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
