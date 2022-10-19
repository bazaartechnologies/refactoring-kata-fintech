package me.aikin.refactoring.state.pattern.solution.concrete;

import me.aikin.refactoring.state.pattern.GumballMachine;
import me.aikin.refactoring.state.pattern.solution.MachineState;

public class SoldOutState implements MachineState {
    private final String soldOutMessage = "soldOutMessage";

    @Override
    public String insertQuarter(GumballMachine machine) {
        return soldOutMessage;
    }

    @Override
    public String turnCrank(GumballMachine machine) {
        return soldOutMessage;
    }

    @Override
    public String dispense(GumballMachine machine) {
        return soldOutMessage;
    }

    @Override
    public String ejectQuarter(GumballMachine machine) {
        return soldOutMessage;
    }
}