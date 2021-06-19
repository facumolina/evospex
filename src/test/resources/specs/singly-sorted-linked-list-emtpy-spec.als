one sig Null { }

abstract sig Node { }

one sig N0,N1,N2 extends Node { }

abstract sig List { }

one sig L0 extends List {}
 
pred repOK[
   thiz: List, 
   head: List -> one (Node+Null),
   next: Node -> one (Node+Null),
   element: Node -> one Int,
   size: List -> one Int
] {
	--(all n: thiz.head.*next | not (n in n.^next)) and
	--(some (thiz.head & Node)) and
	--(eq[thiz.size, sub[#(thiz.head.*next),add[1,1]]])
}

pred repOKOK[
	thiz: List, 
 	head: List -> one (Node+Null),
	next: Node -> one (Node+Null),
	element: Node -> one Int,
	size: List -> one Int
] {
	
	(all n: thiz.head.*next | not (n in n.^next)) 
	and eq[#(thiz.head.*next - Null),thiz.size] 
	and (all n: thiz.head.*next | lte[n.element,n.next.element])
}

pred repOKOKSim[
	thiz: List, 
 	head: List -> one (Node+Null),
	next: Node -> one (Node+Null),
	element: Node -> one Int,
	size: List -> one Int
] {
	repOKOK[thiz,head,next,element,size]
	and SimmetryBreaking[thiz,head,next,element,size]
}

run repOKOKSim for 3 but 3 Int


pred SimmetryBreaking[
	thiz: List, 
   	head: List -> one (Node+Null),
   	next: Node -> one (Node+Null),
	element: Node -> one Int,
   	size: List -> one Int
] {
	head in ((L0->Null) + (L0 -> N0))
	next in ((N0 -> Null)+(N0->N0)+(N0->N1)+(N1->Null)+(N1->N0)+(N1->N1)+(N1->N2)+(N2->Null)
	+(N2->N1)+(N2->N0)+(N2->N2))
	all n : Node - thiz.head.*next | n.next = Null and eq[n.element,0]
	
}


/*pred RemoveUnrecheableNodes[
	thiz: List, 
   	head: List -> one (Node+Null),
   	next: Node -> one (Node+Null)
] {
	all n: Node | (! n in thiz.head.*next) => (n -> Null) in next
}*/

pred NegativeCounterExample[
	thiz: List, 
   	head: List -> one (Node+Null),
   	next: Node -> one (Node+Null),
	element: Node -> one Int,
   	size: List -> one Int
] {
	SimmetryBreaking[thiz,head,next,element,size] and repOK[thiz,head,next,element,size] and not repOKOK[thiz,head,next,element,size]
--	SimmetryBreaking[thiz,head,next] and repOK[thiz,head,next] and not repOKOK[thiz,head,next]
}

pred PositiveCounterExample[
	thiz: List, 
   	head: List -> one (Node+Null),
   	next: Node -> one (Node+Null),
	element: Node -> one Int,
   	size: List -> one Int
] {
	SimmetryBreaking[thiz,head,next,element,size] and  repOKOK[thiz,head,next,element,size] and not repOK[thiz,head,next,element,size]
	--SimmetryBreaking[thiz,head,next] and  repOKOK[thiz,head,next] and not repOK[thiz,head,next]
}

run PositiveCounterExample for 3 but 5 Int
run NegativeCounterExample for 3 but 5 Int
