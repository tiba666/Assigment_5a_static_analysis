package states;

public class ConjunctionState implements State {

    private State left;
    private State right;

    public ConjunctionState(State left, State right) {
        this.left = left;
        this.right = right;
    }

    @Override
    public ValueSet valuesOf(String variableName) {
        ValueSet valueSetLeft = left.valuesOf(variableName);
        ValueSet valueSetRight = right.valuesOf(variableName);
        ValueSet union = valueSetLeft.union(valueSetRight);
        return union;
    }

    @Override
    public boolean subStateOf(State other) {
        return false;
    }

    @Override
    public State unite() {
        return (State) new UnionState(this.left, this.right);
    }

    @Override
    public State intersect() {
        return (State) new IntersectionState(this.left, this.right);
    }

    @Override
    public String setname(String name) {
        return null;
    }

}
