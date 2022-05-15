package $08_Proxy;

public class RealSecondSubject implements SecondSubject
{

    @Override
    public void sayHello()
    {
        System.out.println("Hello =======");
    }
}
