package $02_CommandEnhanced;

public class DumplingsChef extends Chef
{
    public DumplingsChef(String name)
    {
        super(name);
    }

    @Override
    public void cooking()
    {
        super.cooking();
        System.out.println("I can cook dumplings");
    }
}
