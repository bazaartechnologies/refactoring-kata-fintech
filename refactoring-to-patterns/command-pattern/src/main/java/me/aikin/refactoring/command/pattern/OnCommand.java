package me.aikin.refactoring.command.pattern;

public class OnCommand implements Command{

    private Light light;
    private Ceiling ceiling;
    private Stereo stereo;
    private int slot;

    public OnCommand(Light light, Ceiling ceiling, Stereo stereo) {
        this.light = light;
        this.ceiling = ceiling;
        this.stereo = stereo;
    }

    public void setSlot(int slot) {
        this.slot = slot;
    }

    @Override
    public void execute() {
        if (slot == 1)
            light.on();
        if (slot == 2)
            ceiling.high();
        if (slot == 3) {
            stereo.on();
            stereo.setCdStatus(true);
            stereo.setVolume(11);
        }
    }
}
