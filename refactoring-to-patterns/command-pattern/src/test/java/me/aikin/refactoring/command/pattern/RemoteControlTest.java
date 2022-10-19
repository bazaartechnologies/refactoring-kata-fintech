package me.aikin.refactoring.command.pattern;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class RemoteControlTest {

    @Test
    public void should_turn_on_light_when_press_first_on_button() {
        Light light = new Light();
        OnCommand onCommand = new OnCommand(light, null, null);
        onCommand.setSlot(1);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.takeCommands(onCommand);
        remoteControl.executeCommands();

        assertTrue(light.status());
    }

    @Test
    public void should_turn_off_light_when_press_first_off_button() {
        Light light = new Light();
        OffCommand offCommand = new OffCommand(light, null, null);
        offCommand.setSlot(1);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.takeCommands(offCommand);
        remoteControl.executeCommands();

        assertFalse(light.status());
    }

    @Test
    public void should_turn_on_ceiling_when_press_second_on_button() {
        Ceiling ceiling = new Ceiling();
        OnCommand onCommand = new OnCommand(null, ceiling, null);
        onCommand.setSlot(2);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.takeCommands(onCommand);
        remoteControl.executeCommands();

        assertEquals(CeilingSpeed.High, ceiling.getSpeed());
    }

    @Test
    public void should_turn_off_ceiling_when_press_second_off_button() {
        Ceiling ceiling = new Ceiling();
        OffCommand offCommand = new OffCommand(null, ceiling, null);
        offCommand.setSlot(2);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.takeCommands(offCommand);
        remoteControl.executeCommands();

        assertEquals(CeilingSpeed.Off, ceiling.getSpeed());
    }

    @Test
    public void should_turn_on_stereo_when_press_third_on_button() {
        Stereo stereo = new Stereo();
        OnCommand onCommand = new OnCommand(null, null, stereo);
        onCommand.setSlot(3);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.takeCommands(onCommand);
        remoteControl.executeCommands();

        assertTrue(stereo.getStereoStatus());
        assertTrue(stereo.getCdStatus());
        assertEquals(11, stereo.getVolume());
    }

    @Test
    public void should_turn_off_stereo_when_press_third_off_button() {
        Stereo stereo = new Stereo();
        OffCommand offCommand = new OffCommand(null, null, stereo);
        offCommand.setSlot(3);
        RemoteControl remoteControl = new RemoteControl();
        remoteControl.takeCommands(offCommand);
        remoteControl.executeCommands();

        assertFalse(stereo.getCdStatus());
        assertFalse(stereo.getCdStatus());
        assertEquals(0, stereo.getVolume());
    }
}