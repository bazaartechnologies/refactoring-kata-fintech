package me.aikin.refactoring.state.pattern;

import me.aikin.refactoring.state.pattern.solution.concrete.HasQuarterState;
import me.aikin.refactoring.state.pattern.solution.concrete.NoQuarterState;
import me.aikin.refactoring.state.pattern.solution.concrete.SoldOutState;
import me.aikin.refactoring.state.pattern.solution.concrete.SoldState;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class GumballMachineTest {
    @Test
    public void gumball_machine_status_should_be_no_quarter_at_start() {
        GumballMachine gumballMachine = new GumballMachine(10, new NoQuarterState());
        assertTrue(gumballMachine.getState() instanceof NoQuarterState);
    }

    @Test
    public void gumball_machine_status_should_be_has_quarter_if_insert_a_quarter() {
        GumballMachine gumballMachine = new GumballMachine(10, new NoQuarterState());
        gumballMachine.insertQuarter();
        assertTrue(gumballMachine.getState() instanceof HasQuarterState);

    }

    @Test
    public void gumball_machine_status_should_be_no_quarter_if_eject_quarter_when_status_is_has_quarter() {
        GumballMachine gumballMachine = new GumballMachine(10, new HasQuarterState());
        gumballMachine.ejectQuarter();
        assertTrue(gumballMachine.getState() instanceof NoQuarterState);
    }

    @Test
    public void gumball_machine_status_should_be_sold_if_turn_crank_given_status_is_has_quarter() {
        GumballMachine gumballMachine = new GumballMachine(1, new HasQuarterState());
        gumballMachine.turnCrank();
        assertTrue(gumballMachine.getState() instanceof SoldState);

    }

    @Test
    public void gumball_machine_status_should_back_to_no_quarter_if_dispense_given_has_gumball_and_status_is_sold() {
        GumballMachine gumballMachine = new GumballMachine(10, new SoldState());
        gumballMachine.dispense();
        assertEquals(gumballMachine.getGumballNum(), 9);
        assertTrue(gumballMachine.getState() instanceof NoQuarterState);

    }

    @Test
    public void gumball_machine_status_should_be_sold_out_if_dispense_given_no_gumball_and_status_is_sold() {
        GumballMachine gumballMachine = new GumballMachine(1, new SoldState());
        gumballMachine.dispense();
        assertTrue(gumballMachine.getState() instanceof SoldOutState);
    }
}