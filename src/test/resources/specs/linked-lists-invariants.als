one sig Null { }

abstract sig Node { }

one sig N0, N1, N2, N3 extends Node { }

abstract sig List { }

one sig L0 extends List { }

pred repOK[thiz: List, 
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

one sig negativeOne {
        thiz: List,
        head: List -> one (Node+Null),
    next: Node -> one (Node+Null),
    size: List -> one Int
}

fact {
        negativeOne.thiz = L0 
        negativeOne.head = (L0 -> Null)
    -- no positiveOne.next
    (L0 -> 0) in negativeOne.size
}

assert NegOne {
        repOK[negativeOne.thiz, negativeOne.head, negativeOne.next, negativeOne.size]
}

check NegOne for 5 expect 1


one sig negativeTwo {
        thiz: List,
        head: List -> one (Node+Null),
    next: Node -> one (Node+Null),
    size: List -> one Int
}

fact {
        negativeTwo.thiz = L0 
        negativeTwo.head = (L0 -> N0)
    (N0->N0) in negativeTwo.next
    (L0 -> 1) in negativeTwo.size
}

assert NegTwo {
        repOK[negativeTwo.thiz, negativeTwo.head, negativeTwo.next, negativeTwo.size]
}

check NegTwo for 5 expect 1

one sig negativeThree {
		thiz: List,
		head: List -> one (Node+Null),
		next: Node -> one (Node+Null),
		size: List -> one Int 
}

fact {
		negativeThree.thiz = L0
		negativeThree.head = (L0 -> N0)
		((N0->N1)+(N1->N2)+(N2->N3)+(N3->N0)) in negativeThree.next
		(L0 -> 3) in negativeThree.size
}

assert NegThree {
		repOK[negativeThree.thiz, negativeThree.head, negativeThree.next, negativeThree.size]
}

check NegThree for 5 expect 1

one sig negativeFour {
		thiz: List,
		head: List -> one (Node+Null),
		next: Node -> one (Node+Null),
		size: List -> one Int 
}

fact {
		negativeFour.thiz = L0
		negativeFour.head = (L0 -> N0)
		((N0->N1)+(N1->N2)+(N2->Null)) in negativeFour.next
		(L0 -> 3) in negativeFour.size
}

assert NegFour {
		repOK[negativeFour.thiz, negativeFour.head, negativeFour.next, negativeFour.size]
}

check NegFour for 5 expect 1

one sig PositiveOne {
        thiz: List,
        head: List -> one (Node+Null),
    next: Node -> one (Node+Null),
    size: List -> one Int
}

fact {
        PositiveOne.thiz = L0 
        PositiveOne.head = (L0 -> N0)
    ((N0->N1)+(N1->Null)) in PositiveOne.next
    (L0 -> 1) in PositiveOne.size
}

assert PosOne {
        repOK[PositiveOne.thiz, PositiveOne.head, PositiveOne.next, PositiveOne.size]
}

check PosOne for 5 expect 0

one sig PositiveTwo {
        thiz: List,
        head: List -> one (Node+Null),
    next: Node -> one (Node+Null),
    size: List -> one Int
}

fact {
        PositiveTwo.thiz = L0 
        PositiveTwo.head = (L0 -> N0)
    (N0->Null) in PositiveTwo.next
    (L0 -> 0) in PositiveTwo.size
}

assert PosTwo {
        repOK[PositiveTwo.thiz, PositiveTwo.head, PositiveTwo.next, PositiveTwo.size]
}

check PosTwo for 5 expect 0


one sig PositiveThree {
       thiz: List,
		head: List -> one (Node+Null),
		next: Node -> one (Node+Null),
		size: List -> one Int
}

fact {
		PositiveThree.thiz = L0 
       PositiveThree.head = (L0 -> N0)
    	((N0->N1)+(N1->N2)+(N2->N3)+(N3->Null)) in PositiveThree.next
    	(L0 -> 3) in PositiveThree.size
}

assert PosThree {
        repOK[PositiveThree.thiz, PositiveThree.head, PositiveThree.next, PositiveThree.size]
}

check PosThree for 5 expect 0

