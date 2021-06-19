module apachelist

open util/integer

one sig null {}

abstract sig ApacheList {}
one sig L0 extends ApacheList {}

abstract sig ApacheListNode  {}

one sig N0,N1,N2,N3 extends ApacheListNode {}

pred repOK[ thiz:      one ApacheList+null,
            head:      ApacheList     -> one(ApacheListNode+null),
            size:      ApacheList     -> one(Int),
            next:      ApacheListNode -> lone(ApacheListNode+null),
            prev:      ApacheListNode -> lone(ApacheListNode+null)
]{ 
	(thiz.head!=null) and
  (all n: thiz.head.*next | not (n in n.^next)) and
  (all n: thiz.head.*next | not (n in n.^prev)) and
	(all n: thiz.head.*next | (n!=null && n.prev!=null implies n.prev.next=n) ) and
  (all n: thiz.head.*next | (n!=null && n.next!=null implies n.next.prev=n) ) and
	(thiz.size=sub[#(thiz.head.*next),1]) and
	(gte[thiz.size,0]) and
  (gte[thiz.size,1])
}


one sig negativeTwo {
    thiz:      one ApacheList+null,
    head:      ApacheList     -> one(ApacheListNode+null),
    size:      ApacheList     -> one(Int),
    next:      ApacheListNode -> lone(ApacheListNode+null),
    prev:      ApacheListNode -> lone(ApacheListNode+null)
}

fact {
    negativeTwo.thiz = L0 
    negativeTwo.head = (L0 -> N0)
    (N0->N0) in negativeTwo.next
    (N0->N0) in negativeTwo.prev
    (L0 -> 1) in negativeTwo.size
}

assert NegTwo {
        repOK[negativeTwo.thiz, negativeTwo.head, negativeTwo.size, negativeTwo.next, negativeTwo.prev]
}

check NegTwo for 5 expect 1

one sig negativeThree {
    thiz:      one ApacheList+null,
    head:      ApacheList     -> one(ApacheListNode+null),
    size:      ApacheList     -> one(Int),
    next:      ApacheListNode -> lone(ApacheListNode+null),
    prev:      ApacheListNode -> lone(ApacheListNode+null)
}

fact {
    negativeThree.thiz = L0
    negativeThree.head = (L0 -> N0)
    ((N0->N1)+(N1->N2)+(N2->N3)+(N3->N0)) in negativeThree.next
    ((N1->N0)+(N2->N1)+(N3->N2)+(N0->N3)) in negativeThree.prev
    (L0 -> 4) in negativeThree.size
}

assert NegThree {
    repOK[negativeThree.thiz, negativeThree.head, negativeThree.size, negativeThree.next, negativeThree.prev]
}

check NegThree for 5 expect 1

one sig negativeFour {
    thiz:      one ApacheList+null,
    head:      ApacheList     -> one(ApacheListNode+null),
    size:      ApacheList     -> one(Int),
    next:      ApacheListNode -> lone(ApacheListNode+null),
    prev:      ApacheListNode -> lone(ApacheListNode+null)
}

fact {
    negativeFour.thiz = L0
    negativeFour.head = (L0 -> N0)
    ((N0->N1)+(N1->N2)+(N2->null)) in negativeFour.next
    ((N1->N0)+(N2->N1)+(N0->null)) in negativeFour.prev
    (L0 -> 4) in negativeFour.size
}

assert NegFour {
    repOK[negativeFour.thiz, negativeFour.head, negativeFour.size, negativeFour.next, negativeFour.prev]
}

check NegFour for 5 expect 1

one sig PositiveOne {
    thiz:      one ApacheList+null,
    head:      ApacheList     -> one(ApacheListNode+null),
    size:      ApacheList     -> one(Int),
    next:      ApacheListNode -> lone(ApacheListNode+null),
    prev:      ApacheListNode -> lone(ApacheListNode+null)
}

fact {
    PositiveOne.thiz = L0 
    PositiveOne.head = (L0 -> N0)
    ((N0->N1)+(N1->null)) in PositiveOne.next
    ((N1->N0)+(N0->null)) in PositiveOne.prev
    (L0 -> 2) in PositiveOne.size
}

assert PosOne {
        repOK[PositiveOne.thiz, PositiveOne.head, PositiveOne.size, PositiveOne.next, PositiveOne.prev]
}

check PosOne for 5 expect 0

one sig PositiveTwo {
    thiz:      one ApacheList+null,
    head:      ApacheList     -> one(ApacheListNode+null),
    size:      ApacheList     -> one(Int),
    next:      ApacheListNode -> lone(ApacheListNode+null),
    prev:      ApacheListNode -> lone(ApacheListNode+null)
}

fact {
    PositiveTwo.thiz = L0 
    PositiveTwo.head = (L0 -> N0)
    (N0->null) in PositiveTwo.next
    (N0->null) in PositiveTwo.prev
    (L0 -> 1) in PositiveTwo.size
}

assert PosTwo {
        repOK[PositiveTwo.thiz, PositiveTwo.head, PositiveTwo.size, PositiveTwo.next, PositiveTwo.prev]
}

check PosTwo for 5 expect 0


one sig PositiveThree {
    thiz:      one ApacheList+null,
    head:      ApacheList     -> one(ApacheListNode+null),
    size:      ApacheList     -> one(Int),
    next:      ApacheListNode -> lone(ApacheListNode+null),
    prev:      ApacheListNode -> lone(ApacheListNode+null)
}

fact {
    PositiveThree.thiz = L0 
    PositiveThree.head = (L0 -> N0)
    ((N0->N1)+(N1->N2)+(N2->N3)+(N3->null)) in PositiveThree.next
    ((N0->null)+(N1->N0)+(N2->N1)+(N3->N2)) in PositiveThree.prev
    (L0 -> 4) in PositiveThree.size
}

assert PosThree {
        repOK[PositiveThree.thiz, PositiveThree.head, PositiveThree.size, PositiveThree.next, PositiveThree.prev]
}

check PosThree for 5 expect 0


one sig positiveFour {
    thiz:      one ApacheList+null,
    head:      ApacheList     -> one(ApacheListNode+null),
    size:      ApacheList     -> one(Int),
    next:      ApacheListNode -> lone(ApacheListNode+null),
    prev:      ApacheListNode -> lone(ApacheListNode+null)
}

fact {
    positiveFour.thiz = L0 
    positiveFour.head = (L0 -> null)
    no positiveFour.next
    no positiveFour.prev
    (L0 -> 0) in positiveFour.size
}

assert PosFour {
        repOK[positiveFour.thiz, positiveFour.head, positiveFour.size, positiveFour.next, positiveFour.prev]
}

check PosFour for 5 expect 0
