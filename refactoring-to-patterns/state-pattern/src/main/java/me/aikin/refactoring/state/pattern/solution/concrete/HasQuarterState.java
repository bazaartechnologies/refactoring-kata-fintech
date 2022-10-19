package me.aikin.refactoring.state.pattern.solution.concrete;

import me.aikin.refactoring.state.pattern.GumballMachine;
import me.aikin.refactoring.state.pattern.solution.MachineState;

public class HasQuarterState implements MachineState {
    private final String soldCorrectMessage = "soldCorrectMessage";
    private final String hasQuarterMessage = "hasQuarterMessage";
    private final String ejectSuccessMessage = "ejectSuccessMessage";

    @Override
    public String insertQuarter(GumballMachine machine) {
        return hasQuarterMessage;
    }

    @Override
    public String turnCrank(GumballMachine machine) {
        machine.setState(new SoldState());
        return soldCorrectMessage;
    }

    @Override
    public String dispense(GumballMachine machine) {
        return hasQuarterMessage;
    }

    @Override
    public String ejectQuarter(GumballMachine machine) {
        machine.setState(new NoQuarterState());
        return ejectSuccessMessage;
    }
}