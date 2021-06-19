module linkedListRepOk

open util/integer

one sig Null {}

abstract sig Node {}

one sig N0 extends Node {}

one sig N1 extends Node {}

one sig N2 extends Node {}

one sig N3 extends Node {}

one sig N4 extends Node {}

abstract sig List {}

one sig L0 extends List {}

abstract sig boolean {}

one sig true extends boolean {}

one sig false extends boolean {}

one sig QF{
	current_1 : one Node + Null, 
	current_2 : one Node + Null, 
	current_3 : one Node + Null, 
	current_4 : one Node + Null, 
	current_5 : one Node + Null, 
	current_6 : one Node + Null, 
	nodesToVisit_1 : one Int, 
	nodesToVisit_2 : one Int, 
	nodesToVisit_3 : one Int, 
	nodesToVisit_4 : one Int, 
	nodesToVisit_5 : one Int, 
	nodesToVisit_6 : one Int
}


/*pred repOKOK [thiz_0: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null), result_0, result_1: boolean] {
  (QF.nodesToVisit_1 = thiz_0.size_0 and QF.current_1 = thiz_0.header_0 and 
	(
		(lt[thiz_0.size_0, 0] and result_1 = false and QF.current_1 = QF.current_6 and QF.current_1 = QF.current_2 and QF.current_1 = QF.current_3
		and QF.current_1 = QF.current_4 and QF.current_1 = QF.current_5 
		and QF.nodesToVisit_1 = QF.nodesToVisit_6 and QF.nodesToVisit_1 = QF.nodesToVisit_2 and QF.nodesToVisit_1 = QF.nodesToVisit_3
		and QF.nodesToVisit_1 = QF.nodesToVisit_4 and QF.nodesToVisit_1 = QF.nodesToVisit_5) 
		or 
		(not lt[thiz_0.size_0, 0] and 
			(
				(QF.current_1 = QF.current_6 and QF.current_1 = QF.current_2 and QF.current_1 = QF.current_3 and QF.current_1 = QF.current_4
				and QF.current_1 = QF.current_5 and QF.nodesToVisit_1 = QF.nodesToVisit_6 and QF.nodesToVisit_1 = QF.nodesToVisit_2
				and QF.nodesToVisit_1 = QF.nodesToVisit_3 and QF.nodesToVisit_1 = QF.nodesToVisit_4 and QF.nodesToVisit_1 = QF.nodesToVisit_5) 
				or 
				(gt[QF.nodesToVisit_1, 0] and QF.current_1 != Null and QF.nodesToVisit_2 = sub[QF.nodesToVisit_1, 1] 
				and QF.current_2 = QF.current_1.next_0 and (
					(QF.current_2 = QF.current_6 and QF.current_2 = QF.current_3 and QF.current_2 = QF.current_4 and QF.current_2 = QF.current_5
					and QF.nodesToVisit_2 = QF.nodesToVisit_6 and QF.nodesToVisit_2 = QF.nodesToVisit_3 and QF.nodesToVisit_2 = QF.nodesToVisit_4
					and QF.nodesToVisit_2 = QF.nodesToVisit_5) 
					or 
					(gt[QF.nodesToVisit_2, 0] and QF.current_2 != Null and QF.nodesToVisit_3 = sub[QF.nodesToVisit_2, 1] 
					and QF.current_3 = QF.current_2.next_0 and (
						(QF.current_3 = QF.current_6 and QF.current_3 = QF.current_4 and QF.current_3 = QF.current_5 
						and QF.nodesToVisit_3 = QF.nodesToVisit_6 and QF.nodesToVisit_3 = QF.nodesToVisit_4 and QF.nodesToVisit_3 = QF.nodesToVisit_5) 
						or 
						(gt[QF.nodesToVisit_3, 0] and QF.current_3 != Null and QF.nodesToVisit_4 = sub[QF.nodesToVisit_3, 1] 
						and QF.current_4 = QF.current_3.next_0 and (
							(QF.current_4 = QF.current_6 and QF.current_4 = QF.current_5
							and QF.nodesToVisit_4 = QF.nodesToVisit_6 and QF.nodesToVisit_4 = QF.nodesToVisit_5) 
							or 
							(gt[QF.nodesToVisit_4, 0] and QF.current_4 != Null and QF.nodesToVisit_5 = sub[QF.nodesToVisit_4, 1] 
							and QF.current_5 = QF.current_4.next_0 and (
								(QF.current_5 = QF.current_6 and QF.nodesToVisit_5 = QF.nodesToVisit_6 ) 
								or 
								(gt[QF.nodesToVisit_5, 0] and QF.current_5 != Null and QF.nodesToVisit_6 = sub[QF.nodesToVisit_5, 1] 
								and QF.current_6 = QF.current_5.next_0 ) ) ) ) ) ) ) ) ) ) and not (gt[QF.nodesToVisit_6, 0] and QF.current_6 != Null ) and ((eq[QF.nodesToVisit_6, 0] and QF.current_6 = Null and result_1 = true ) or (not (eq[QF.nodesToVisit_6, 0] and QF.current_6 = Null ) and result_1 = false ) ) ) ) )
 
}*/
 
