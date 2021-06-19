module linkedListRepOk

open util/integer

one sig Null {}

abstract sig Node {}

one sig N0 extends Node {}

one sig N1 extends Node {}

one sig N2 extends Node {}

abstract sig List {}

one sig L0 extends List {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

one sig QF {
	current_0: one Node + Null, 
	current_1: one Node + Null, 
	current_2: one Node + Null, 
	current_3: one Node + Null,
	current_4: one Node + Null, 	 	
	nodesToVisit_0: one Int, 
	nodesToVisit_1: one Int, 
	nodesToVisit_2: one Int, 
	nodesToVisit_3: one Int,
	nodesToVisit_4: one Int
}

fact {
	QF.current_0=Null and
	QF.nodesToVisit_0=0 
}

-- Symmetry Breaking predicate
pred symmetryBreaking[header_0: List ->one (Node + Null), next_0: Node ->one (Node + Null)] {
	(header_0 in ((L0->Null)+(L0->N0))) and
	(next_0 in (N0->Null)+(N0->N0)+(N0->N1)+(N1->Null)+(N1->N0)+(N1->N1)+(N1->N2)+(N2->Null)+(N2->N0)+(N2->N1)+(N2->N2)) and
	(all n: Node - List.header_0.*next_0 | n.next_0 = Null)
}

-- Data structure positive examples
pred sourcePosRepOK [thiz: List, header: List ->one (Node + Null), size: List ->one Int, next: Node ->one (Node + Null)] {
	(thiz.header=Null and thiz.size=0) or
	(thiz.header=N0 and N0.next=Null and thiz.size=1) or
	(thiz.header=N0 and N0.next=N1 and N1.next=N2 and N2.next=Null and thiz.size=3) 
}

-- Data structure negative examples
pred sourceNegRepOK [thiz: List, header: List ->one (Node + Null), size: List ->one Int, next: Node ->one (Node + Null)] {
	(thiz.header=Null and thiz.size=2) or
	(thiz.header=N0 and N0.next=N1 and N1.next=N0 and thiz.size=2)
}

-- Invariant to be learned
pred repOK[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
--repOKBody
}

-- Negative counterexamples predicate
pred NegativeCounterExample[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
	symmetryBreaking[header_0, next_0] and repOK[thiz, header_0, size_0, next_0] and sourceNegRepOK [thiz, header_0, size_0, next_0]
}

-- Positive counterexamples predicate
pred PositiveCounterExample[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
	symmetryBreaking[header_0, next_0] and not repOK[thiz, header_0, size_0, next_0] and sourcePosRepOK [thiz, header_0, size_0, next_0] 
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
