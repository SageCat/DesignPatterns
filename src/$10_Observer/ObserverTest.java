package $10_Observer;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Objects;

/**
 * @author g84196891
 */
public class ObserverTest
{
    public static void main(String[] args) throws InterruptedException
    {
        Teacher teacher = new Teacher();
        Student student = new Student();
        SchoolRing schoolRing = new SchoolRing("上课铃");
        schoolRing.addListeners(teacher);
        schoolRing.addListeners(student);

        System.out.println("上课啦=====");
        schoolRing.notifyListeners();

        Thread.sleep(5000);

        System.out.println("下课啦============");
        schoolRing.setRingType("下课铃");
        schoolRing.notifyListeners();

    }
}


abstract class Ring
{
    private String ringType;

    public String getRingType()
    {
        return ringType;
    }

    public void setRingType(String ringType)
    {
        this.ringType = ringType;
    }

    public Ring(String ringType)
    {
        this.ringType = ringType;
    }

    abstract void addListeners(RingListener ringListener);
    abstract void notifyListeners();
}

class SchoolRing extends Ring
{
    ArrayList<RingListener> listenersList = new ArrayList();

    public SchoolRing(String ringType)
    {
        super(ringType);
    }

    @Override
    void addListeners(RingListener ringListener)
    {
        listenersList.add(ringListener);
    }

    @Override
    void notifyListeners()
    {
        Iterator<RingListener> iterator = listenersList.iterator();
        for (RingListener listener : listenersList)
        {
            listener.action(this);
        }
    }
}


interface RingListener
{
    void action(Ring ring);
}

class Teacher implements RingListener
{

    @Override
    public void action(Ring ring)
    {
        if (ring.getRingType() == "上课铃")
        {
            System.out.println("同学们，我们来上课啦！！！");
        }
        else if (ring.getRingType() == "下课铃")
        {
            System.out.println("同学们，下课啦，请休息一下~~~");
        }else
        {
            System.out.println("老师：这是什么铃声？？？");
        }
    }
}

class Student implements RingListener
{

    @Override
    public void action(Ring ring)
    {
        if (Objects.equals(ring.getRingType(), "上课铃"))
        {
            System.out.println("老师好！！！");
        }
        else if (Objects.equals(ring.getRingType(), "下课铃"))
        {
            System.out.println("老师再见~~~");
        }else
        {
            System.out.println("学生：这是什么铃声？？？");
        }
    }
}