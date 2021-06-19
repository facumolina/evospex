module unknown

open util/integer

one sig Null {}

abstract sig TreeNode {}

one sig N0 extends TreeNode {}

one sig N1 extends TreeNode {}

one sig N2 extends TreeNode {}

abstract sig BinaryTree {}

one sig T0 extends BinaryTree {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

pred repOK [
	thiz: BinaryTree, 
	root: BinaryTree ->one (TreeNode + Null), 
	left: TreeNode ->one (TreeNode + Null), 
	right: TreeNode ->one (TreeNode + Null), 
	size: BinaryTree ->one Int, 
	element: TreeNode ->one Int] {
--repOKBody
}
 
pred SimmetryBreaking [thiz: BinaryTree, root: BinaryTree ->one (TreeNode + Null), left: TreeNode ->one (TreeNode + Null), right: TreeNode ->one (TreeNode + Null)] {
(root in T0 -> Null + T0 -> N0 and left in N0 -> Null + N0 -> N0 + N0 -> N1 + N1 -> Null + N1 -> N1 + N1 -> N0 + N1 -> N2 + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2 and right in N0 -> Null + N0 -> N0 + N0 -> N1 + N0 -> N2 + N1 -> Null + N1 -> N0 + N1 -> N1 + N1 -> N2 + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2 and all 	n: one TreeNode - (thiz.root).* (left + right) | { 
(n.left = Null and n.right = Null )}
 ) 
}
 
/* action pick*/ 
pred pick [s, s': set TreeNode, e, e': TreeNode] {
(some s and e' in s and s' = s - e' ) 
}
 
pred sourceRepOK [thiz_0: BinaryTree, root_0: BinaryTree ->one (TreeNode + Null), left_0: TreeNode ->one (TreeNode + Null), right_0: TreeNode ->one (TreeNode + Null), size_0: BinaryTree ->one Int, element_0: TreeNode ->one Int, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8: boolean] {
some 	current_0, current_1, current_2, current_3: one TreeNode + Null, 	visited_1, visited_2, visited_3, visited_4, visited_5, visited_6, visited_7: set TreeNode, 	workset_1, workset_2, workset_3, workset_4, workset_5, workset_6, workset_7, workset_8, workset_9, workset_10: set TreeNode | { 
(workset_1 = thiz_0.root_0 and visited_1 = thiz_0.root_0 and ((thiz_0.root_0 = Null and ((thiz_0.size_0 = 0 and result_1 = true ) or (not thiz_0.size_0 = 0 and result_1 = false ) ) and result_1 = result_8 and current_0 = current_3 and visited_1 = visited_7 and workset_1 = workset_10 ) or (not thiz_0.root_0 = Null and result_1 = true and ((result_1 = result_7 and current_0 = current_3 and visited_1 = visited_7 and workset_1 = workset_10 ) or (result_1 = true and some workset_1 and pick[workset_1, workset_2, current_0, current_1] and (((current_1.left_0) != Null and ((current_1.left_0 in visited_1 and result_2 = false and visited_1 = visited_2 and workset_2 = workset_3 ) or (not current_1.left_0 in visited_1 and visited_2 = visited_1 + current_1.left_0 and workset_3 = workset_2 + current_1.left_0 and result_1 = result_2 ) ) ) or (not (current_1.left_0) != Null and result_1 = result_2 and visited_1 = visited_2 and workset_2 = workset_3 ) ) and ((result_2 = true and (current_1.right_0) != Null and ((current_1.right_0 in visited_2 and result_3 = false and visited_2 = visited_3 and workset_3 = workset_4 ) or (not current_1.right_0 in visited_2 and visited_3 = visited_2 + current_1.right_0 and workset_4 = workset_3 + current_1.right_0 and result_2 = result_3 ) ) ) or (not (result_2 = true and (current_1.right_0) != Null ) and result_2 = result_3 and visited_2 = visited_3 and workset_3 = workset_4 ) ) and ((result_3 = result_7 and current_1 = current_3 and visited_3 = visited_7 and workset_4 = workset_10 ) or (result_3 = true and some workset_4 and pick[workset_4, workset_5, current_1, current_2] and (((current_2.left_0) != Null and ((current_2.left_0 in visited_3 and result_4 = false and visited_3 = visited_4 and workset_5 = workset_6 ) or (not current_2.left_0 in visited_3 and visited_4 = visited_3 + current_2.left_0 and workset_6 = workset_5 + current_2.left_0 and result_3 = result_4 ) ) ) or (not (current_2.left_0) != Null and result_3 = result_4 and visited_3 = visited_4 and workset_5 = workset_6 ) ) and ((result_4 = true and (current_2.right_0) != Null and ((current_2.right_0 in visited_4 and result_5 = false and visited_4 = visited_5 and workset_6 = workset_7 ) or (not current_2.right_0 in visited_4 and visited_5 = visited_4 + current_2.right_0 and workset_7 = workset_6 + current_2.right_0 and result_4 = result_5 ) ) ) or (not (result_4 = true and (current_2.right_0) != Null ) and result_4 = result_5 and visited_4 = visited_5 and workset_6 = workset_7 ) ) and ((result_5 = result_7 and current_2 = current_3 and visited_5 = visited_7 and workset_7 = workset_10 ) or (result_5 = true and some workset_7 and pick[workset_7, workset_8, current_2, current_3] and (((current_3.left_0) != Null and ((current_3.left_0 in visited_5 and result_6 = false and visited_5 = visited_6 and workset_8 = workset_9 ) or (not current_3.left_0 in visited_5 and visited_6 = visited_5 + current_3.left_0 and workset_9 = workset_8 + current_3.left_0 and result_5 = result_6 ) ) ) or (not (current_3.left_0) != Null and result_5 = result_6 and visited_5 = visited_6 and workset_8 = workset_9 ) ) and ((result_6 = true and (current_3.right_0) != Null and ((current_3.right_0 in visited_6 and result_7 = false and visited_6 = visited_7 and workset_9 = workset_10 ) or (not current_3.right_0 in visited_6 and visited_7 = visited_6 + current_3.right_0 and workset_10 = workset_9 + current_3.right_0 and result_6 = result_7 ) ) ) or (not (result_6 = true and (current_3.right_0) != Null ) and result_6 = result_7 and visited_6 = visited_7 and workset_9 = workset_10 ) ) ) ) ) ) ) ) and not (result_7 = true and some workset_10 ) and ((result_7 = true and (#(visited_7)) != (thiz_0.size_0) and result_8 = false ) or (not (result_7 = true and (#(visited_7)) != (thiz_0.size_0) ) and result_7 = result_8 ) ) ) ) )}
}


-- Negative counterexamples
pred NegativeCounterExample[thiz_0: BinaryTree, root_0: BinaryTree ->one (TreeNode + Null), left_0: TreeNode ->one (TreeNode + Null), right_0: TreeNode ->one (TreeNode + Null), size_0: BinaryTree ->one Int, element_0: TreeNode ->one Int] {
	SimmetryBreaking[thiz_0, root_0, left_0, right_0] and 
	repOK[thiz_0, root_0, left_0, right_0, size_0, element_0] and 
	(some result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8: boolean |  
	sourceRepOK[thiz_0, root_0, left_0, right_0, size_0, element_0, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8] and result_8=false)
}


-- Positive counterexamples
pred PositiveCounterExample[thiz_0: BinaryTree, root_0: BinaryTree ->one (TreeNode + Null), left_0: TreeNode ->one (TreeNode + Null), right_0: TreeNode ->one (TreeNode + Null), size_0: BinaryTree ->one Int, element_0: TreeNode ->one Int] {
	SimmetryBreaking[thiz_0, root_0, left_0, right_0] and
 	not repOK[thiz_0, root_0, left_0, right_0, size_0, element_0] and 
	(some result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8: boolean | sourceRepOK [thiz_0, root_0, left_0, right_0, size_0, element_0, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8] and result_8=true)
}

--run sourceRepOK_TRUEDYN3 for 5 but 4 int
run NegativeCounterExample for 3 but 4 int
run PositiveCounterExample for 3 but 4 int
