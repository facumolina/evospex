module intset

open util/integer

one sig Null {}

abstract sig IntSet {}
one sig I0,I1 extends IntSet {}

abstract sig Map_Integer_Boolean {}
one sig M0 extends Map_Integer_Boolean {}

pred sourceRepOK [
    thizPre: IntSet,
    thiz: IntSet,
    _var529: IntSet -> one Int,
    _var532: IntSet -> one (Map_Integer_Boolean + Null)] {
    thizPre != thiz
}

pred repOK[
    thizPre: IntSet,
    thiz: IntSet,
    _var529: IntSet -> one Int,
    _var532: IntSet -> one (Map_Integer_Boolean + Null)] {
--repOKBody
}

pred NegativeCounterExample[
    thizPre: IntSet,
    thiz: IntSet,
    _var529: IntSet -> one Int,
    _var532: IntSet -> one (Map_Integer_Boolean + Null)] {
    repOK[thizPre, thiz, _var529, _var532] and 
    not sourceRepOK [thizPre, thiz, _var529, _var532]
}

pred PositiveCounterExample[
    thizPre: IntSet,
    thiz: IntSet,
    _var529: IntSet -> one Int,
    _var532: IntSet -> one (Map_Integer_Boolean + Null)] {
    not repOK[thizPre, thiz, _var529, _var532] and 
    sourceRepOK [thizPre, thiz, _var529, _var532]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
