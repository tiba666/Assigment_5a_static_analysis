package vssl;

import states.State;
import states.ValueSet;

import java.util.HashMap;
import java.util.Map;

public class MappedState implements State {
  private Map<String, ValueSet> variables = new HashMap<>();

  public MappedState() { }

  public void put(String variableName, ValueSet values) {
    throw new UnsupportedOperationException();
    }

  public void put(String variableName) {
    // all values
    }

  @Override
  public ValueSet valuesOf(String variableName) {
    return null;
    }

  @Override
  public boolean subStateOf(State other) {
    if (other instanceof MappedState) {
      var mapped = (MappedState)other;
      for (String variableName : mapped.variables.keySet()) {
        var thisVariable = variables.get(variableName);
        if (thisVariable == null) return false;
        var otherVariable = mapped.variables.get(variableName);
        return thisVariable.subsetOf(otherVariable);
        }
      }
    return false;
    }

  @Override
  public State unite() {
    return null;
  }

  @Override
  public State intersect() {
    return null;
  }

  @Override
  public String setname(String name) {
    return null;
  }

}
