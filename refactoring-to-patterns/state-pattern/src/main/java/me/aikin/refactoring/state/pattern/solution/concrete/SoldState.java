package me.aikin.refactoring.state.pattern.solution.concrete;

import me.aikin.refactoring.state.pattern.GumballMachine;
import me.aikin.refactoring.state.pattern.solution.MachineState;

public class SoldState implements MachineState {
    private final String soldMessage = "soldMessage";
    private final String noGumballMessage = "noGumballMessage";
    private final String dispenseSuccessMessage = "dispenseSuccessMessage";

    @Override
    public String insertQuarter(GumballMachine machine) {
        return soldMessage;
    }

    @Override
    public String turnCrank(GumballMachine machine) {
        return soldMessage;
    }

    @Override
    public String dispense(GumballMachine machine) {
        int gNum = machine.getGumballNum();
        gNum -= 1;
        machine.setGumballNum(gNum);
        if (gNum == 0) {
            machine.setState(new SoldOutState());
            return noGumballMessage;
        }
        machine.setState(new NoQuarterState());
        return dispenseSuccessMessage;
    }

    @Override
    public String ejectQuarter(GumballMachine machine) {
        return soldMessage;
    }
}