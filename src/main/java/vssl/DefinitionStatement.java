package vssl;

import states.State;

public class DefinitionStatement implements SyntaxTree {
    private String name;

    public DefinitionStatement(String name) {
        this.name = name;
    }

    @Override
    public State analyse(State precondition) {
        RangeValueSet rangeValueSet = new RangeValueSet(true, 0, 0);
        precondition.setname(rangeValueSet.toString());
        return precondition;
    }

    @Override
    public String printTree() {
        return "tree info: \n " + name + "";
    }
}
