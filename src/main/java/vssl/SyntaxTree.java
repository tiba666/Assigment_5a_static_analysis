package vssl;

import states.State;

public interface SyntaxTree {
    State analyse(State condition);
}
