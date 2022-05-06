package $01_Strategy.behaviors_impl;

import $01_Strategy.behaviors.QuackBehavior;

public class QuackNoWay implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("I can't quack");
    }
}
