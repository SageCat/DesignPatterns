package $01_Strategy;

import $01_Strategy.behaviors_impl.FlyNoWay;
import $01_Strategy.behaviors_impl.QuackNoWay;

/**
 * @author g84196891
 */
public class WoodenDuck extends Duck
{
    public WoodenDuck(String name)
    {
        super(name);
        setFlyBehavior(new FlyNoWay());
        setQuackBehavior(new QuackNoWay());
    }

}
