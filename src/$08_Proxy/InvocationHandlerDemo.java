package $08_Proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author g84196891
 */
public class InvocationHandlerDemo implements InvocationHandler
{

    private Object object;

    public InvocationHandlerDemo(Object object)
    {
        this.object = object;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable
    {

        System.out.println("Before real subject method printed >>>>>>>>>>>>>>>>>>>>>>>>");

        System.out.println("Call method ----- " + method);

        Object obj = method.invoke(object, args);

        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>> After real subject method printed");

        return obj;
    }
}
