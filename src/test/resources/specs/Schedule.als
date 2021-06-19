module schedule

open util/integer

one sig Null {}

abstract sig Job {}

one sig J0 extends Job {}

one sig J1 extends Job {}

one sig J2 extends Job {}

abstract sig List {}

one sig L0 extends List {}

one sig L1 extends List {}

one sig L2 extends List {}

abstract sig Schedule {}

one sig S0,S1 extends Schedule {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

-- Operational invariant after the semantics preserving translation
pred sourceRepOK [
    thizPre: Schedule,
    thiz: Schedule,
    MAXPRIO: Schedule -> one Int,
    allocProcNum: Schedule -> one Int,
    numProcesses: Schedule -> one Int,
    curProc: Schedule -> one (Job + Null),
    prioQueue1: Schedule -> one (List+Null),
    prioQueue2: Schedule -> one (List+Null),
    prioQueue3: Schedule -> one (List+Null),
    next: Job -> one (Job + Null),
    prev: Job -> one (Job + Null),
    priority: Job -> one Int,
    first: List -> one (Job + Null),
    last: List -> one (Job+Null)] {
    thizPre != thiz 
    and
    (all n: thiz.curProc.*(next+prev) | n != n.next)
    and
    prioQueue1 != prioQueue2
    and
    prioQueue1 != prioQueue3
    and
    prioQueue2 != prioQueue3
    and
    (all n: thiz.prioQueue1.first.*(next+prev) | n !in thiz.prioQueue2.first.*(next+prev))
    and
    (all n: thiz.prioQueue1.first.*(next+prev) | n !in thiz.prioQueue3.first.*(next+prev))
    and
    (all n: thiz.prioQueue2.first.*(next+prev) | n !in thiz.prioQueue3.first.*(next+prev))
}

-- Invariant to be learned
pred repOK[
    thizPre: Schedule,
    thiz: Schedule,
    MAXPRIO: Schedule -> one Int,
    allocProcNum: Schedule -> one Int,
    numProcesses: Schedule -> one Int,
    curProc: Schedule -> one (Job + Null),
    prioQueue1: Schedule -> one (List+Null),
    prioQueue2: Schedule -> one (List+Null),
    prioQueue3: Schedule -> one (List+Null),
    next: Job -> one (Job + Null),
    prev: Job -> one (Job + Null),
    priority: Job -> one Int,
    first: List -> one (Job + Null),
    last: List -> one (Job+Null)] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[
    thizPre: Schedule,
    thiz: Schedule,
    MAXPRIO: Schedule -> one Int,
    allocProcNum: Schedule -> one Int,
    numProcesses: Schedule -> one Int,
    curProc: Schedule -> one (Job + Null),
    prioQueue1: Schedule -> one (List+Null),
    prioQueue2: Schedule -> one (List+Null),
    prioQueue3: Schedule -> one (List+Null),
    next: Job -> one (Job + Null),
    prev: Job -> one (Job + Null),
    priority: Job -> one Int,
    first: List -> one (Job + Null),
    last: List -> one (Job+Null)] {
    repOK[thizPre, thiz, MAXPRIO, allocProcNum, numProcesses, curProc, prioQueue1, prioQueue2, prioQueue3, next, prev, priority, first, last] and 
    not sourceRepOK [thizPre, thiz, MAXPRIO, allocProcNum, numProcesses, curProc, prioQueue1, prioQueue2, prioQueue3, next, prev, priority, first, last]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[
    thizPre: Schedule,
    thiz: Schedule,
    MAXPRIO: Schedule -> one Int,
    allocProcNum: Schedule -> one Int,
    numProcesses: Schedule -> one Int,
    curProc: Schedule -> one (Job + Null),
    prioQueue1: Schedule -> one (List+Null),
    prioQueue2: Schedule -> one (List+Null),
    prioQueue3: Schedule -> one (List+Null),
    next: Job -> one (Job + Null),
    prev: Job -> one (Job + Null),
    priority: Job -> one Int,
    first: List -> one (Job + Null),
    last: List -> one (Job+Null)] {
    not repOK[thizPre, thiz, MAXPRIO, allocProcNum, numProcesses, curProc, prioQueue1, prioQueue2, prioQueue3, next, prev, priority, first, last] and 
    sourceRepOK [thizPre, thiz, MAXPRIO, allocProcNum, numProcesses, curProc, prioQueue1, prioQueue2, prioQueue3, next, prev, priority, first, last]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
