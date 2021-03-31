package vssl;

import states.State;
import states.ValueSet;

public class Main {
    public static void main(String[] args) {
        State precondition = new State() {
            @Override
            public ValueSet valuesOf(String variableName) {
                return this.valuesOf(variableName);
            }

            @Override
            public boolean subStateOf(State other) {
                return this.subStateOf(other);
            }

            @Override
            public String setname(String name) {
                return name;
            }
        };
        State postCondition = new State() {
            @Override
            public ValueSet valuesOf(String variableName) {
                return this.valuesOf(variableName);
            }

            @Override
            public boolean subStateOf(State other) {
                return this.subStateOf(other);
            }

            @Override
            public String setname(String name) {
                return name;
            }
        };
        /*
        SyntaxTree syntaxTree = new SyntaxTree() {
            @Override
            public State analyse(State condition) {
                return
            }
        };
         */
        Program program = new Program(new DefinitionStatement("X"),
                new IfStatement(true, new Block()));
        for (SyntaxTree tree : program.getTrees()){
            System.out.println(tree.toString() + "\n");
        }

        /*
        State analyse_pre = syntaxTree.analyse(precondition);
        if (analyse_pre.subStateOf(postCondition)){
            System.out.println("Found substate");
        }
        IfStatement ifStatement = new IfStatement(true, new Block(syntaxTree));
        State analyse = ifStatement.analyse(precondition);
        boolean b = analyse.subStateOf(postCondition);

         */
    }
}
