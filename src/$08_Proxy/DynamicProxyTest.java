package $08_Proxy;

import java.lang.reflect.Proxy;

/**
 * @author g84196891
 */
public class DynamicProxyTest
{
    public static void main(String[] args)
    {
        RealSubject realSubject = new RealSubject();
        RealSecondSubject realSecondSubject = new RealSecondSubject();

        InvocationHandlerDemo invocationHandler = new InvocationHandlerDemo(realSubject);
        InvocationHandlerDemo invocationHandlerSecond = new InvocationHandlerDemo(realSecondSubject);

        Subject subject = (Subject)Proxy.newProxyInstance(invocationHandler.getClass().getClassLoader(), realSubject.getClass().getInterfaces(), invocationHandler);

        SecondSubject secondSubject = (SecondSubject)Proxy.newProxyInstance(invocationHandlerSecond.getClass().getClassLoader(), realSecondSubject.getClass().getInterfaces(), invocationHandlerSecond);

        subject.subjectMethod();
        System.out.println();
        secondSubject.sayHello();

        System.out.println(subject.getClass().getName());
        System.out.println(secondSubject.getClass().getName());

        System.out.println(invocationHandler.getClass().getClassLoader());

    }
}
