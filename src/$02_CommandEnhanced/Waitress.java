package $02_CommandEnhanced;

import $02_CommandEnhanced.command.Breakfast;

public class Waitress
{
    Breakfast mBreakfast;

    public void setBreakfast(Breakfast breakfast)
    {
        mBreakfast = breakfast;
    }

    public void startCooking()
    {
        System.out.println("The food is going to start cooking!");
        mBreakfast.cooking();
    }
}
