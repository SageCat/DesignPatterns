package $01_Strategy.behaviors_impl;

import $01_Strategy.behaviors.QuackBehavior;

public class QuackLoudly implements QuackBehavior
{
    @Override
    public void quack()
    {
        System.out.println("Ga Ga Ga ......");
    }
}
