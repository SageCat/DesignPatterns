package $04_Singleton;

import jdk.jfr.Timestamp;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

public class Test
{
    public static void main(String[] args)
    {
        LazySingleton instance = LazySingleton.getInstance();
        LazySingleton instance1 = LazySingleton.getInstance();

        System.out.println(instance);
        System.out.println(instance1);

        System.out.println(instance.equals(instance1));

        System.out.println(">>>>>>>>>>>>>>>>>>>>>");

        HungerSingleton hungerSingleton = HungerSingleton.getInstance();
        HungerSingleton hungerSingleton1 = HungerSingleton.getInstance();
        System.out.println(hungerSingleton);
        System.out.println(hungerSingleton1);
        System.out.println(hungerSingleton.equals(hungerSingleton1));
    }
}
