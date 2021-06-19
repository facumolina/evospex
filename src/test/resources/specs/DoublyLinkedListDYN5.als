module unknown

open util/integer

one sig Null {}

abstract sig Node {}

one sig N0 extends Node {}

one sig N1 extends Node {}

one sig N2 extends Node {}

one sig N3 extends Node {}

one sig N4 extends Node {}

abstract sig DoublyLinkedList {}

one sig L0 extends DoublyLinkedList {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

-- Invariant to be learned
pred repOK [thiz: DoublyLinkedList, header: DoublyLinkedList ->one (Node + Null), next: Node ->one (Node + Null), previous: Node ->one (Node + Null), size: DoublyLinkedList ->one Int] {
--repOKBody
}

-- Symmetry Breaking predicate 
pred SimmetryBreaking [thiz: DoublyLinkedList, header: DoublyLinkedList ->one (Node + Null), next: Node ->one (Node + Null), previous: Node ->one (Node + Null)] {
(header in L0 -> Null + L0 -> N0 and next in N0 -> Null + N0 -> N0 + N0 -> N1 + N1 -> Null + N1 -> N1 + N1 -> N0 + N1 -> N2 + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2 + N2 -> N3 + N3 -> Null + N3 -> N0 + N3 -> N1 + N3 -> N2 + N3 -> N3 + N3 -> N4 + N4 -> Null + N4 -> N0 + N4 -> N1 + N4 -> N2 + N4 -> N3 + N4 -> N4 and previous in N0 -> Null + N0 -> N0 + N0 -> N1 + N0 -> N2 + N0 -> N3 + N0 -> N4 + N1 -> Null + N1 -> N0 + N1 -> N1 + N1 -> N2 + N1 -> N3 + N1 -> N4 + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2 + N2 -> N3 + N2 -> N4 + N3 -> Null + N3 -> N0 + N3 -> N1 + N3 -> N2 + N3 -> N3 + N3 -> N4 + N4 -> Null + N4 -> N0 + N4 -> N1 + N4 -> N2 + N4 -> N3 + N4 -> N4 and all 	n: one Node - (thiz.header).* (next + previous) | { 
(n.next = Null and n.previous = Null )}
 ) 
}
 
/* action pick*/ 
pred pick [s, s': set Node, e, e': Node] {
(some s and e' in s and s' = s - e' ) 
}
 
-- Operational invariant after the semantics preserving translation
pred sourceRepOK [thiz_0: DoublyLinkedList, header_0: DoublyLinkedList ->one (Node + Null), next_0: Node ->one (Node + Null), previous_0: Node ->one (Node + Null), size_0: DoublyLinkedList ->one Int, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7: boolean] {
some 	current_0, current_1, current_2, current_3, current_4, current_5: one Node + Null, 	nextnode_1, nextnode_2, nextnode_3, nextnode_4, nextnode_5, nextnode_6: one Node + Null, 	visited_1, visited_2, visited_3, visited_4, visited_5, visited_6: set Node, 	workset_1, workset_2, workset_3, workset_4, workset_5, workset_6, workset_7, workset_8, workset_9, workset_10, workset_11: set Node | { 
(workset_1 = thiz_0.header_0 and visited_1 = thiz_0.header_0 and nextnode_1 = Null and ((thiz_0.header_0 = Null and ((thiz_0.size_0 = 0 and result_1 = true ) or (not thiz_0.size_0 = 0 and result_1 = false ) ) and result_1 = result_7 and current_0 = current_5 and nextnode_1 = nextnode_6 and visited_1 = visited_6 and workset_1 = workset_11 ) or (not thiz_0.header_0 = Null and result_1 = true and ((result_1 = result_6 and current_0 = current_5 and nextnode_1 = nextnode_6 and visited_1 = visited_6 and workset_1 = workset_11 ) or (result_1 = true and some workset_1 and pick[workset_1, workset_2, current_0, current_1] and nextnode_2 = current_1.next_0 and ((nextnode_2 = Null and result_2 = false and visited_1 = visited_2 and workset_2 = workset_3 ) or (not nextnode_2 = Null and (((nextnode_2.previous_0) != current_1 and result_2 = false and visited_1 = visited_2 and workset_2 = workset_3 ) or (not (nextnode_2.previous_0) != current_1 and ((nextnode_2 !in visited_1 and workset_3 = workset_2 + nextnode_2 and visited_2 = visited_1 + nextnode_2 ) or (not nextnode_2 !in visited_1 and visited_1 = visited_2 and workset_2 = workset_3 ) ) and result_1 = result_2 ) ) ) ) and ((result_2 = result_6 and current_1 = current_5 and nextnode_2 = nextnode_6 and visited_2 = visited_6 and workset_3 = workset_11 ) or (result_2 = true and some workset_3 and pick[workset_3, workset_4, current_1, current_2] and nextnode_3 = current_2.next_0 and ((nextnode_3 = Null and result_3 = false and visited_2 = visited_3 and workset_4 = workset_5 ) or (not nextnode_3 = Null and (((nextnode_3.previous_0) != current_2 and result_3 = false and visited_2 = visited_3 and workset_4 = workset_5 ) or (not (nextnode_3.previous_0) != current_2 and ((nextnode_3 !in visited_2 and workset_5 = workset_4 + nextnode_3 and visited_3 = visited_2 + nextnode_3 ) or (not nextnode_3 !in visited_2 and visited_2 = visited_3 and workset_4 = workset_5 ) ) and result_2 = result_3 ) ) ) ) and ((result_3 = result_6 and current_2 = current_5 and nextnode_3 = nextnode_6 and visited_3 = visited_6 and workset_5 = workset_11 ) or (result_3 = true and some workset_5 and pick[workset_5, workset_6, current_2, current_3] and nextnode_4 = current_3.next_0 and ((nextnode_4 = Null and result_4 = false and visited_3 = visited_4 and workset_6 = workset_7 ) or (not nextnode_4 = Null and (((nextnode_4.previous_0) != current_3 and result_4 = false and visited_3 = visited_4 and workset_6 = workset_7 ) or (not (nextnode_4.previous_0) != current_3 and ((nextnode_4 !in visited_3 and workset_7 = workset_6 + nextnode_4 and visited_4 = visited_3 + nextnode_4 ) or (not nextnode_4 !in visited_3 and visited_3 = visited_4 and workset_6 = workset_7 ) ) and result_3 = result_4 ) ) ) ) and ((result_4 = result_6 and current_3 = current_5 and nextnode_4 = nextnode_6 and visited_4 = visited_6 and workset_7 = workset_11 ) or (result_4 = true and some workset_7 and pick[workset_7, workset_8, current_3, current_4] and nextnode_5 = current_4.next_0 and ((nextnode_5 = Null and result_5 = false and visited_4 = visited_5 and workset_8 = workset_9 ) or (not nextnode_5 = Null and (((nextnode_5.previous_0) != current_4 and result_5 = false and visited_4 = visited_5 and workset_8 = workset_9 ) or (not (nextnode_5.previous_0) != current_4 and ((nextnode_5 !in visited_4 and workset_9 = workset_8 + nextnode_5 and visited_5 = visited_4 + nextnode_5 ) or (not nextnode_5 !in visited_4 and visited_4 = visited_5 and workset_8 = workset_9 ) ) and result_4 = result_5 ) ) ) ) and ((result_5 = result_6 and current_4 = current_5 and nextnode_5 = nextnode_6 and visited_5 = visited_6 and workset_9 = workset_11 ) or (result_5 = true and some workset_9 and pick[workset_9, workset_10, current_4, current_5] and nextnode_6 = current_5.next_0 and ((nextnode_6 = Null and result_6 = false and visited_5 = visited_6 and workset_10 = workset_11 ) or (not nextnode_6 = Null and (((nextnode_6.previous_0) != current_5 and result_6 = false and visited_5 = visited_6 and workset_10 = workset_11 ) or (not (nextnode_6.previous_0) != current_5 and ((nextnode_6 !in visited_5 and workset_11 = workset_10 + nextnode_6 and visited_6 = visited_5 + nextnode_6 ) or (not nextnode_6 !in visited_5 and visited_5 = visited_6 and workset_10 = workset_11 ) ) and result_5 = result_6 ) ) ) ) ) ) ) ) ) ) ) ) ) ) and not (result_6 = true and some workset_11 ) and ((result_6 = true and (#(visited_6)) != (thiz_0.size_0) and result_7 = false ) or (not (result_6 = true and (#(visited_6)) != (thiz_0.size_0) ) and result_6 = result_7 ) ) ) ) )}
 
}
 
-- Negative counterexamples predicate
pred NegativeCounterExample[thiz: DoublyLinkedList, header_0: DoublyLinkedList ->one (Node + Null), size_0: DoublyLinkedList ->one Int, next_0: Node ->one (Node + Null),previous: Node ->one (Node + Null)] {
	SimmetryBreaking[thiz,header_0, next_0,previous] and repOK[thiz, header_0, next_0,previous,size_0] and 
	(some  result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7: boolean | sourceRepOK[thiz, header_0, next_0, previous,size_0,result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7] and result_7=false) 
}

-- Positive counterexamples predicate
pred PositiveCounterExample[thiz: DoublyLinkedList, header_0: DoublyLinkedList ->one (Node + Null), size_0: DoublyLinkedList ->one Int, next_0: Node ->one (Node + Null),previous: Node ->one (Node + Null)] {
	SimmetryBreaking[thiz,header_0, next_0,previous] and not repOK[thiz, header_0, next_0,previous,size_0] and 
	(some  result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7: boolean | sourceRepOK[thiz, header_0, next_0, previous,size_0,result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7] and result_7=true)
}

run NegativeCounterExample for 5 but 5 int
run PositiveCounterExample for 5 but 5 int
