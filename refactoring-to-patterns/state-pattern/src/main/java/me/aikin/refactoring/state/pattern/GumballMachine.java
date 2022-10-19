package me.aikin.refactoring.state.pattern;

import me.aikin.refactoring.state.pattern.solution.MachineState;

public class GumballMachine {
    private int GumballNum;
    private MachineState State;

    public GumballMachine(int gumballNum, MachineState machineState) {
        GumballNum = gumballNum;
        State = machineState;
    }

    public int getGumballNum() {
        return GumballNum;
    }

    public void setGumballNum(int gumballNum) {
        GumballNum = gumballNum;
    }

    public MachineState getState() {
        return State;
    }

    public void setState(MachineState state) {
        State = state;
    }


    public String insertQuarter() {
        return State.insertQuarter(this);
    }

    public String turnCrank() {
        return State.turnCrank(this);
    }

    public String dispense() {
        return State.dispense(this);
    }

    public String ejectQuarter() {
        return State.ejectQuarter(this);
    }
}

