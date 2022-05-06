package $01_Strategy;

import $01_Strategy.behaviors_impl.FlyWithWings;
import $01_Strategy.behaviors_impl.QuackLoudly;

/**
 * @author g84196891
 */
public class FlyDuck extends Duck
{
    public FlyDuck(String name)
    {
        super(name);
        setFlyBehavior(new FlyWithWings());
        setQuackBehavior(new QuackLoudly());
    }
}
