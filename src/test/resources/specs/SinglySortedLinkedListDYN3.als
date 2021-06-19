module SinglySortedLinkedListDYN3

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
	current_1: one Node + Null, 
	current_2: one Node + Null, 
	current_3: one Node + Null,
	current_4: one Node + Null, 	 	
	nodesToVisit_1: one Int, 
	nodesToVisit_2: one Int, 
	nodesToVisit_3: one Int,
	nodesToVisit_4: one Int
}

-- sourceRepOK: Invariant translated from an operational specification
pred sourceRepOK [thiz_0: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null), element_0: Node ->one Int, result_0, result_1, result_2, result_3, result_4, result_5: boolean] {
    (QF.nodesToVisit_1 = thiz_0.size_0 and QF.current_1 = thiz_0.header_0 and result_1 = true and 
		(
			(lt[thiz_0.size_0, 0] and result_2 = false and result_2 = result_5  and result_2 = result_4  and result_2 = result_3 
			and QF.current_1 = QF.current_4 and QF.current_1 = QF.current_3 and QF.current_1 = QF.current_2 
			and QF.nodesToVisit_1 = QF.nodesToVisit_4 and QF.nodesToVisit_1 = QF.nodesToVisit_3 and QF.nodesToVisit_1 = QF.nodesToVisit_2) 
			or 
			(not lt[thiz_0.size_0, 0] and (
				(result_1 = result_4 and result_1 = result_3 and result_1 = result_2 and QF.current_1 = QF.current_4 
				and QF.current_1 = QF.current_3 and QF.current_1 = QF.current_2 and QF.nodesToVisit_1 = QF.nodesToVisit_4 
				and QF.nodesToVisit_1 = QF.nodesToVisit_3 and QF.nodesToVisit_1 = QF.nodesToVisit_2) 
				or 
				(gt[QF.nodesToVisit_1, 0] and QF.current_1 != Null and result_1 = true and QF.nodesToVisit_2 = sub[QF.nodesToVisit_1, 1] and (((QF.current_1.next_0) != Null and ((gt[QF.current_1.element_0, (QF.current_1.next_0).element_0] and result_2 = false ) or (not gt[QF.current_1.element_0, (QF.current_1.next_0).element_0] and result_1 = result_2 ) ) ) or (not (QF.current_1.next_0) != Null and result_1 = result_2 ) ) and QF.current_2 = QF.current_1.next_0 and (
					(result_2 = result_4 and result_2 = result_3 and QF.current_2 = QF.current_4 and QF.current_2 = QF.current_3 
					and QF.nodesToVisit_2 = QF.nodesToVisit_4 and QF.nodesToVisit_2 = QF.nodesToVisit_3 ) 
					or 
					(gt[QF.nodesToVisit_2, 0] and QF.current_2 != Null and result_2 = true and QF.nodesToVisit_3 = sub[QF.nodesToVisit_2, 1] and (((QF.current_2.next_0) != Null and ((gt[QF.current_2.element_0, (QF.current_2.next_0).element_0] and result_3 = false ) or (not gt[QF.current_2.element_0, (QF.current_2.next_0).element_0] and result_2 = result_3 ) ) ) or (not (QF.current_2.next_0) != Null and result_2 = result_3 ) ) and QF.current_3 = QF.current_2.next_0 and ((result_3 = result_4 and QF.current_3 = QF.current_4 and QF.nodesToVisit_3 = QF.nodesToVisit_4 ) or (gt[QF.nodesToVisit_3, 0] and QF.current_3 != Null and result_3 = true and QF.nodesToVisit_4 = sub[QF.nodesToVisit_3, 1] and (((QF.current_3.next_0) != Null and ((gt[QF.current_3.element_0, (QF.current_3.next_0).element_0] and result_4 = false ) or (not gt[QF.current_3.element_0, (QF.current_3.next_0).element_0] and result_3 = result_4 ) ) ) or (not (QF.current_3.next_0) != Null and result_3 = result_4 ) ) and QF.current_4 = QF.current_3.next_0 ) ) ) ) ) ) and not (gt[QF.nodesToVisit_4, 0] and QF.current_4 != Null and result_4 = true ) and (((not eq[QF.nodesToVisit_4, 0] or QF.current_4 != Null ) and result_5 = false ) or (not (not eq[QF.nodesToVisit_4, 0] or QF.current_4 != Null ) and result_4 = result_5 ) ) ) ) )
 
}

-- repOK: Invariant to be learned
pred repOK[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null),element_0: Node ->one Int] {
--repOKBody
}

-- symmetryBreaking: Symmetry breaking predicate to reduce the number of instances
pred symmetryBreaking [header_0: List ->one (Node + Null), next_0: Node ->one (Node + Null), element: Node -> one Int] {
(header_0 in L0 -> Null + L0 -> N0 and next_0 in N0 -> Null + N0 -> N0 + N0 -> N1 + N1 -> Null + N1 -> N0 + N1 -> N1 + N1 -> N2 + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2 and 
(all n: one Node - (List.header_0).* (next_0) | { n.next_0 = Null and n.element=0})
 ) 
}
 
-- NegativeCounterExample: Predicate that allow us to get negative counterexamples, that is cases
-- of the data structure that safisfies the repOK being learned but does not satisfies the sourceRepOK.
pred NegativeCounterExample[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null),element_0: Node ->one Int] {
	symmetryBreaking[header_0, next_0,element_0] and repOK[thiz, header_0, size_0, next_0,element_0] and some result_0, result_1,result_2,result_3,result_4,result_5: boolean | sourceRepOK [thiz, header_0, size_0, next_0, element_0,result_0, result_1, result_2, result_3, result_4, result_5] and result_5 = false
}

-- PositiveCounterExample: Predicate that allow us to get positive counterexamples, that is cases
-- of the data structure that does not satisfies the repOK being learned but satisfies the sourceRepOK.
pred PositiveCounterExample[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null),element_0: Node ->one Int] {
	symmetryBreaking[header_0, next_0,element_0] and not repOK[thiz, header_0, size_0, next_0,element_0] and some result_0, result_1,result_2,result_3,result_4,result_5: boolean | sourceRepOK [thiz, header_0, size_0, next_0, element_0,result_0, result_1, result_2, result_3, result_4, result_5] and result_5 = true
}
 
run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
