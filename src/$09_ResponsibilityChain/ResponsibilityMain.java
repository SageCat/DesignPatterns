package $09_ResponsibilityChain;

/**
 * 测试类
 *
 * @author g84196891
 */
public class ResponsibilityMain
{
    public static void main(String[] args)
    {
        Message message = new Message("小王");
        message.setMessage("hello, 我们公司 <&nbsp> 是一个非常人性化的公司，员工经常996， 每天都加班！！！");

//        firstVersion(message);
        secondVersion(message);

    }

    private static void firstVersion(Message message)
    {
        System.out.println("============== 处理前 ==============");
        System.out.println(message.getName() + " 说: " + message.getMessage());

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());
        filterChain.doFilter(message);
        System.out.println("============== 第一次处理后 ==============");
        System.out.println(message.getName() + " 说: " + message.getMessage());

        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new NumberToChineseFilter()).addFilter(new EnglishToChinese());
        filterChain1.doFilter(message);
        System.out.println("============== 第二次处理后 ==============");
        System.out.println(message.getName() + " 说: " + message.getMessage());
    }

    private static void secondVersion(Message message)
    {
        System.out.println("============== 处理前 ==============");
        System.out.println(message.getName() + " 说: " + message.getMessage());

        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new HTMLFilter()).addFilter(new SensitiveFilter());

        FilterChain filterChain1 = new FilterChain();
        filterChain1.addFilter(new NumberToChineseFilter()).addFilter(new EnglishToChinese());

        filterChain.addFilter(filterChain1);
        filterChain.doFilter(message);
        System.out.println("============== 处理后 ==============");
        System.out.println(message.getName() + " 说: " + message.getMessage());
    }
}
