module unknown

open util/integer

one sig Null {}

abstract sig TreeNode {}

one sig N0 extends TreeNode {}

one sig N1 extends TreeNode {}

one sig N2 extends TreeNode {}

one sig N3 extends TreeNode {}

one sig N4 extends TreeNode {}

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
 
--(all n: thiz.root.*(left+right) | (n.left.*(left+ right)) & (n.right.*(left+right)) in Null) and
--(all n : thiz.root.*(left + right) | n !in n .^(left+right))  and
--(eq[thiz.size,#(thiz.root.*(left+right) - Null)]) and
--(all n: thiz.root.*(left+right) | 
--		(all x: n.left.*(left+right) - Null| lt[x.element,n.element]) -- LeftOrder
--		and
--		(all x: n.right.*(left+right) - Null| gte[x.element,n.element])-- RigthOrder
--	)

pred SimmetryBreaking [thiz: BinaryTree, root: BinaryTree ->one (TreeNode + Null), left: TreeNode ->one (TreeNode + Null), right: TreeNode ->one (TreeNode + Null),element: TreeNode ->one Int] {
(root in T0 -> Null + T0 -> N0 and left in N0 -> Null + N0 -> N0 + N0 -> N1 + N1 -> Null + N1 -> N1 + N1 -> N0 + N1 -> N2 + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2 + N2 -> N3 + N2 -> N4 + N3 -> Null + N3 -> N0 + N3 -> N1 + N3 -> N2 + N3 -> N3 + N3 -> N4 + N4 -> Null + N4 -> N0 + N4 -> N1 + N4 -> N2 + N4 -> N3 + N4 -> N4 and right in N0 -> Null + N0 -> N0 + N0 -> N1 + N0 -> N2 + N1 -> Null + N1 -> N0 + N1 -> N1 + N1 -> N2 + N1 -> N3 + N1 -> N4 + N2 -> Null + N2 -> N0 + N2 -> N1 + N2 -> N2 + N2 -> N3 + N2 -> N4 + N3 -> Null + N3 -> N0 + N3 -> N1 + N3 -> N2 + N3 -> N3 + N3 -> N4 + N4 -> Null + N4 -> N0 + N4 -> N1 + N4 -> N2 + N4 -> N3 + N4 -> N4 and 
(all n: TreeNode - (thiz.root).* (left + right) | { (n.left = Null and n.right = Null and n.element=0)})
 ) 
}
  
pred sourceRepOK [thiz_0: BinaryTree, root_0: BinaryTree ->one (TreeNode + Null), left_0: TreeNode ->one (TreeNode + Null), right_0: TreeNode ->one (TreeNode + Null), size_0: BinaryTree ->one Int, element_0: TreeNode ->one Int] {
	(all n: thiz_0.root_0.*(left_0+right_0) | (n.left_0.*(left_0+ right_0)) & (n.right_0.*(left_0+right_0)) in Null) and
	(eq[thiz_0.size_0,#(thiz_0.root_0.*(left_0+right_0) - Null)]) and
	(all n: thiz_0.root_0.*(left_0+right_0) | 
		(all x: n.left_0.*(left_0+right_0) - Null| lt[x.element_0,n.element_0]) -- LeftOrder
		and
		(all x: n.right_0.*(left_0+right_0) - Null| gte[x.element_0,n.element_0])-- RigthOrder
 	) and
	(all n : thiz_0.root_0.*(left_0 + right_0) | n !in n .^(left_0+right_0)) 
	--and thiz_0.size_0=5
}
 
 
--run sourceRepOK_TRUEDYN3 for 5 but 5 int
-- Negative counterexamples
pred NegativeCounterExample[thiz_0: BinaryTree, root_0: BinaryTree ->one (TreeNode + Null), left_0: TreeNode ->one (TreeNode + Null), right_0: TreeNode ->one (TreeNode + Null), size_0: BinaryTree ->one Int, element_0: TreeNode ->one Int] {
	SimmetryBreaking[thiz_0, root_0, left_0, right_0, element_0] and 
	repOK[thiz_0, root_0, left_0, right_0, size_0, element_0] and 
	--(some result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11,result_12: boolean |  
	--sourceRepOK[thiz_0, root_0, left_0, right_0, size_0, element_0, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11,result_12] and result_12=false)
	not sourceRepOK[thiz_0, root_0, left_0, right_0, size_0, element_0]
}


-- Positive counterexamples
pred PositiveCounterExample[thiz_0: BinaryTree, root_0: BinaryTree ->one (TreeNode + Null), left_0: TreeNode ->one (TreeNode + Null), right_0: TreeNode ->one (TreeNode + Null), size_0: BinaryTree ->one Int, element_0: TreeNode ->one Int] {
	SimmetryBreaking[thiz_0, root_0, left_0, right_0, element_0] and
 	not repOK[thiz_0, root_0, left_0, right_0, size_0, element_0] and 
	--(some result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11,result_12: boolean | sourceRepOK [thiz_0, root_0, left_0, right_0, size_0, element_0, result_0, result_1, result_2, result_3, result_4, result_5, result_6, result_7, result_8, result_9, result_10, result_11,result_12] and result_12=true)
	sourceRepOK[thiz_0, root_0, left_0, right_0, size_0, element_0]
}

--run sourceRepOK for 5 but 4 int
run NegativeCounterExample for 5 but 4 int
run PositiveCounterExample for 5 but 4 int
