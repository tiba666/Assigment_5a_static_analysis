public interface State {

    ValueSet valuesOf(String variableName);
    boolean subStateOf(State other);

}
