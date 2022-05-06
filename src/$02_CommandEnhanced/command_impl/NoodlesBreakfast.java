package $02_CommandEnhanced.command_impl;

import $02_CommandEnhanced.NoodlesChef;
import $02_CommandEnhanced.command.Breakfast;

public class NoodlesBreakfast implements Breakfast
{
    private NoodlesChef mNoodlesChef;

    public NoodlesBreakfast(NoodlesChef noodlesChef)
    {
        mNoodlesChef = noodlesChef;
    }

    @Override
    public void cooking()
    {
        mNoodlesChef.cooking();
        System.out.println("The noodles cooking finished!!!");
    }
}
