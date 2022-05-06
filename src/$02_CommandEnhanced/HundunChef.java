package $02_CommandEnhanced;

public class HundunChef extends Chef
{
    public HundunChef(String name)
    {
        super(name);
    }

    @Override
    public void cooking()
    {
        super.cooking();
        System.out.println("I can cook Hundun");
    }
}
