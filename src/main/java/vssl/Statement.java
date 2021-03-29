package vssl;

import states.State;

public interface Statement {
    public State analyse(State[] precondition);
}
