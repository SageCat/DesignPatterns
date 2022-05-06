package $02_CommandEnhanced.command_impl;

import $02_CommandEnhanced.DumplingsChef;
import $02_CommandEnhanced.command.Breakfast;

public class DumplingsBreakfast implements Breakfast
{
    private DumplingsChef mDumplingsChef;

    public DumplingsBreakfast(DumplingsChef dumplingsChef)
    {
        mDumplingsChef = dumplingsChef;
    }

    @Override
    public void cooking()
    {
        mDumplingsChef.cooking();
        System.out.println("The dumplings cooking finished!!!");
    }
}
