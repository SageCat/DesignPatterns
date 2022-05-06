package $02_CommandEnhanced;

public class NoodlesChef extends Chef
{
    public NoodlesChef(String name)
    {
        super(name);
    }

    @Override
    public void cooking()
    {
        super.cooking();
        System.out.println("I can cook noodles");
    }
}
