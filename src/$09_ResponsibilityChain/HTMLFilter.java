package $09_ResponsibilityChain;

/**
 * 具体处理者
 *
 * @author g84196891
 */
public class HTMLFilter implements Filter
{
    @Override
    public void doFilter(Message message)
    {
        String msg = message.getMessage();
        msg = msg.replace("<", "[").replace(">", "]");
        message.setMessage(msg);
    }
}
