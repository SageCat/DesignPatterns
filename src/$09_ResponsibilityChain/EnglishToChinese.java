package $09_ResponsibilityChain;

/**
 * 具体处理者
 *
 * @author g84196891
 */
public class EnglishToChinese implements Filter
{
    @Override
    public void doFilter(Message message)
    {
        String msg = message.getMessage();
        msg = msg.replace("hello", "你好")
                 .replace("hi", "你好");
        message.setMessage(msg);
    }
}
