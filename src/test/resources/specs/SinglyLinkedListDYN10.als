module linkedListRepOk

open util/integer

one sig Null {}

abstract sig Node {}

one sig N0 extends Node {}

one sig N1 extends Node {}

one sig N2 extends Node {}

one sig N3 extends Node {}

one sig N4 extends Node {}

one sig N5 extends Node {}

one sig N6 extends Node {}

one sig N7 extends Node {}

one sig N8 extends Node {}

one sig N9 extends Node {}

abstract sig List {}

one sig L0 extends List {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

one sig QFrepOKDYN1{
	current_1 : one Node + Null, 
	current_2 : one Node + Null, 
	current_3 : one Node + Null, 
	current_4 : one Node + Null, 
	current_5 : one Node + Null, 
	current_6 : one Node + Null, 
	current_7 : one Node + Null, 
	current_8 : one Node + Null, 
	current_9 : one Node + Null, 
	current_10 : one Node + Null, 
	current_11 : one Node + Null, 
	nodesToVisit_1 : one Int, 
	nodesToVisit_2 : one Int, 
	nodesToVisit_3 : one Int, 
	nodesToVisit_4 : one Int, 
	nodesToVisit_5 : one Int, 
	nodesToVisit_6 : one Int, 
	nodesToVisit_7 : one Int, 
	nodesToVisit_8 : one Int, 
	nodesToVisit_9 : one Int, 
	nodesToVisit_10 : one Int, 
	nodesToVisit_11 : one Int
}

pred repOKOK [thiz_0: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null), result_0, result_1: boolean] {
 (QFrepOKDYN1.nodesToVisit_1 = thiz_0.size_0 and QFrepOKDYN1.current_1 = thiz_0.header_0 and 
	(
		(lt[thiz_0.size_0, 0] and result_1 = false and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_11 
		and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_10 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_9 
		and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_8 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_7 
		and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_6 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_5
		and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_5 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_4 
		and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_3 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_2
		and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_11 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_10
		and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_9 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_8
		and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_7 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_6
		and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_5 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_4
		and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_3 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_2) 
		or 
		(not lt[thiz_0.size_0, 0] and 
			(
				(QFrepOKDYN1.current_1 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_10
				and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_9 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_8
				and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_7 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_6 
				and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_5 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_4 
				and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_3 and QFrepOKDYN1.current_1 = QFrepOKDYN1.current_2 
				and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_11 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_10
				and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_9 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_8
				and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_7 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_6 
				and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_5 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_4
				and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_3 and QFrepOKDYN1.nodesToVisit_1 = QFrepOKDYN1.nodesToVisit_2) 
				or 
				(gt[QFrepOKDYN1.nodesToVisit_1, 0] and QFrepOKDYN1.current_1 != Null and QFrepOKDYN1.nodesToVisit_2 = sub[QFrepOKDYN1.nodesToVisit_1, 1] and 
				QFrepOKDYN1.current_2 = QFrepOKDYN1.current_1.next_0 and (
					(QFrepOKDYN1.current_2 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_2 = QFrepOKDYN1.current_10 
					and QFrepOKDYN1.current_2 = QFrepOKDYN1.current_9 and QFrepOKDYN1.current_2 = QFrepOKDYN1.current_8 
					and QFrepOKDYN1.current_2 = QFrepOKDYN1.current_7 and QFrepOKDYN1.current_2 = QFrepOKDYN1.current_6 
					and QFrepOKDYN1.current_2 = QFrepOKDYN1.current_5 and QFrepOKDYN1.current_2 = QFrepOKDYN1.current_4 
					and QFrepOKDYN1.current_2 = QFrepOKDYN1.current_3 and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_11 
					and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_10 and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_9
					and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_8 and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_7
					and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_6 and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_5
					and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_4 and QFrepOKDYN1.nodesToVisit_2 = QFrepOKDYN1.nodesToVisit_3) 
					or 
					(gt[QFrepOKDYN1.nodesToVisit_2, 0] and QFrepOKDYN1.current_2 != Null and QFrepOKDYN1.nodesToVisit_3 = sub[QFrepOKDYN1.nodesToVisit_2, 1] and 
					QFrepOKDYN1.current_3 = QFrepOKDYN1.current_2.next_0 and (
							(QFrepOKDYN1.current_3 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_3 = QFrepOKDYN1.current_10 and QFrepOKDYN1.current_3 = QFrepOKDYN1.current_9
							and QFrepOKDYN1.current_3 = QFrepOKDYN1.current_8 and QFrepOKDYN1.current_3 = QFrepOKDYN1.current_7 and QFrepOKDYN1.current_3 = QFrepOKDYN1.current_6 
							and QFrepOKDYN1.current_3 = QFrepOKDYN1.current_5 and QFrepOKDYN1.current_3 = QFrepOKDYN1.current_4 
							and QFrepOKDYN1.nodesToVisit_3 = QFrepOKDYN1.nodesToVisit_11 and QFrepOKDYN1.nodesToVisit_3 = QFrepOKDYN1.nodesToVisit_10
							and QFrepOKDYN1.nodesToVisit_3 = QFrepOKDYN1.nodesToVisit_9 and QFrepOKDYN1.nodesToVisit_3 = QFrepOKDYN1.nodesToVisit_8
							and QFrepOKDYN1.nodesToVisit_3 = QFrepOKDYN1.nodesToVisit_7 and QFrepOKDYN1.nodesToVisit_3 = QFrepOKDYN1.nodesToVisit_6
							and QFrepOKDYN1.nodesToVisit_3 = QFrepOKDYN1.nodesToVisit_5 and QFrepOKDYN1.nodesToVisit_3 = QFrepOKDYN1.nodesToVisit_4) 
							or 
							(gt[QFrepOKDYN1.nodesToVisit_3, 0] and QFrepOKDYN1.current_3 != Null and QFrepOKDYN1.nodesToVisit_4 = sub[QFrepOKDYN1.nodesToVisit_3, 1] and 
							QFrepOKDYN1.current_4 = QFrepOKDYN1.current_3.next_0 and (
								(QFrepOKDYN1.current_4 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_4 = QFrepOKDYN1.current_10 and QFrepOKDYN1.current_4 = QFrepOKDYN1.current_9 
								and QFrepOKDYN1.current_4 = QFrepOKDYN1.current_8 and QFrepOKDYN1.current_4 = QFrepOKDYN1.current_7 and QFrepOKDYN1.current_4 = QFrepOKDYN1.current_6
								and QFrepOKDYN1.current_4 = QFrepOKDYN1.current_5 and QFrepOKDYN1.nodesToVisit_4 = QFrepOKDYN1.nodesToVisit_11 
								and QFrepOKDYN1.nodesToVisit_4 = QFrepOKDYN1.nodesToVisit_10 and QFrepOKDYN1.nodesToVisit_4 = QFrepOKDYN1.nodesToVisit_9
								and QFrepOKDYN1.nodesToVisit_4 = QFrepOKDYN1.nodesToVisit_8 and QFrepOKDYN1.nodesToVisit_4 = QFrepOKDYN1.nodesToVisit_7
								and QFrepOKDYN1.nodesToVisit_4 = QFrepOKDYN1.nodesToVisit_6 and QFrepOKDYN1.nodesToVisit_4 = QFrepOKDYN1.nodesToVisit_5) 
								or 
								(gt[QFrepOKDYN1.nodesToVisit_4, 0] and QFrepOKDYN1.current_4 != Null and QFrepOKDYN1.nodesToVisit_5 = sub[QFrepOKDYN1.nodesToVisit_4, 1] and 
								QFrepOKDYN1.current_5 = QFrepOKDYN1.current_4.next_0 and (
									(QFrepOKDYN1.current_5 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_5 = QFrepOKDYN1.current_10 
									and QFrepOKDYN1.current_5 = QFrepOKDYN1.current_9 and QFrepOKDYN1.current_5 = QFrepOKDYN1.current_8
									and QFrepOKDYN1.current_5 = QFrepOKDYN1.current_7 and QFrepOKDYN1.current_5 = QFrepOKDYN1.current_6 
									and QFrepOKDYN1.nodesToVisit_5 = QFrepOKDYN1.nodesToVisit_11 and QFrepOKDYN1.nodesToVisit_5 = QFrepOKDYN1.nodesToVisit_10
									and QFrepOKDYN1.nodesToVisit_5 = QFrepOKDYN1.nodesToVisit_9 and QFrepOKDYN1.nodesToVisit_5 = QFrepOKDYN1.nodesToVisit_8
									and QFrepOKDYN1.nodesToVisit_5 = QFrepOKDYN1.nodesToVisit_7 and QFrepOKDYN1.nodesToVisit_5 = QFrepOKDYN1.nodesToVisit_6) 
									or 
									(gt[QFrepOKDYN1.nodesToVisit_5, 0] and QFrepOKDYN1.current_5 != Null and QFrepOKDYN1.nodesToVisit_6 = sub[QFrepOKDYN1.nodesToVisit_5, 1] and 
									QFrepOKDYN1.current_6 = QFrepOKDYN1.current_5.next_0 and (
										(QFrepOKDYN1.current_6 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_6 = QFrepOKDYN1.current_10
										and QFrepOKDYN1.current_6 = QFrepOKDYN1.current_9 and QFrepOKDYN1.current_6 = QFrepOKDYN1.current_8
										and QFrepOKDYN1.current_6 = QFrepOKDYN1.current_7 and QFrepOKDYN1.nodesToVisit_6 = QFrepOKDYN1.nodesToVisit_11 
										and QFrepOKDYN1.nodesToVisit_6 = QFrepOKDYN1.nodesToVisit_10 and QFrepOKDYN1.nodesToVisit_6 = QFrepOKDYN1.nodesToVisit_9
										and QFrepOKDYN1.nodesToVisit_6 = QFrepOKDYN1.nodesToVisit_8 and QFrepOKDYN1.nodesToVisit_6 = QFrepOKDYN1.nodesToVisit_7) 
										or 
										(gt[QFrepOKDYN1.nodesToVisit_6, 0] and QFrepOKDYN1.current_6 != Null and QFrepOKDYN1.nodesToVisit_7 = sub[QFrepOKDYN1.nodesToVisit_6, 1] and 
										QFrepOKDYN1.current_7 = QFrepOKDYN1.current_6.next_0 and (
											(QFrepOKDYN1.current_7 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_7 = QFrepOKDYN1.current_10
											and QFrepOKDYN1.current_7 = QFrepOKDYN1.current_9 and QFrepOKDYN1.current_7 = QFrepOKDYN1.current_8
											and QFrepOKDYN1.nodesToVisit_7 = QFrepOKDYN1.nodesToVisit_11 and QFrepOKDYN1.nodesToVisit_7 = QFrepOKDYN1.nodesToVisit_10
											and QFrepOKDYN1.nodesToVisit_7 = QFrepOKDYN1.nodesToVisit_9 and QFrepOKDYN1.nodesToVisit_7 = QFrepOKDYN1.nodesToVisit_8) 
											or 
											(gt[QFrepOKDYN1.nodesToVisit_7, 0] and QFrepOKDYN1.current_7 != Null and QFrepOKDYN1.nodesToVisit_8 = sub[QFrepOKDYN1.nodesToVisit_7, 1] and 
											QFrepOKDYN1.current_8 = QFrepOKDYN1.current_7.next_0 and (
												(QFrepOKDYN1.current_8 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_8 = QFrepOKDYN1.current_10 
												and QFrepOKDYN1.current_8 = QFrepOKDYN1.current_9 and QFrepOKDYN1.nodesToVisit_8 = QFrepOKDYN1.nodesToVisit_11 
												and QFrepOKDYN1.nodesToVisit_8 = QFrepOKDYN1.nodesToVisit_10 and QFrepOKDYN1.nodesToVisit_8 = QFrepOKDYN1.nodesToVisit_9) 
												or 
												(gt[QFrepOKDYN1.nodesToVisit_8, 0] and QFrepOKDYN1.current_8 != Null and QFrepOKDYN1.nodesToVisit_9 = sub[QFrepOKDYN1.nodesToVisit_8, 1] and 
												QFrepOKDYN1.current_9 = QFrepOKDYN1.current_8.next_0 and (
														(QFrepOKDYN1.current_9 = QFrepOKDYN1.current_11 and QFrepOKDYN1.current_9 = QFrepOKDYN1.current_10 
														and QFrepOKDYN1.nodesToVisit_9 = QFrepOKDYN1.nodesToVisit_11 and QFrepOKDYN1.nodesToVisit_9 = QFrepOKDYN1.nodesToVisit_10) 
														or 
														(gt[QFrepOKDYN1.nodesToVisit_9, 0] and QFrepOKDYN1.current_9 != Null and QFrepOKDYN1.nodesToVisit_10 = sub[QFrepOKDYN1.nodesToVisit_9, 1] and 
														QFrepOKDYN1.current_10 = QFrepOKDYN1.current_9.next_0 and ((QFrepOKDYN1.current_10 = QFrepOKDYN1.current_11 and QFrepOKDYN1.nodesToVisit_10 = QFrepOKDYN1.nodesToVisit_11 ) or (gt[QFrepOKDYN1.nodesToVisit_10, 0] and QFrepOKDYN1.current_10 != Null and QFrepOKDYN1.nodesToVisit_11 = sub[QFrepOKDYN1.nodesToVisit_10, 1] and QFrepOKDYN1.current_11 = QFrepOKDYN1.current_10.next_0 ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) ) and not (gt[QFrepOKDYN1.nodesToVisit_11, 0] and QFrepOKDYN1.current_11 != Null ) and ((eq[QFrepOKDYN1.nodesToVisit_11, 0] and QFrepOKDYN1.current_11 = Null and result_1 = true ) or (not (eq[QFrepOKDYN1.nodesToVisit_11, 0] and QFrepOKDYN1.current_11 = Null ) and result_1 = false ) ) ) ) )
 
}
 
pred repOK[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
--repOKBody
}

pred NegativeCounterExample[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
	symmetryBreaking[header_0, next_0] and repOK[thiz, header_0, size_0, next_0] and some result_0, result_1: boolean | repOKOK [thiz, header_0, size_0, next_0, result_0, result_1] and result_1 = false and result_0=false
}

pred symmetryBreaking[header_0: List ->one (Node + Null), next_0: Node ->one (Node + Null)] {
	(header_0 in ((L0->Null)+(L0->N0))) and
	(next_0 in ((N0->Null)+(N0->N0)+(N0->N1)+(N1->Null)+(N1->N0)+(N1->N1)+(N1->N2)+(N2->Null)+(N2->N0)+(N2->N1)+(N2->N2)+(N2->N3)+(N3->Null)+(N3->N0)+(N3->N1)+(N3->N2)+(N3->N3)+(N3->N4)+(N4->Null)+(N4->N0)+(N4->N1)+(N4->N2)+(N4->N3)+(N4->N4)+(N4->N5)+(N5->Null)+(N5->N0)+(N5->N1)+(N5->N2)+(N5->N3)+(N5->N4)+(N5->N5)+(N5->N6)+(N6->Null)+(N6->N0)+(N6->N1)+(N6->N2)+(N6->N3)+(N6->N4)+(N6->N5)+(N6->N6)+(N6->N7)+(N7->Null)+(N7->N0)+(N7->N1)+(N7->N2)+(N7->N3)+(N7->N4)+(N7->N5)+(N7->N6)+(N7->N7)+(N7->N8)+(N8->Null)+(N8->N0)+(N8->N1)+(N8->N2)+(N8->N3)+(N8->N4)+(N8->N5)+(N8->N6)+(N8->N7)+(N8->N8)+(N8->N9)+(N9->Null)+(N9->N0)+(N9->N1)+(N9->N2)+(N9->N3)+(N9->N4)+(N9->N5)+(N9->N6)+(N9->N7)+(N9->N8)+(N9->N9)))
	(all n: Node - List.header_0.*next_0 | n.next_0 = Null)
}

pred PositiveCounterExample[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
	symmetryBreaking[header_0, next_0] and not repOK[thiz, header_0, size_0, next_0] and some result_0, result_1: boolean | repOKOK [thiz, header_0, size_0, next_0, result_0, result_1] and result_1 = true and result_0=false
}

run NegativeCounterExample for 3 but 5 int
run PositiveCounterExample for 3 but 5 int

