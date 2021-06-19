
open util/integer

one sig null {}

abstract sig AvlTree {}
one sig A0 extends AvlTree {}

abstract sig AvlNode  {}
abstract sig Data  {}

one sig N0,N1,N2 extends AvlNode {}
one sig D0,D1,D2 extends Data {}

pred repOK[thiz: AvlTree, 
    head: AvlTree -> one (AvlNode+null),
    element: AvlNode -> one (Data+null),
    height: AvlNode -> one Int,
    nextData: Data -> one (Data),
    left: AvlNode -> one (AvlNode+null),
    right: AvlNode -> one (AvlNode+null)
]{

/* non_null */
(all x: AvlNode | x in thiz.head.*(left+right)  => (x.element!=null)) and

 /* isAcyclic */
(all x: AvlNode | x in thiz.head.*(left + right) => not(x in x.^(left + right))) and

/* isCyclic*/
(some x: AvlNode | x in thiz.head.*(left + right) => (x in x.^(left + right))) and

/* left and rigth distinct*/
(all x: AvlNode | x in thiz.head.*(left + right) => ((x.left!=null && x.right!=null) => x.left != x.right)) and

/* left ordered */
(all x: AvlNode | x in thiz.head.*(left + right) =>  (all y: AvlNode | y in x.left.*(left + right)  => x.element in y.element.^nextData )) and 

/* right ordered */
(all x: AvlNode | x in thiz.head.*(left + right) =>  (all y: AvlNode | y in x.right.*(left +right) => y.element in x.element.^nextData)) and 

/* ordered - leaf */
(all x: AvlNode | x in thiz.head.*(left + right) => (( x.left=null && x.right=null ) => x.height=0)) and

/* ordered - right!=null */
(all x: AvlNode | x in thiz.head.*(left + right) => (( x.left=null && x.right!=null ) => x.height=1 && x.right.height=0)) and
 
/* ordered - left!=null */
(all x: AvlNode | x in thiz.head.*(left + right) => (( x.left!=null&& x.right=null ) => x.height=1 && x.left.height=0)) and

/* ordered - right,left!=null */
(all x: AvlNode | x in thiz.head.*(left + right) => ( ( x.left!=null&& x.right!=null) => ( x.height= add[gt[x.left.height,x.right.height] => x.left.height else x.right.height, 1] 
                                          && lte[gt[x.left.height,x.right.height] => sub[x.left.height,x.right.height] else sub[x.right.height,x.left.height],1] ) ) )

}

-- Negative case: Tree root with null element
one sig negativeOne {
    thiz: AvlTree, 
    head: AvlTree -> one (AvlNode+null),
    element: AvlNode -> one (Data+null),
    height: AvlNode -> one Int,
    nextData: Data -> one (Data),
    left: AvlNode -> lone (AvlNode+null),
    right: AvlNode -> lone (AvlNode+null)
}

fact {
	negativeOne.thiz = A0
	negativeOne.head = (A0 -> N0)
	(N0 -> null) in negativeOne.element
	(N0 -> 1) in negativeOne.height
 	(D0 -> D0) in negativeOne.nextData
	(N0 -> null) in negativeOne.left
	(N0 -> null) in negativeOne.right
}

assert NegOne {
	 repOK[negativeOne.thiz, negativeOne.head, negativeOne.element, negativeOne.height, negativeOne.nextData, negativeOne.left, negativeOne.right]
}

check NegOne for 5 expect 1

-- Negative case: Cyclic tree
one sig negativeTwo {
    thiz: AvlTree, 
    head: AvlTree -> one (AvlNode+null),
    element: AvlNode -> one (Data+null),
    height: AvlNode -> one Int,
    nextData: Data -> one (Data),
    left: AvlNode -> lone (AvlNode+null),
    right: AvlNode -> lone (AvlNode+null)
}

fact {
	negativeTwo.thiz = A0
	negativeTwo.head = (A0 -> N0)
	((N0 -> D0) + (N1 -> D1)) in negativeTwo.element
	((N0 ->1) + (N1 -> 0)) in negativeTwo.height
 	(D1 -> D0) in negativeTwo.nextData
	((N0 -> N1) + (N1 -> N1))  in negativeTwo.left
	((N0 -> null) + (N1 -> null)) in negativeTwo.right
}

assert NegTwo {
	 repOK[negativeTwo.thiz, negativeTwo.head, negativeTwo.element, negativeTwo.height, negativeTwo.nextData, negativeTwo.left, negativeTwo.right]
}

check NegTwo for 5 expect 1

-- Negative case: Not balanced tree
one sig negativeThree {
    thiz: AvlTree, 
    head: AvlTree -> one (AvlNode+null),
    element: AvlNode -> one (Data+null),
    height: AvlNode -> one Int,
    nextData: Data -> one (Data),
    left: AvlNode -> lone (AvlNode+null),
    right: AvlNode -> lone (AvlNode+null)
}

