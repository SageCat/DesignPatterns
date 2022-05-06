package $02_Command.command_impl;

import $02_Command.TextEdit;
import $02_Command.command.Command;

public class DeleteCommand implements Command
{
    private TextEdit mTextEdit;

    public DeleteCommand(TextEdit textEdit)
    {
        mTextEdit = textEdit;
    }

    @Override
    public void execute()
    {
        System.out.println("Delete command is received...");
        mTextEdit.delete();
    }
}
