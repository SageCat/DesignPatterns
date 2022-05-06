package $02_CommandEnhanced.command_impl;

import $02_CommandEnhanced.HundunChef;
import $02_CommandEnhanced.command.Breakfast;

public class HundunBreakfast implements Breakfast
{
    private HundunChef mHundunChef;

    public HundunBreakfast(HundunChef hundunChef)
    {
        mHundunChef = hundunChef;
    }

    @Override
    public void cooking()
    {
        mHundunChef.cooking();
        System.out.println("The Hundun cooking finished!!!");
    }
}
