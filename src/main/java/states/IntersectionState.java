package states;

public class IntersectionState {
    private State left;
    private State right;
    public IntersectionState(State left, State right) {
        this.left = left;
        this.right = right;
    }
}
