package $01_Strategy.behaviors_impl;

import $01_Strategy.behaviors.QuackBehavior;

/**
 * @author g84196891
 *
 * 具体策略类 ConcreteStrategy
 */
public class QuackLoudly implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("Ga Ga Ga ......");
    }
}
