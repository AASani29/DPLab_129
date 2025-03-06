package services;

import commands.Command;

public class CommandInvoker {
    public void executeCommand(Command command) {
        command.execute();
    }
}
