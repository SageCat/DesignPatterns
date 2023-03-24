package $09_ResponsibilityChain;

/**
 * 被处理对象的类
 *
 * @author g84196891
 */
public class Message
{
    private String name;
    private String message;


    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public Message(String name)
    {
        this.name = name;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }

    @Override
    public String toString()
    {
        return "Message{" +
                "message='" + message + '\'' +
                '}';
    }
}
