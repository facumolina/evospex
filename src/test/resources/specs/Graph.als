module graph

open util/integer

one sig Null {}

abstract sig Graph {}
abstract sig Edge {}
abstract sig Map_Integer_Integer {}

one sig G0,G1 extends Graph {}
one sig M0 extends Map_Integer_Integer {}
one sig E0 extends Edge {}

pred sourceRepOK [
    thizPre: Graph,
    thiz: Graph,
    _var2957: Graph -> one (Map_Integer_Integer + Null),
    src: Edge -> one Int,
    dst: Edge -> one Int] {
    thizPre != thiz
}

pred repOK[
    thizPre: Graph,
    thiz: Graph,
    _var2957: Graph -> one (Map_Integer_Integer + Null),
    src: Edge -> one Int,
    dst: Edge -> one Int] {
--repOKBody
}

pred NegativeCounterExample[
    thizPre: Graph,
    thiz: Graph,
    _var2957: Graph -> one (Map_Integer_Integer + Null),
    src: Edge -> one Int,
    dst: Edge -> one Int] {
    repOK[thizPre, thiz, _var2957, src, dst] and 
    not sourceRepOK [thizPre, thiz, _var2957, src, dst]
}

pred PositiveCounterExample[
    thizPre: Graph,
    thiz: Graph,
    _var2957: Graph -> one (Map_Integer_Integer + Null),
    src: Edge -> one Int,
    dst: Edge -> one Int] {
    not repOK[thizPre, thiz, _var2957, src, dst] and 
    sourceRepOK [thizPre, thiz, _var2957, src, dst]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
