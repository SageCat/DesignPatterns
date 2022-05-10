package $04_Singleton;

public class HungerSingleton
{
    /**
     * 线程安全，在类加载时就已经创建了对象
     */
    private static HungerSingleton instance = new HungerSingleton();

    private HungerSingleton()
    {

    }

    public static HungerSingleton getInstance()
    {
        return instance;
    }
}
