open util/integer

one sig Null { }

abstract sig Node { }

one sig N0,N1,N2 extends Node { }

abstract sig List { }

one sig L0 extends List {}


pred catalog [
	thiz: List, 
   head: List -> one (Node+Null),
   next: Node -> one (Node+Null),
   size: List -> one Int
] {
	
	(all n: thiz.head.*next | not (n in n.^next)) and	
	(some n: thiz.head.*next | n.next = thiz.head) and
	(some (thiz.head & Node)) and
	(gte[thiz.size, 0]) and
	(gte[thiz.size, 1]) and
	(lte[thiz.size, 0]) and
	(lte[thiz.size, 1]) and
	(eq[thiz.size, #(thiz.head.*next - Null)]) and
	(eq[thiz.size, #(thiz.head.*next)]) and
	(eq[thiz.size, add[#(thiz.head.*next - Null),1]]) and
	(eq[thiz.size, sub[#(thiz.head.*next - Null),1]]) 

}
 
pred repOK[
	thiz: List, 
   head: List -> one (Node+Null),
   next: Node -> one (Node+Null),
   size: List -> one Int
] {
--repOKBody
}

pred repOKOK[
	thiz: List, 
 	head: List -> one (Node+Null),
	next: Node -> one (Node+Null),
	size: List -> one Int
] {
	
	(all n: thiz.head.*next | not (n in n.^next)) and
	(some (thiz.head & Node)) and
   	(gte[thiz.size, 0]) and
	(eq[thiz.size, sub[#(thiz.head.*next - Null),1]]) 

}

pred SimmetryBreaking[
	thiz: List, 
   head: List -> one (Node+Null),
   next: Node -> one (Node+Null),
   size: List -> one Int
] {
	head in ((L0->Null) + (L0 -> N0))
	next in ((N0 -> Null)+(N0->N0)+(N0->N1)+(N1->Null)+(N1->N0)+(N1->N1)+(N1->N2)+(N2->Null)
	+(N2->N1)+(N2->N0)+(N2->N2))
	all n : Node - thiz.head.*next | n.next = Null
}

pred NegativeCounterExample[
	thiz: List, 
   head: List -> one (Node+Null),
   next: Node -> one (Node+Null),
   size: List -> one Int
] {
	SimmetryBreaking[thiz,head,next,size] and repOK[thiz,head,next,size] and not repOKOK[thiz,head,next,size]
}

pred PositiveCounterExample[
	thiz: List, 
   head: List -> one (Node+Null),
   next: Node -> one (Node+Null),
   size: List -> one Int
] {
	SimmetryBreaking[thiz,head,next,size] and  repOKOK[thiz,head,next,size] and not repOK[thiz,head,next,size]
}

run NegativeCounterExample for 3 but 5 int
run PositiveCounterExample for 3 but 5 int
