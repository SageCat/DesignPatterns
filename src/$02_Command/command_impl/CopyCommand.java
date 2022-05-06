package $02_Command.command_impl;

import $02_Command.TextEdit;
import $02_Command.command.Command;

public class CopyCommand implements Command
{
    private TextEdit mTextEdit;

    public CopyCommand(TextEdit textEdit)
    {
        mTextEdit = textEdit;
    }

    @Override
    public void execute()
    {
        System.out.println("Copy command is received...");
        mTextEdit.copy();
    }
}
