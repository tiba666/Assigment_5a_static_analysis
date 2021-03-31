package vssl;

import states.State;

public class DefinitionStatement implements SyntaxTree{
    private String name;

    public DefinitionStatement(String name) {
        this.name = name;
    }

    @Override
    public State analyse(State precondition) {
        precondition.setname(name) = Range(0, 0, true);
        return precondition;
    }
}
