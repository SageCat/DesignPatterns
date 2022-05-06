package $01_Strategy;

import $01_Strategy.behaviors.FlyBehavior;
import $01_Strategy.behaviors.QuackBehavior;

/**
 * @author g84196891
 *
 * 环境类 Context
 */
public class Duck
{
    private String name;
    private FlyBehavior mFlyBehavior;
    private QuackBehavior mQuackBehavior;

    public Duck(String name)
    {
        this.name = name;
    }

    public FlyBehavior getFlyBehavior()
    {
        return mFlyBehavior;
    }

    public void setFlyBehavior(FlyBehavior flyBehavior)
    {
        mFlyBehavior = flyBehavior;
    }

    public QuackBehavior getQuackBehavior()
    {
        return mQuackBehavior;
    }

    public void setQuackBehavior(QuackBehavior quackBehavior)
    {
        mQuackBehavior = quackBehavior;
    }

    public void display()
    {
        System.out.println("this is the duck supper class for displaying, my name is " + this.name);
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }
}
