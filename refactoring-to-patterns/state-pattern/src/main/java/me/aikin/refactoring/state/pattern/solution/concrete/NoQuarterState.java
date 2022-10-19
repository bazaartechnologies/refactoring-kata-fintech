package me.aikin.refactoring.state.pattern.solution.concrete;

import me.aikin.refactoring.state.pattern.GumballMachine;
import me.aikin.refactoring.state.pattern.solution.MachineState;

public class NoQuarterState implements MachineState {
    public final String insertedQuarterMessage = "insertedQuarterMessage";
    private final String NoQuarterMessage = "NoQuarterMessage";

    @Override
    public String insertQuarter(GumballMachine machine) {
        machine.setState(new HasQuarterState());
        return insertedQuarterMessage;
    }

    @Override
    public String turnCrank(GumballMachine machine) {
        return NoQuarterMessage;
    }

    @Override
    public String dispense(GumballMachine machine) {
        return NoQuarterMessage;
    }

    @Override
    public String ejectQuarter(GumballMachine machine) {
        return NoQuarterMessage;
    }
}