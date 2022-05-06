package $02_Command;

import $02_Command.command.Command;

public class Invoker
{
    Command mCommand;

    public void setCommand(Command command)
    {
        mCommand = command;
    }

    public void call()
    {
        System.out.println("command is going to be sent...");
        mCommand.execute();
    }
}
