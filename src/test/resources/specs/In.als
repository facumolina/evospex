module incozy

open util/integer

one sig Null {}

abstract sig In {}
one sig I0,I1 extends In {}

abstract sig Map_Integer_Boolean {}
one sig M0 extends Map_Integer_Boolean {}

pred sourceRepOK [
    thizPre: In,
    thiz: In,
    var_390: In -> one (Map_Integer_Boolean + Null)]{
    thizPre != thiz
}

pred repOK[
    thizPre: In,
    thiz: In,
    _var390: In -> one (Map_Integer_Boolean + Null)] {
--repOKBody
}

pred NegativeCounterExample[
    thizPre: In,
    thiz: In,
    _var390: In -> one (Map_Integer_Boolean + Null)] {
    repOK[thizPre, thiz,  _var390] and 
    not sourceRepOK [thizPre, thiz, _var390]
}

pred PositiveCounterExample[
    thizPre: In,
    thiz: In,
    _var390: In -> one (Map_Integer_Boolean + Null)] {
    not repOK[thizPre, thiz, _var390] and 
    sourceRepOK [thizPre, thiz, _var390]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
