module lobsters

open util/integer

one sig Null {}

abstract sig Lobsters {}
abstract sig Collection_Story {}
abstract sig Story {}
abstract sig boolean {}

one sig L0,L1 extends Lobsters {}
one sig C0 extends Collection_Story {}
one sig S0 extends Story {}
one sig true extends boolean {}
one sig false extends boolean {}

pred sourceRepOK [
    thizPre: Lobsters,
    thiz: Lobsters,
    _var1351: Lobsters -> one (Collection_Story+Null),
    merged_story_id: Story -> one Int,
    is_expired: Story -> one boolean,
    created_at: Story -> one Int,
    vote_count: Story -> one Int] {
    thizPre != thiz
}

pred repOK[
    thizPre: Lobsters,
    thiz: Lobsters,
    _var1351: Lobsters -> one (Collection_Story+Null),
    merged_story_id: Story -> one Int,
    is_expired: Story -> one boolean,
    created_at: Story -> one Int,
    vote_count: Story -> one Int] {
--repOKBody
}

pred NegativeCounterExample[
    thizPre: Lobsters,
    thiz: Lobsters,
    _var1351: Lobsters -> one (Collection_Story+Null),
    merged_story_id: Story -> one Int,
    is_expired: Story -> one boolean,
    created_at: Story -> one Int,
    vote_count: Story -> one Int] {
    repOK[thizPre, thiz, _var1351, merged_story_id, is_expired, created_at, vote_count] and 
    not sourceRepOK [thizPre, thiz, _var1351, merged_story_id, is_expired, created_at, vote_count]
}

pred PositiveCounterExample[
    thizPre: Lobsters,
    thiz: Lobsters,
    _var1351: Lobsters -> one (Collection_Story+Null),
    merged_story_id: Story -> one Int,
    is_expired: Story -> one boolean,
    created_at: Story -> one Int,
    vote_count: Story -> one Int] {
    not repOK[thizPre, thiz, _var1351, merged_story_id, is_expired, created_at, vote_count] and 
    sourceRepOK [thizPre, thiz, _var1351, merged_story_id, is_expired, created_at, vote_count]
}

run NegativeCounterExample for 3 but 3 int
run PositiveCounterExample for 3 but 3 int
