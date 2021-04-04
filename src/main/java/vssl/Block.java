package vssl;

import states.State;
import states.ValueSet;

import java.util.ArrayList;


public class Block implements SyntaxTree {

    public SyntaxTree[] getTrees() {
        return tree;
    }

    private SyntaxTree[] tree;

    public Block(SyntaxTree... tree) {
        this.tree = tree;
    }

    @Override
    public State analyse(State precondition) {
        State conjunction = precondition.conjunction(precondition);
        return conjunction;
    }

    @Override
    public String printTree() {
        return null;
    }
}
