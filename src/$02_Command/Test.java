package $02_Command;

import $02_Command.command_impl.CopyCommand;
import $02_Command.command_impl.DeleteCommand;

public class Test
{
    public static void main(String[] args)
    {
        // 发送者
        Invoker invoker = new Invoker();
        // 接收者
        TextEdit textEdit = new TextEdit();

        // 设置命令
        invoker.setCommand(new CopyCommand(textEdit));
        // 执行命令
        invoker.call();

        System.out.println(">>>>>>>>>>>>>>>>>>>");

        // 修改命令
        invoker.setCommand(new DeleteCommand(textEdit));
        // 再次执行命令
        invoker.call();
    }
}
