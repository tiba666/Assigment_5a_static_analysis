package states;

public interface State {

    ValueSet valuesOf(String variableName);
    boolean subStateOf(State other);
    default State conjunction(State other) {  // fancy ord for and
        return new ConjunctionState(this, other);
    }
    String setname(String name);

}
