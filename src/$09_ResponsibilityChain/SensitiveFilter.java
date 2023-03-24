package $09_ResponsibilityChain;

/**
 * 具体处理者
 *
 * @author g84196891
 */
public class SensitiveFilter implements Filter
{

    @Override
    public void doFilter(Message message)
    {
        String msg = message.getMessage();
        msg = msg.replace("996", "955").replace("加班", "不加班");
        message.setMessage(msg);
    }
}
