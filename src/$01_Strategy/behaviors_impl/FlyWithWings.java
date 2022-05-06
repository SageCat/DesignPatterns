package $01_Strategy.behaviors_impl;

import $01_Strategy.behaviors.FlyBehavior;

/**
 * @author g84196891
 */
public class FlyWithWings implements FlyBehavior
{
    @Override
    public void fly()
    {
        System.out.println("I'm flying with wings");
    }
}
