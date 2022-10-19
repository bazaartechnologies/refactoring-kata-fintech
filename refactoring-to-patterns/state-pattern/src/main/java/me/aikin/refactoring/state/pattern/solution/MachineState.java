package me.aikin.refactoring.state.pattern.solution;

import me.aikin.refactoring.state.pattern.GumballMachine;

public interface MachineState {
    String insertQuarter(GumballMachine machine);
    String turnCrank(GumballMachine machine);
    String dispense(GumballMachine machine);
    String ejectQuarter(GumballMachine machine);
}