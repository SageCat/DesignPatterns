package $12_ProtoType;

/**
 * @author g84196891
 */
public class ProtoTypeTest
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Person sage = new Person("Sage", "Beijing", 23);
        Object cloneSage = sage.clone();

        System.out.println(sage);
        System.out.println(sage.hashCode());
        System.out.println(cloneSage);
        System.out.println(cloneSage.hashCode());
    }
}


class Person implements Cloneable
{
    private String name;
    private String address;
    private int age;

    public Person(String name, String address, int age)
    {
        this.name = name;
        this.address = address;
        this.age = age;
    }

    @Override
    public Object clone() throws CloneNotSupportedException
    {
        return (Person)super.clone();
    }

    @Override
    public String toString()
    {
        return "Person{" +
                "name='" + name + '\'' +
                ", address='" + address + '\'' +
                ", age=" + age +
                '}';
    }
}