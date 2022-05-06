package $01_Strategy.behaviors_impl;

import $01_Strategy.behaviors.FlyBehavior;

public class FlyNoWay implements FlyBehavior
{

    @Override
    public void fly()
    {
        System.out.println("I can't fly");
    }
}
