package vssl;

import states.State;
import states.ValueSet;

public class IfStatement implements SyntaxTree {
    boolean predicate;
    Block thenBlock;

    public IfStatement(boolean predicate, Block thenBlock) {
        this.predicate = predicate;
        this.thenBlock = thenBlock;
    }

    @Override
    public State analyse(State precondition) {
        State condition = precondition;
        for (SyntaxTree tree : thenBlock.getTrees()) {
            condition = tree.analyse(condition);
        }
        return condition;
    }
}
