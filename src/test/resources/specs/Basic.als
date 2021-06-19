module basic

open util/integer

one sig Null {}

abstract sig Basic {}
abstract sig Collection_Integer {}
abstract sig Map_Integer_Boolean {}

one sig B0,B1 extends Basic {}
one sig C0 extends Collection_Integer {}
one sig M0 extends Map_Integer_Boolean {}

pred sourceRepOK [
    thizPre: Basic,
    thiz: Basic,
    _var23: Basic -> one (Collection_Integer + Null),
    _var444: Basic -> one (Map_Integer_Boolean + Null),
    _var10459: Basic -> one (Map_Integer_Boolean + Null)]{
    thizPre != thiz
}

pred repOK[
    thizPre: Basic,
    thiz: Basic,
    _var23: Basic -> one (Collection_Integer + Null),
    _var444: Basic -> one (Map_Integer_Boolean + Null),
    _var10459: Basic -> one (Map_Integer_Boolean + Null)] {
--repOKBody
}

pred NegativeCounterExample[
    thizPre: Basic,
    thiz: Basic,
    _var23: Basic -> one (Collection_Integer + Null),
    _var444: Basic -> one (Map_Integer_Boolean + Null),
    _var10459: Basic -> one (Map_Integer_Boolean + Null)] {
    repOK[thizPre, thiz,  _var23, _var444, _var10459] and 
    not sourceRepOK [thizPre, thiz,  _var23, _var444, _var10459]
}

pred PositiveCounterExample[
    thizPre: Basic,
    thiz: Basic,
    _var23: Basic -> one (Collection_Integer + Null),
    _var444: Basic -> one (Map_Integer_Boolean + Null),
    _var10459: Basic -> one (Map_Integer_Boolean + Null)] {
    not repOK[thizPre, thiz,  _var23, _var444, _var10459] and 
    sourceRepOK [thizPre, thiz,  _var23, _var444, _var10459]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
