one sig Null {}

abstract sig TreeNode {}

one sig N0,N1,N2 extends TreeNode {}

abstract sig BinaryTree {}

one sig T0 extends BinaryTree {}

pred repOK [
	thiz: BinaryTree,
	root: BinaryTree -> one (TreeNode + Null),
	left:	TreeNode -> one (TreeNode + Null),
	right: TreeNode -> one (TreeNode + Null)
] {

	/* Acyclic*/
	(all n: thiz.root.*(left + right) - Null | not (n in n.^(left + right))) and
	/* Cyclic*/
	(all n: thiz.root.*(left + right) - Null | thiz.root in n.(left + right)) and
	/* Intersection in null*/	
	(all n: thiz.root.*(left + right) - Null | ( n.left.*(left+right) & n.right.*(left + right)) in Null) and 
	/* Left height - Right height <= 1*/
	(all n: thiz.root.*(left + right) - Null | #(n.left.*(left+right)) - #(n.right.*(left+right)) <= 1) and
	/* Left height - Right height >= -1*/	
	(all n: thiz.root.*(left + right) - Null | #(n.left.*(left+right)) - #(n.right.*(left+right)) >= -1) and
	/* At least one child*/
	(all n: thiz.root.*(left + right) - Null | n.left != Null or n.right != Null) and
	/* Root not null*/
	(thiz.root != Null) and
	/* Right not null => Left not null */
	(all n: thiz.root.*(left+ right) - Null | n.right != Null => n.left != Null)

}

pred repOKOK[
	thiz: BinaryTree,
	root: BinaryTree -> one (TreeNode + Null),
	left:	TreeNode -> one (TreeNode + Null),
	right: TreeNode -> one (TreeNode + Null)
] {

	/* Acyclic */
	(all n: thiz.root.*(left + right) - Null | not (n in n.^(left + right))) and
	/* Intersection in null*/
	(all n: thiz.root.*(left + right) - Null | ( n.left.*(left+right) & n.right.*(left + right)) in Null)-- and 
	/* Left height - Right height <= 1*/
	--(all n: thiz.root.*(left + right) - Null | #(n.left.*(left+right)) - #(n.right.*(left+right)) <= 1) and
	/* Left height - Right height >= -1*/	
	--(all n: thiz.root.*(left + right) - Null | #(n.left.*(left+right)) - #(n.right.*(left+right)) >= -1) and
	/* Right not null => Left not null */
	--(all n: thiz.root.*(left + right) - Null | n.right != Null => n.left != Null)

}

pred SimmetryBreaking[
	thiz: BinaryTree,
	root: BinaryTree -> one (TreeNode + Null),
	left:	TreeNode -> one (TreeNode + Null),
	right: TreeNode -> one (TreeNode + Null)
] {
	root in ((T0->Null) + (T0 -> N0))
	left in (
		(N0->Null)+(N0->N0)+(N0->N1) +
		(N1->Null)+(N1->N1)+(N1->N0)+(N1->N2) +
		(N2->Null)+(N2->N2)+(N2->N0)
	)
	right in (
		(N0->Null)+(N0->N0)+(N0->N1)+(N0->N2) +
		(N1->Null)+(N1->N0)+(N1->N1)+(N1->N2) +
		(N2->Null)+(N2->N0)+(N2->N2)
	)
	all n : TreeNode - thiz.root.*(left + right) | n.left = Null and n.right = Null
}

pred NegativeCounterExample[
	thiz: BinaryTree,
	root: BinaryTree -> one (TreeNode + Null),
	left:	TreeNode -> one (TreeNode + Null),
	right: TreeNode -> one (TreeNode + Null)
] {
	SimmetryBreaking[thiz,root,left,right] and repOK[thiz,root,left,right] and not repOKOK[thiz,root,left,right]
}

pred PositiveCounterExample[
	thiz: BinaryTree,
	root: BinaryTree -> one (TreeNode + Null),
	left:	TreeNode -> one (TreeNode + Null),
	right: TreeNode -> one (TreeNode + Null)
] {
	SimmetryBreaking[thiz,root,left,right] and repOKOK[thiz,root,left,right] and not repOK[thiz,root,left,right]
}

run PositiveCounterExample for 3 but 5 Int
run NegativeCounterExample for 3 but 5 Int

