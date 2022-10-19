package me.aikin.refactoring.command.pattern;

public class OffCommand implements Command {

    private Light light;
    private Ceiling ceiling;
    private Stereo stereo;
    private int slot;

    public OffCommand(Light light, Ceiling ceiling, Stereo stereo) {
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
            light.off();
        if (slot == 2)
            ceiling.off();
        if (slot == 3)
            stereo.off();
    }

}
