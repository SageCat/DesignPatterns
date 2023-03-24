package $09_ResponsibilityChain;

/**
 * 抽象处理者， 抽象方法中传入 需要被处理的对象
 *
 * @author g84196891
 */
public interface Filter
{
    /**
     * 定义 处理者 的统一规范
     * @param message 被处理对象
     */

    void doFilter(Message message);
}
