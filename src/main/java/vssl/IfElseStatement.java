package vssl;

import states.State;

public class IfElseStatement implements SyntaxTree{
    boolean predicate;
    Block thenBlock;
    Block ElseBlock;

    public IfElseStatement(boolean predicate, Block thenBlock, Block elseBlock) {
        this.predicate = predicate;
        this.thenBlock = thenBlock;
        this.ElseBlock = elseBlock;
    }


    @Override
    public State analyse(State precondition) {
        return null;
    }

    @Override
    public String printTree() {
        return null;
    }
}
