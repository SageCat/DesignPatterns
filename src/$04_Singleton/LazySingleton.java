package $04_Singleton;

/**
 * @author g84196891
 */
public class LazySingleton
{
    /**
     * 线程不安全，需要在多线程访问时，保证变量在内存中的一致性，所以需要增加 volatile 关键字
     */
    private static volatile LazySingleton instance = null;

    /**
     * 私有化构造方法，使得类在外部不可以被实例化
     */
    private LazySingleton()
    {

    }

    public static synchronized LazySingleton getInstance()
    {
        if (instance == null)
        {
            instance = new LazySingleton();
        }
        return instance;
    }

}
