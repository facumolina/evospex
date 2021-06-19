module interval

open util/integer

one sig Null {}

abstract sig Interval {}
one sig I0,I1 extends Interval {}

abstract sig Double {}
one sig D0 extends Double {}

-- Operational invariant after the semantics preserving translation
pred sourceRepOK [
    thizPre: Interval,
    thiz: Interval,
    lower: Interval -> Double,
    upper: Interval -> Double] {
    thizPre != thiz
}

-- Invariant to be learned
pred repOK[
    thizPre: Interval,
    thiz: Interval,
    lower: Interval -> Double,
    upper: Interval -> Double] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[
    thizPre: Interval,
    thiz: Interval,
    lower: Interval -> Double,
    upper: Interval -> Double] {
    repOK[thizPre, thiz, lower, upper] and 
    not sourceRepOK [thizPre, thiz, lower, upper]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[
    thizPre: Interval,
    thiz: Interval,
    lower: Interval -> Double,
    upper: Interval -> Double] {
    not repOK[thizPre, thiz, lower, upper] and 
    sourceRepOK [thizPre, thiz, lower, upper]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