fact {
	negativeThree.thiz = A0
	negativeThree.head = (A0 -> N0)
	((N0 -> D0) + (N1 -> D1) + (N2 -> D2)) in negativeThree.element
	((N0 ->2) + (N1 -> 1) + (N2 -> 0)) in negativeThree.height
 	((D2 -> D1) + (D1 -> D0)) in negativeThree.nextData
	((N0 -> N1) + (N1 -> N2) + (N2 -> null))  in negativeThree.left
	((N0 -> null) + (N1 -> null) + (N2 -> null)) in negativeThree.right
}

assert NegThree {
	 repOK[negativeThree.thiz, negativeThree.head, negativeThree.element, negativeThree.height, negativeThree.nextData, negativeThree.left, negativeThree.right]
}

check NegThree for 5 expect 1

-- Negative case: Same left and right node
one sig negativeFour {
    thiz: AvlTree, 
    head: AvlTree -> one (AvlNode+null),
    element: AvlNode -> one (Data+null),
    height: AvlNode -> one Int,
    nextData: Data -> one (Data),
    left: AvlNode -> lone (AvlNode+null),
    right: AvlNode -> lone (AvlNode+null)
}

fact {
	negativeFour.thiz = A0
	negativeFour.head = (A0 -> N0)
	((N0 -> D0) + (N1 -> D0)) in negativeFour.element
	((N0 ->1) + (N1 -> 0)) in negativeFour.height
 	(D0 -> D0) in negativeFour.nextData
	((N0 -> N1) + (N1 -> null))  in negativeFour.left
	((N0 -> N1) + (N1 -> null)) in negativeFour.right
}

assert NegFour {
	 repOK[negativeFour.thiz, negativeFour.head, negativeFour.element, negativeFour.height, negativeFour.nextData, negativeFour.left, negativeFour.right]
}

check NegFour for 5 expect 1

-- Positive case: Tree root with element D0, and without left and right subtrees 
one sig positiveOne {
    thiz: AvlTree, 
    head: AvlTree -> one (AvlNode+null),
    element: AvlNode -> one (Data+null),
    height: AvlNode -> one Int,
    nextData: Data -> one (Data),
    left: AvlNode -> lone (AvlNode+null),
    right: AvlNode -> lone (AvlNode+null)
}

fact {
 	positiveOne.thiz = A0
	positiveOne.head = (A0 -> N0)
	(N0 -> D0) in positiveOne.element
	(N0 -> 0) in positiveOne.height
 	(D0 -> D0) in positiveOne.nextData
	(N0 -> null) in positiveOne.left
	(N0 -> null) in positiveOne.right
}

assert PosOne {
	 repOK[positiveOne.thiz, positiveOne.head, positiveOne.element, positiveOne.height, positiveOne.nextData, positiveOne.left, positiveOne.right]
}

check PosOne for 5 expect 0

-- Positive case:  
one sig positiveTwo {
    thiz: AvlTree, 
    head: AvlTree -> one (AvlNode+null),
    element: AvlNode -> one (Data+null),
    height: AvlNode -> one Int,
    nextData: Data -> one (Data),
    left: AvlNode -> lone (AvlNode+null),
    right: AvlNode -> lone (AvlNode+null)
}

fact {
 	positiveTwo.thiz = A0
	positiveTwo.head = (A0 -> N0)
	((N0 -> D0) + (N1 -> D1) + (N2 -> D2)) in positiveTwo.element
	((N0 -> 1) + (N1 -> 0) + (N2 -> 0)) in positiveTwo.height
 	((D1 -> D0) + (D0 -> D2)) in positiveTwo.nextData
	((N0 -> N1) + (N1 -> null) + (N2 -> null)) in positiveTwo.left
	((N0 -> N2) + (N1 -> null) + (N2 -> null)) in positiveTwo.right
}

assert PosTwo {
	 repOK[positiveTwo.thiz, positiveTwo.head, positiveTwo.element, positiveTwo.height, positiveTwo.nextData, positiveTwo.left, positiveTwo.right]
}

check PosTwo for 5 expect 0


-- Positive case:  
one sig positiveThree {
    thiz: AvlTree, 
    head: AvlTree -> one (AvlNode+null),
    element: AvlNode -> one (Data+null),
    height: AvlNode -> one Int,
    nextData: Data -> one (Data),
    left: AvlNode -> lone (AvlNode+null),
    right: AvlNode -> lone (AvlNode+null)
}

fact {
 	positiveThree.thiz = A0
	positiveThree.head = (A0 -> N0)
	((N0 -> D0) + (N1 -> D1) + (N2 -> D2)) in positiveThree.element
	((N0 -> 1) + (N1 -> 0) + (N2 -> 0)) in positiveThree.height
 	((D1 -> D0) + (D0 -> D2)) in positiveThree.nextData
	((N0 -> N1) + (N1 -> null) + (N2 -> null)) in positiveThree.left
	((N0 -> N2) + (N1 -> null) + (N2 -> null)) in positiveThree.right
}

assert PosThree {
	 repOK[positiveThree.thiz, positiveThree.head, positiveThree.element, positiveThree.height, positiveThree.nextData, positiveThree.left, positiveThree.right]
}

check PosThree for 5 expect 0


//run repOK for 4 but 1 AvlTree
