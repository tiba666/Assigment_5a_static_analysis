package vssl;

public interface Statement extends State {
    public State analyse(State precondition);
}
