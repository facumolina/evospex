module wordbag

open util/integer

one sig Null {}

abstract sig WordBag {}
one sig W0,W1 extends WordBag {}

abstract sig boolean {}
one sig true extends boolean {}
one sig false extends boolean {}

-- Dummy invariant
pred sourceRepOK [
    thizPre: WordBag,
    thiz: WordBag,
    _var307: WordBag -> one Int,
    _var405: WordBag -> one boolean] {
    thizPre != thiz
}

-- Invariant to be learned
pred repOK[
    thizPre: WordBag,
    thiz: WordBag,
    _var307: WordBag -> one Int,
    _var405: WordBag -> one boolean] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[
    thizPre: WordBag,
    thiz: WordBag,
    _var307: WordBag -> one Int,
    _var405: WordBag -> one boolean] {
    repOK[thizPre, thiz, _var307, _var405] and 
    not sourceRepOK [thizPre, thiz, _var307, _var405]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[
    thizPre: WordBag,
    thiz: WordBag,
    _var307: WordBag -> one Int,
    _var405: WordBag -> one boolean] {
    not repOK[thizPre, thiz, _var307, _var405] and 
    sourceRepOK [thizPre, thiz, _var307, _var405]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
