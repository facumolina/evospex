module SinglyCircularList

open util/integer

one sig Null {}

abstract sig Node {}

one sig N0 extends Node {}

one sig N1 extends Node {}

one sig N2 extends Node {}

abstract sig CircularList {}

one sig L0 extends CircularList {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

-- repOK: Invariant to be learned
pred repOK[thiz: CircularList, header_0: CircularList ->one (Node + Null), size_0: CircularList ->one Int, next_0: Node ->one (Node + Null)] {
--repOKBody
}

pred sourceRepOK [thiz_0: CircularList, header_0: CircularList ->one (Node + Null), size_0: CircularList ->one Int, next_0: Node ->one (Node + Null), result_0, result_1: boolean] {
 (QFsourceRepOKDYN250.nodesToVisit_1 = thiz_0.size_0 and QFsourceRepOKDYN250.visited_1 = thiz_0.header_0 and QFsourceRepOKDYN250.current_1 = thiz_0.header_0 and ((lt[thiz_0.size_0, 0] and result_1 = false and QFsourceRepOKDYN250.current_1 = QFsourceRepOKDYN250.current_4 and 
 QFsourceRepOKDYN250.current_1 = QFsourceRepOKDYN250.current_3 and
 QFsourceRepOKDYN250.current_1 = QFsourceRepOKDYN250.current_2 and 
 QFsourceRepOKDYN250.nodesToVisit_1 = QFsourceRepOKDYN250.nodesToVisit_4 and 
 QFsourceRepOKDYN250.nodesToVisit_1 = QFsourceRepOKDYN250.nodesToVisit_3 and 
 QFsourceRepOKDYN250.nodesToVisit_1 = QFsourceRepOKDYN250.nodesToVisit_2 and 
 QFsourceRepOKDYN250.visited_1 = QFsourceRepOKDYN250.visited_4 and 
 QFsourceRepOKDYN250.visited_1 = QFsourceRepOKDYN250.visited_3 and
 QFsourceRepOKDYN250.visited_1 = QFsourceRepOKDYN250.visited_2) or (not lt[thiz_0.size_0, 0] and ((QFsourceRepOKDYN250.current_1 = QFsourceRepOKDYN250.current_4 and 
 QFsourceRepOKDYN250.current_1 = QFsourceRepOKDYN250.current_3 and 
 QFsourceRepOKDYN250.current_1 = QFsourceRepOKDYN250.current_2 and 
 QFsourceRepOKDYN250.nodesToVisit_1 = QFsourceRepOKDYN250.nodesToVisit_4 and 
 QFsourceRepOKDYN250.nodesToVisit_1 = QFsourceRepOKDYN250.nodesToVisit_3 and 
 QFsourceRepOKDYN250.nodesToVisit_1 = QFsourceRepOKDYN250.nodesToVisit_2 and 
 QFsourceRepOKDYN250.visited_1 = QFsourceRepOKDYN250.visited_4 and
 QFsourceRepOKDYN250.visited_1 = QFsourceRepOKDYN250.visited_3 and
 QFsourceRepOKDYN250.visited_1 = QFsourceRepOKDYN250.visited_2) or (gt[QFsourceRepOKDYN250.nodesToVisit_1, 0] and QFsourceRepOKDYN250.current_1 != Null and QFsourceRepOKDYN250.visited_2 = QFsourceRepOKDYN250.visited_1 + QFsourceRepOKDYN250.current_1 and QFsourceRepOKDYN250.nodesToVisit_2 = sub[QFsourceRepOKDYN250.nodesToVisit_1, 1] and QFsourceRepOKDYN250.current_2 = QFsourceRepOKDYN250.current_1.next_0 and ((
 QFsourceRepOKDYN250.current_2 = QFsourceRepOKDYN250.current_4 and 
 QFsourceRepOKDYN250.current_2 = QFsourceRepOKDYN250.current_3 and 
 QFsourceRepOKDYN250.nodesToVisit_2 = QFsourceRepOKDYN250.nodesToVisit_4 and 
 QFsourceRepOKDYN250.nodesToVisit_2 = QFsourceRepOKDYN250.nodesToVisit_3 and 
 QFsourceRepOKDYN250.visited_2 = QFsourceRepOKDYN250.visited_4 and
 QFsourceRepOKDYN250.visited_2 = QFsourceRepOKDYN250.visited_3) or (gt[QFsourceRepOKDYN250.nodesToVisit_2, 0] and QFsourceRepOKDYN250.current_2 != Null and QFsourceRepOKDYN250.visited_3 = QFsourceRepOKDYN250.visited_2 + QFsourceRepOKDYN250.current_2 and QFsourceRepOKDYN250.nodesToVisit_3 = sub[QFsourceRepOKDYN250.nodesToVisit_2, 1] and QFsourceRepOKDYN250.current_3 = QFsourceRepOKDYN250.current_2.next_0 and ((QFsourceRepOKDYN250.current_3 = QFsourceRepOKDYN250.current_4 and QFsourceRepOKDYN250.nodesToVisit_3 = QFsourceRepOKDYN250.nodesToVisit_4 and QFsourceRepOKDYN250.visited_3 = QFsourceRepOKDYN250.visited_4 ) or (gt[QFsourceRepOKDYN250.nodesToVisit_3, 0] and QFsourceRepOKDYN250.current_3 != Null and QFsourceRepOKDYN250.visited_4 = QFsourceRepOKDYN250.visited_3 + QFsourceRepOKDYN250.current_3 and QFsourceRepOKDYN250.nodesToVisit_4 = sub[QFsourceRepOKDYN250.nodesToVisit_3, 1] and QFsourceRepOKDYN250.current_4 = QFsourceRepOKDYN250.current_3.next_0 ) ) ) ) ) ) and not (gt[QFsourceRepOKDYN250.nodesToVisit_4, 0] and QFsourceRepOKDYN250.current_4 != Null ) and ((eq[QFsourceRepOKDYN250.nodesToVisit_4, 0] and QFsourceRepOKDYN250.current_4 = thiz_0.header_0 and eq[#(QFsourceRepOKDYN250.visited_4), thiz_0.size_0] and result_1 = true ) or (not (eq[QFsourceRepOKDYN250.nodesToVisit_4, 0] and QFsourceRepOKDYN250.current_4 = thiz_0.header_0 and eq[#(QFsourceRepOKDYN250.visited_4), thiz_0.size_0] ) and result_1 = false ) ) ) ) )
 
}
 
one sig QFsourceRepOKDYN250{
	current_1 : one Node + Null, 
	current_2 : one Node + Null, 
	current_3 : one Node + Null, 
	current_4 : one Node + Null, 
	nodesToVisit_1 : one Int, 
	nodesToVisit_2 : one Int, 
	nodesToVisit_3 : one Int, 
	nodesToVisit_4 : one Int, 
	visited_1 : set Node + Null, 
	visited_2 : set Node + Null, 
	visited_3 : set Node + Null, 
	visited_4 : set Node + Null
}

-- symmetryBreaking: Symmetry breaking predicate to reduce the number of instances
pred symmetryBreaking[header_0: CircularList ->one (Node + Null), next_0: Node ->one (Node + Null)] {
	(header_0 in ((L0->Null)+(L0->N0))) and
	(next_0 in (N0->Null)+(N0->N0)+(N0->N1)+(N1->Null)+(N1->N0)+(N1->N1)+(N1->N2)+(N2->Null)+(N2->N0)+(N2->N1)+(N2->N2)) and
	(all n: Node - CircularList.header_0.*next_0 | n.next_0 = Null)
}

-- NegativeCounterExample: Predicate that allow us to get negative counterexamples, that is cases
-- of the data structure that safisfies the repOK being learned but does not satisfies the sourceRepOK.
pred NegativeCounterExample[thiz: CircularList, header_0: CircularList ->one (Node + Null), size_0: CircularList ->one Int, next_0: Node ->one (Node + Null)] {
	symmetryBreaking[header_0, next_0] and repOK[thiz, header_0, size_0, next_0] and some result_0, result_1: boolean | sourceRepOK [thiz, header_0, size_0, next_0, result_0, result_1] and result_1 = false and result_0=false
}

-- PositiveCounterExample: Predicate that allow us to get positive counterexamples, that is cases
-- of the data structure that does not satisfies the repOK being learned but satisfies the sourceRepOK.
pred PositiveCounterExample[thiz: CircularList, header_0: CircularList ->one (Node + Null), size_0: CircularList ->one Int, next_0: Node ->one (Node + Null)] {
	symmetryBreaking[header_0, next_0] and not repOK[thiz, header_0, size_0, next_0] and some result_0, result_1: boolean | sourceRepOK [thiz, header_0, size_0, next_0, result_0, result_1] and result_1 = true and result_0=false
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
