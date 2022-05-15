package $08_Proxy;

/**
 * @author g84196891
 */
public class RealSubject implements Subject
{

    @Override
    public void subjectMethod()
    {
        System.out.println("This is real subject method ...........");
    }
}
