package $01_Strategy;

/**
 * @author g84196891
 */
public class Test
{
    public static void main(String[] args)
    {
        FlyDuck flying = new FlyDuck("Flying");
        flying.getFlyBehavior().fly();
        flying.getQuackBehavior().quack();
        flying.display();

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");

        WoodenDuck woodenDuck = new WoodenDuck("Wooden Duck");
        woodenDuck.getFlyBehavior().fly();
        woodenDuck.getQuackBehavior().quack();
        woodenDuck.display();
    }
}
