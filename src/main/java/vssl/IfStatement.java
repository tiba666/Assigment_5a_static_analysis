package vssl;

import states.State;
import states.ValueSet;

public class IfStatement implements Statement{
    boolean predicate;
    Block thenBlock;

    public IfStatement(boolean predicate, Block thenBlock) {
        this.predicate = predicate;
        this.thenBlock = thenBlock;
    }

    @Override
    public State analyse(State[] precondition) {
        State[] condition = precondition;
        for (State state : precondition)
        {
            condition = state.
        }
        return condition[0];
    }
}
