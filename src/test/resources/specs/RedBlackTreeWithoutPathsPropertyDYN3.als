module RedBlackTree

open util/integer

one sig Null {}

abstract sig Node {}

one sig N0 extends Node {}

one sig N1 extends Node {}

one sig N2 extends Node {}

abstract sig RedBlackTree {}

one sig T0 extends RedBlackTree {}

abstract sig Color {}

one sig Red extends Color {}

one sig Black extends Color {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

pred repOK [thiz: RedBlackTree, root: RedBlackTree ->one (Node + Null), left: Node ->one (Node + Null), right: Node ->one (Node + Null), size: RedBlackTree ->one Int, value: Node ->one Int, color: Node ->one Color] {
--repOKBody
}
 
/* action pick*/ 
pred pick [s, s': set Node, e, e': Node] {
(some s and e' in s and s' = s - e' ) 
}

-- sourceRepOK: Invariant translated from an operational specification
pred sourceRepOK [thiz_0: RedBlackTree, root_0: RedBlackTree ->one (Node + Null), left_0: Node ->one (Node + Null), right_0: Node ->one (Node + Null), size_0: RedBlackTree ->one Int, value_0: Node ->one Int, color_0: Node ->one Color, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11, result_12, result_13, result_14, result_15, result_16, result_17, result_18: boolean] {
some 	current_0, current_1, current_2, current_3, current_4, current_5, current_6, current_7, current_8: one Node + Null, 	visited_1, visited_2, visited_3, visited_4, visited_5, visited_6, visited_7, visited_8, visited_9: set Node, 	workset_1, workset_2, workset_3, workset_4, workset_5, workset_6, workset_7, workset_8, workset_9, workset_10, workset_11, workset_12, workset_13, workset_14, workset_15, workset_16, workset_17, workset_18, workset_19, workset_20, workset_21, workset_22, workset_23, workset_24, workset_25, workset_26: set Node, 	worklistPair_1, worklistPair_2: set (Node + Null) -> Int, 	numberOfBlack_1, numberOfBlack_2: one Int, 	e_1, e_2: one Node + Null, 	n_1, n_2: one Int | { 
(n_1 = 0 and e_1 = Null and numberOfBlack_1 = -1 and worklistPair_1 = thiz_0.root_0 -> 0 and result_1 = true and workset_1 = thiz_0.root_0 and visited_1 = thiz_0.root_0 and ((thiz_0.root_0 = Null and ((thiz_0.size_0 = 0 and result_2 = true ) or (not thiz_0.size_0 = 0 and result_2 = false ) ) and result_2 = result_18 and current_0 = current_8 and visited_1 = visited_9 and workset_1 = workset_26 and worklistPair_1 = worklistPair_2 and numberOfBlack_1 = numberOfBlack_2 and e_1 = e_2 and n_1 = n_2 ) or (not thiz_0.root_0 = Null and ((result_1 = result_9 and current_0 = current_4 and visited_1 = visited_9 and workset_1 = workset_13 ) or (result_1 = true and some workset_1 and pick[workset_1, workset_2, current_0, current_1] and (((current_1.left_0) != Null and ((current_1.left_0 in visited_1 and result_2 = false and visited_1 = visited_2 and workset_2 = workset_3 ) or (not current_1.left_0 in visited_1 and visited_2 = visited_1 + current_1.left_0 and workset_3 = workset_2 + current_1.left_0 and result_1 = result_2 ) ) ) or (not (current_1.left_0) != Null and result_1 = result_2 and visited_1 = visited_2 and workset_2 = workset_3 ) ) and ((result_2 = true and (current_1.right_0) != Null and ((current_1.right_0 in visited_2 and result_3 = false and visited_2 = visited_3 and workset_3 = workset_4 ) or (not current_1.right_0 in visited_2 and visited_3 = visited_2 + current_1.right_0 and workset_4 = workset_3 + current_1.right_0 and result_2 = result_3 ) ) ) or (not (result_2 = true and (current_1.right_0) != Null ) and result_2 = result_3 and visited_2 = visited_3 and workset_3 = workset_4 ) ) and ((result_3 = result_9 and current_1 = current_4 and visited_3 = visited_9 and workset_4 = workset_13 ) or (result_3 = true and some workset_4 and pick[workset_4, workset_5, current_1, current_2] and (((current_2.left_0) != Null and ((current_2.left_0 in visited_3 and result_4 = false and visited_3 = visited_4 and workset_5 = workset_6 ) or (not current_2.left_0 in visited_3 and visited_4 = visited_3 + current_2.left_0 and workset_6 = workset_5 + current_2.left_0 and result_3 = result_4 ) ) ) or (not (current_2.left_0) != Null and result_3 = result_4 and visited_3 = visited_4 and workset_5 = workset_6 ) ) and ((result_4 = true and (current_2.right_0) != Null and ((current_2.right_0 in visited_4 and result_5 = false and visited_4 = visited_5 and workset_6 = workset_7 ) or (not current_2.right_0 in visited_4 and visited_5 = visited_4 + current_2.right_0 and workset_7 = workset_6 + current_2.right_0 and result_4 = result_5 ) ) ) or (not (result_4 = true and (current_2.right_0) != Null ) and result_4 = result_5 and visited_4 = visited_5 and workset_6 = workset_7 ) ) and ((result_5 = result_9 and current_2 = current_4 and visited_5 = visited_9 and workset_7 = workset_13 ) or (result_5 = true and some workset_7 and pick[workset_7, workset_8, current_2, current_3] and (((current_3.left_0) != Null and ((current_3.left_0 in visited_5 and result_6 = false and visited_5 = visited_6 and workset_8 = workset_9 ) or (not current_3.left_0 in visited_5 and visited_6 = visited_5 + current_3.left_0 and workset_9 = workset_8 + current_3.left_0 and result_5 = result_6 ) ) ) or (not (current_3.left_0) != Null and result_5 = result_6 and visited_5 = visited_6 and workset_8 = workset_9 ) ) and ((result_6 = true and (current_3.right_0) != Null and ((current_3.right_0 in visited_6 and result_7 = false and visited_6 = visited_7 and workset_9 = workset_10 ) or (not current_3.right_0 in visited_6 and visited_7 = visited_6 + current_3.right_0 and workset_10 = workset_9 + current_3.right_0 and result_6 = result_7 ) ) ) or (not (result_6 = true and (current_3.right_0) != Null ) and result_6 = result_7 and visited_6 = visited_7 and workset_9 = workset_10 ) ) and ((result_7 = result_9 and current_3 = current_4 and visited_7 = visited_9 and workset_10 = workset_13 ) or (result_7 = true and some workset_10 and pick[workset_10, workset_11, current_3, current_4] and (((current_4.left_0) != Null and ((current_4.left_0 in visited_7 and result_8 = false and visited_7 = visited_8 and workset_11 = workset_12 ) or (not current_4.left_0 in visited_7 and visited_8 = visited_7 + current_4.left_0 and workset_12 = workset_11 + current_4.left_0 and result_7 = result_8 ) ) ) or (not (current_4.left_0) != Null and result_7 = result_8 and visited_7 = visited_8 and workset_11 = workset_12 ) ) and ((result_8 = true and (current_4.right_0) != Null and ((current_4.right_0 in visited_8 and result_9 = false and visited_8 = visited_9 and workset_12 = workset_13 ) or (not current_4.right_0 in visited_8 and visited_9 = visited_8 + current_4.right_0 and workset_13 = workset_12 + current_4.right_0 and result_8 = result_9 ) ) ) or (not (result_8 = true and (current_4.right_0) != Null ) and result_8 = result_9 and visited_8 = visited_9 and workset_12 = workset_13 ) ) ) ) ) ) ) ) ) ) and not (result_9 = true and some workset_13 ) and ((result_9 = true and (#(visited_9)) != (thiz_0.size_0) and result_10 = false and result_10 = result_18 and current_4 = current_8 and workset_13 = workset_26 and worklistPair_1 = worklistPair_2 and numberOfBlack_1 = numberOfBlack_2 and e_1 = e_2 and n_1 = n_2 ) or (not (result_9 = true and (#(visited_9)) != (thiz_0.size_0) ) and ((result_9 = true and (((thiz_0.root_0).color_0 = Red and result_10 = false and result_10 = result_18 and current_4 = current_8 and workset_13 = workset_26 and worklistPair_1 = worklistPair_2 and numberOfBlack_1 = numberOfBlack_2 and e_1 = e_2 and n_1 = n_2 ) or (not (thiz_0.root_0).color_0 = Red and workset_14 = thiz_0.root_0 and result_10 = true and n_2 = 0 and e_2 = Null and numberOfBlack_2 = -1 and worklistPair_2 = thiz_0.root_0 -> 0 and ((result_10 = result_18 and current_4 = current_8 and workset_14 = workset_26 ) or (result_10 = true and some workset_14 and pick[workset_14, workset_15, current_4, current_5] and ((current_5.color_0 = Red and (((current_5.left_0) != Null and (current_5.left_0).color_0 = Red and result_11 = false ) or (not ((current_5.left_0) != Null and (current_5.left_0).color_0 = Red ) and result_10 = result_11 ) ) and ((result_11 = true and (current_5.right_0) != Null and (current_5.right_0).color_0 = Red and result_12 = false ) or (not (result_11 = true and (current_5.right_0) != Null and (current_5.right_0).color_0 = Red ) and result_11 = result_12 ) ) ) or (not current_5.color_0 = Red and result_10 = result_12 ) ) and ((result_12 = true and (current_5.left_0) != Null and workset_16 = workset_15 + current_5.left_0 ) or (not (result_12 = true and (current_5.left_0) != Null ) and workset_15 = workset_16 ) ) and ((result_12 = true and (current_5.right_0) != Null and workset_17 = workset_16 + current_5.right_0 ) or (not (result_12 = true and (current_5.right_0) != Null ) and workset_16 = workset_17 ) ) and ((result_12 = result_18 and current_5 = current_8 and workset_17 = workset_26 ) or (result_12 = true and some workset_17 and pick[workset_17, workset_18, current_5, current_6] and ((current_6.color_0 = Red and (((current_6.left_0) != Null and (current_6.left_0).color_0 = Red and result_13 = false ) or (not ((current_6.left_0) != Null and (current_6.left_0).color_0 = Red ) and result_12 = result_13 ) ) and ((result_13 = true and (current_6.right_0) != Null and (current_6.right_0).color_0 = Red and result_14 = false ) or (not (result_13 = true and (current_6.right_0) != Null and (current_6.right_0).color_0 = Red ) and result_13 = result_14 ) ) ) or (not current_6.color_0 = Red and result_12 = result_14 ) ) and ((result_14 = true and (current_6.left_0) != Null and workset_19 = workset_18 + current_6.left_0 ) or (not (result_14 = true and (current_6.left_0) != Null ) and workset_18 = workset_19 ) ) and ((result_14 = true and (current_6.right_0) != Null and workset_20 = workset_19 + current_6.right_0 ) or (not (result_14 = true and (current_6.right_0) != Null ) and workset_19 = workset_20 ) ) and ((result_14 = result_18 and current_6 = current_8 and workset_20 = workset_26 ) or (result_14 = true and some workset_20 and pick[workset_20, workset_21, current_6, current_7] and ((current_7.color_0 = Red and (((current_7.left_0) != Null and (current_7.left_0).color_0 = Red and result_15 = false ) or (not ((current_7.left_0) != Null and (current_7.left_0).color_0 = Red ) and result_14 = result_15 ) ) and ((result_15 = true and (current_7.right_0) != Null and (current_7.right_0).color_0 = Red and result_16 = false ) or (not (result_15 = true and (current_7.right_0) != Null and (current_7.right_0).color_0 = Red ) and result_15 = result_16 ) ) ) or (not current_7.color_0 = Red and result_14 = result_16 ) ) and ((result_16 = true and (current_7.left_0) != Null and workset_22 = workset_21 + current_7.left_0 ) or (not (result_16 = true and (current_7.left_0) != Null ) and workset_21 = workset_22 ) ) and ((result_16 = true and (current_7.right_0) != Null and workset_23 = workset_22 + current_7.right_0 ) or (not (result_16 = true and (current_7.right_0) != Null ) and workset_22 = workset_23 ) ) and ((result_16 = result_18 and current_7 = current_8 and workset_23 = workset_26 ) or (result_16 = true and some workset_23 and pick[workset_23, workset_24, current_7, current_8] and ((current_8.color_0 = Red and (((current_8.left_0) != Null and (current_8.left_0).color_0 = Red and result_17 = false ) or (not ((current_8.left_0) != Null and (current_8.left_0).color_0 = Red ) and result_16 = result_17 ) ) and ((result_17 = true and (current_8.right_0) != Null and (current_8.right_0).color_0 = Red and result_18 = false ) or (not (result_17 = true and (current_8.right_0) != Null and (current_8.right_0).color_0 = Red ) and result_17 = result_18 ) ) ) or (not current_8.color_0 = Red and result_16 = result_18 ) ) and ((result_18 = true and (current_8.left_0) != Null and workset_25 = workset_24 + current_8.left_0 ) or (not (result_18 = true and (current_8.left_0) != Null ) and workset_24 = workset_25 ) ) and ((result_18 = true and (current_8.right_0) != Null and workset_26 = workset_25 + current_8.right_0 ) or (not (result_18 = true and (current_8.right_0) != Null ) and workset_25 = workset_26 ) ) ) ) ) ) ) ) ) ) and not (result_18 = true and some workset_26 ) ) ) ) or (not result_9 = true and result_9 = result_18 and current_4 = current_8 and workset_13 = workset_26 and worklistPair_1 = worklistPair_2 and numberOfBlack_1 = numberOfBlack_2 and e_1 = e_2 and n_1 = n_2 ) ) ) ) ) ) )}
}

one sig QFsourceRepOK {
	current_0: one Node + Null, 
	current_1: one Node + Null,
	current_2: one Node + Null, 
	current_3: one Node + Null,
	current_4: one Node + Null, 
	current_5: one Node + Null, 
	current_6: one Node + Null, 
	current_7: one Node + Null, 
	current_8: one Node + Null, 	
	visited_1: set Node, 
	visited_2: set Node, 
	visited_3: set Node, 
	visited_4: set Node,
	visited_5: set Node, 
	visited_6: set Node, 
	visited_7: set Node, 
	visited_8: set Node, 
	visited_9: set Node, 	
	workset_1: set Node, 
	workset_2: set Node, 
	workset_3: set Node, 
	workset_4: set Node, 
	workset_5: set Node, 
	workset_6: set Node, 
	workset_7: set Node, 
	workset_8: set Node, 
	workset_9: set Node, 
	workset_10: set Node, 
	workset_11: set Node, 
	workset_12: set Node, 
	workset_13: set Node, 
	workset_14: set Node, 
	workset_15: set Node, 
	workset_16: set Node, 
	workset_17: set Node, 
	workset_18: set Node, 
	workset_19: set Node, 
	workset_20: set Node,
	workset_21: set Node, 
	workset_22: set Node, 
	workset_23: set Node, 
	workset_24: set Node, 
	workset_25: set Node, 
	workset_26: set Node,
	worklistPair_1: set (Node + Null) -> Int, 
	worklistPair_2: set (Node + Null) -> Int, 	
	numberOfBlack_1: one Int, 
	numberOfBlack_2: one Int, 	
	e_1: one Node + Null, 
	e_2: one Node + Null, 	
	n_1: one Int, 
	n_2: one Int 
}

pred sourceRepOK_TRUE [thiz_0: RedBlackTree, root_0: RedBlackTree ->one (Node + Null), left_0: Node ->one (Node + Null), right_0: Node ->one (Node + Null), size_0: RedBlackTree ->one Int, value_0: Node ->one Int, color_0: Node ->one Color, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11, result_12, result_13, result_14, result_15, result_16, result_17, result_18: boolean] {
(sourceRepOK[thiz_0, root_0, left_0, right_0, size_0, value_0, color_0, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11, result_12, result_13, result_14, result_15, result_16, result_17, result_18] and result_18 = true and thiz_0.size_0=3) 
}

-- SymmetryBreaking: Symmetry breaking predicate to reduce the number of instances
pred SimmetryBreaking [thiz: RedBlackTree, root: RedBlackTree ->one (Node + Null), left: Node ->one (Node + Null), right: Node ->one (Node + Null), value: Node ->one Int, color: Node -> one Color] {
(root in T0 -> Null + T0 -> N0 and left in N0 -> Null + N0 -> N0 + N0 -> N1 + N1 -> Null + N1 -> N1 + N1 -> N0 + N1 -> N2 + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2  and right in N0 -> Null + N0 -> N0 + N0 -> N1 + N0 -> N2 + N1 -> Null + N1 -> N0 + N1 -> N1 + N1 -> N2   + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2  and 
( all 	n: Node - (thiz.root).* (left + right) | { 
(n.left = Null and n.right = Null and n.color = Red) } )
 and
 ( all n: Node | { 
eq[n.value, 0]})
 ) 
}

-- Negative Counterexample predicate. This predicate allow us to get negative counterexamples of the data structure. That is, examples that satisfies
-- satisfies our repOK but does not satisfies the sourceRepOK.
pred NegativeCounterExample [thiz_0: RedBlackTree, root_0: RedBlackTree ->one (Node + Null), left_0: Node ->one (Node + Null), right_0: Node ->one (Node + Null), size_0: RedBlackTree ->one Int, value_0: Node ->one Int, color_0: Node ->one Color] {
	(SimmetryBreaking[thiz_0, root_0, left_0, right_0, value_0,color_0] and
	repOK[thiz_0, root_0, left_0, right_0, size_0, value_0, color_0] and 
	sourceRepOK[thiz_0, root_0, left_0, right_0, size_0, value_0, color_0, QFNegativeCounterExample.result_0, QFNegativeCounterExample.result_1, QFNegativeCounterExample.result_2, QFNegativeCounterExample.result_3, QFNegativeCounterExample.result_4, QFNegativeCounterExample.result_5, QFNegativeCounterExample.result_6, QFNegativeCounterExample.result_7, QFNegativeCounterExample.result_8, QFNegativeCounterExample.result_9, QFNegativeCounterExample.result_10, QFNegativeCounterExample.result_11, QFNegativeCounterExample.result_12, QFNegativeCounterExample.result_13, QFNegativeCounterExample.result_14, QFNegativeCounterExample.result_15, QFNegativeCounterExample.result_16, QFNegativeCounterExample.result_17, QFNegativeCounterExample.result_18] and QFNegativeCounterExample.result_18 = false ) 
}

one sig QFNegativeCounterExample{
	result_0 : one boolean, 
	result_1 : one boolean, 
	result_2 : one boolean, 
	result_3 : one boolean, 
	result_4 : one boolean, 
	result_5 : one boolean, 
	result_6 : one boolean, 
	result_7 : one boolean, 
	result_8 : one boolean, 
	result_9 : one boolean, 
	result_10 : one boolean, 
	result_11 : one boolean, 
	result_12 : one boolean,
	result_13 : one boolean,
	result_14 : one boolean,
	result_15 : one boolean,
	result_16 : one boolean,
	result_17 : one boolean,
	result_18 : one boolean
}

-- Positive Counterexample predicate. This predicate allow us to get positive counterexamples of the data structure. That is, examples that does not satisfies
-- satisfies our repOK but satisfies the sourceRepOK.
pred PositiveCounterExample [thiz_0: RedBlackTree, root_0: RedBlackTree ->one (Node + Null), left_0: Node ->one (Node + Null), right_0: Node ->one (Node + Null), size_0: RedBlackTree ->one Int, value_0: Node ->one Int, color_0: Node ->one Color] {
(	SimmetryBreaking[thiz_0, root_0, left_0, right_0, value_0, color_0]  and 
	not repOK[thiz_0, root_0, left_0, right_0, size_0, value_0, color_0] and
	some result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11, result_12, result_13, result_14, result_15, result_16, result_17,result_18: boolean | {
	(sourceRepOK[thiz_0, root_0, left_0, right_0, size_0, value_0, color_0, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11, result_12, result_13, result_14, result_15, result_16, result_17, result_18] and result_18 = true )}
 ) 
}

--run sourceRepOK_TRUE for 3 but 3 int
run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