pred repOKOK [thiz_0: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null), result_0, result_1: boolean] {
 (QFrepOKOKDYN314.nodesToVisit_1 = thiz_0.size_0 and QFrepOKOKDYN314.current_1 = thiz_0.header_0 and ((lt[thiz_0.size_0, 0] and result_1 = false and QFrepOKOKDYN314.current_1 = QFrepOKOKDYN314.current_6 and QFrepOKOKDYN314.nodesToVisit_1 = QFrepOKOKDYN314.nodesToVisit_6 ) or (not lt[thiz_0.size_0, 0] and ((QFrepOKOKDYN314.current_1 = QFrepOKOKDYN314.current_6 and QFrepOKOKDYN314.nodesToVisit_1 = QFrepOKOKDYN314.nodesToVisit_6 ) or (gt[QFrepOKOKDYN314.nodesToVisit_1, 0] and QFrepOKOKDYN314.current_1 != Null and QFrepOKOKDYN314.nodesToVisit_2 = sub[QFrepOKOKDYN314.nodesToVisit_1, 1] and QFrepOKOKDYN314.current_2 = QFrepOKOKDYN314.current_1.next_0 and ((QFrepOKOKDYN314.current_2 = QFrepOKOKDYN314.current_6 and QFrepOKOKDYN314.nodesToVisit_2 = QFrepOKOKDYN314.nodesToVisit_6 ) or (gt[QFrepOKOKDYN314.nodesToVisit_2, 0] and QFrepOKOKDYN314.current_2 != Null and QFrepOKOKDYN314.nodesToVisit_3 = sub[QFrepOKOKDYN314.nodesToVisit_2, 1] and QFrepOKOKDYN314.current_3 = QFrepOKOKDYN314.current_2.next_0 and ((QFrepOKOKDYN314.current_3 = QFrepOKOKDYN314.current_6 and QFrepOKOKDYN314.nodesToVisit_3 = QFrepOKOKDYN314.nodesToVisit_6 ) or (gt[QFrepOKOKDYN314.nodesToVisit_3, 0] and QFrepOKOKDYN314.current_3 != Null and QFrepOKOKDYN314.nodesToVisit_4 = sub[QFrepOKOKDYN314.nodesToVisit_3, 1] and QFrepOKOKDYN314.current_4 = QFrepOKOKDYN314.current_3.next_0 and ((QFrepOKOKDYN314.current_4 = QFrepOKOKDYN314.current_6 and QFrepOKOKDYN314.nodesToVisit_4 = QFrepOKOKDYN314.nodesToVisit_6 ) or (gt[QFrepOKOKDYN314.nodesToVisit_4, 0] and QFrepOKOKDYN314.current_4 != Null and QFrepOKOKDYN314.nodesToVisit_5 = sub[QFrepOKOKDYN314.nodesToVisit_4, 1] and QFrepOKOKDYN314.current_5 = QFrepOKOKDYN314.current_4.next_0 and ((QFrepOKOKDYN314.current_5 = QFrepOKOKDYN314.current_6 and QFrepOKOKDYN314.nodesToVisit_5 = QFrepOKOKDYN314.nodesToVisit_6 ) or (gt[QFrepOKOKDYN314.nodesToVisit_5, 0] and QFrepOKOKDYN314.current_5 != Null and QFrepOKOKDYN314.nodesToVisit_6 = sub[QFrepOKOKDYN314.nodesToVisit_5, 1] and QFrepOKOKDYN314.current_6 = QFrepOKOKDYN314.current_5.next_0 ) ) ) ) ) ) ) ) ) ) and not (gt[QFrepOKOKDYN314.nodesToVisit_6, 0] and QFrepOKOKDYN314.current_6 != Null ) and ((eq[QFrepOKOKDYN314.nodesToVisit_6, 0] and QFrepOKOKDYN314.current_6 = Null and result_1 = true ) or (not (eq[QFrepOKOKDYN314.nodesToVisit_6, 0] and QFrepOKOKDYN314.current_6 = Null ) and result_1 = false ) ) ) ) )
 
}
 
one sig QFrepOKOKDYN314{
	current_1 : one Node + Null, 
	current_2 : one Node + Null, 
	current_3 : one Node + Null, 
	current_4 : one Node + Null, 
	current_5 : one Node + Null, 
	current_6 : one Node + Null, 
	nodesToVisit_1 : one Int, 
	nodesToVisit_2 : one Int, 
	nodesToVisit_3 : one Int, 
	nodesToVisit_4 : one Int, 
	nodesToVisit_5 : one Int, 
	nodesToVisit_6 : one Int
}

pred repOK[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
--repOKBody
}

pred symmetryBreaking[header_0: List ->one (Node + Null), next_0: Node ->one (Node + Null)] {
	(header_0 in ((L0->Null)+(L0->N0))) and
	(next_0 in (N0->Null)+(N0->N0)+(N0->N1)+(N1->Null)+(N1->N0)+(N1->N1)+(N1->N2)+(N2->Null)+(N2->N0)+(N2->N1)+(N2->N2)+(N2->N3)+(N3->Null)+(N3->N0)+(N3->N1)+(N3->N2)+(N3->N3)+(N3->N4)+(N4->Null)+(N4->N0)+(N4->N1)+(N4->N2)+(N4->N3)+(N4->N4)) and
	(all n: Node - List.header_0.*next_0 | n.next_0 = Null)
}

pred NegativeCounterExample[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
	symmetryBreaking[header_0, next_0] and repOK[thiz, header_0, size_0, next_0] and some result_0, result_1: boolean | repOKOK [thiz, header_0, size_0, next_0, result_0, result_1] and result_1 = false and result_0=false
}

pred PositiveCounterExample[thiz: List, header_0: List ->one (Node + Null), size_0: List ->one Int, next_0: Node ->one (Node + Null)] {
	symmetryBreaking[header_0, next_0] and not repOK[thiz, header_0, size_0, next_0] and some result_0, result_1: boolean | repOKOK [thiz, header_0, size_0, next_0, result_0, result_1] and result_1 = true and result_0=false
}

run NegativeCounterExample for 3 but 4 int
run PositiveCounterExample for 3 but 4 int
