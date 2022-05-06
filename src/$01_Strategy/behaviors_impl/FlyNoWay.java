package $01_Strategy.behaviors_impl;

import $01_Strategy.behaviors.FlyBehavior;

/**
 * @author g84196891
 *
 * 具体策略类 ConcreteStrategy
 */
public class FlyNoWay implements FlyBehavior
{

    @Override
    public void fly()
    {
        System.out.println("I can't fly");
    }
}
