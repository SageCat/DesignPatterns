package $09_ResponsibilityChain;

/**
 * 具体处理者
 *
 * @author g84196891
 */
public class NumberToChineseFilter implements Filter
{

    @Override
    public void doFilter(Message message)
    {
        String msg = message.getMessage();
        msg = msg.replace("1", "一")
                .replace("2", "二")
                .replace("3", "三")
                .replace("4", "四")
                .replace("5", "五")
                .replace("6", "六")
                .replace("7", "七")
                .replace("8", "八")
                .replace("9", "九")
                .replace("0", "零");
        message.setMessage(msg);
    }
}
