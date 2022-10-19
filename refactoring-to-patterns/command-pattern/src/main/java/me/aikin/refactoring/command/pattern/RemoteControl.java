package me.aikin.refactoring.command.pattern;

import java.util.ArrayList;
import java.util.List;

public class RemoteControl {

    private List<Command> commands = new ArrayList<>();

    public void takeCommands(Command command) {
        commands.add(command);
    }

    public void executeCommands() {
        for (Command command : commands) {
            command.execute();
        }
        commands.clear();
    }
}
