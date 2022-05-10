package $05_ProtoType;

public class TestClone
{
    public static void main(String[] args) throws CloneNotSupportedException
    {
        Student sage = new Student("sage", 23);
        System.out.println("sage is " + sage);
        /**
         * 如果 被克隆的对象所属的类没有实现 Cloneable 接口，则会触发 CloneNotSupportedException
         * 虽然 Cloneable 接口中没有任何方法，但是实现 Cloneable 接口知识起到一个标识的作用，标明这个类的对象是 “可克隆的”
         */
        Object cloneSage = sage.clone();
        System.out.println("sageClone is " + cloneSage);

        System.out.println(sage == cloneSage);
    }
}

class Student implements Cloneable
{
    private String name;
    private int age;

    Student(String name, int age)
    {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString()
    {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    protected Object clone() throws CloneNotSupportedException
    {
        return super.clone();
    }
}
