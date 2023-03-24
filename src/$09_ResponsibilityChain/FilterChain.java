package $09_ResponsibilityChain;

import java.util.ArrayList;

/**
 * 封装具体处理者到一个链条的类
 * 也实现抽象处理者，便于 多个 处理链 相互绑定形成更长的链
 *
 * @author g84196891
 */
public class FilterChain implements Filter
{
    /** 持有一个 抽象处理者的 引用 */
    private final ArrayList<Filter> mFilters;

    public FilterChain()
    {
        mFilters = new ArrayList<>();
    }

    /**
     * 添加具体处理者到 ArrayList 中形成链条
     * @param filter 具体处理者
     * @return 返回链本身，以实现链式调用
     */
    public FilterChain addFilter(Filter filter)
    {
        mFilters.add(filter);
        return this;
    }

    /**
     * 遍历责任链中的所有 具体处理者，并对 被处理对象 进行逐次处理
     * @param message 被处理对象
     */
    @Override
    public void doFilter(Message message)
    {
        for (Filter filter : mFilters)
        {
            filter.doFilter(message);
        }
    }
}
