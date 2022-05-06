package $02_CommandEnhanced;

import $02_CommandEnhanced.command_impl.DumplingsBreakfast;
import $02_CommandEnhanced.command_impl.HundunBreakfast;
import $02_CommandEnhanced.command_impl.NoodlesBreakfast;

public class Test
{
    public static void main(String[] args)
    {
        Waitress waitress = new Waitress();
        waitress.setBreakfast(new NoodlesBreakfast(new NoodlesChef("Noodle's Chef")));
        waitress.startCooking();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        waitress.setBreakfast(new HundunBreakfast(new HundunChef("Hundun's Chef")));
        waitress.startCooking();
        System.out.println(">>>>>>>>>>>>>>>>>>>>>>>");
        waitress.setBreakfast(new DumplingsBreakfast(new DumplingsChef("Dumpling's Chef")));
        waitress.startCooking();
    }
}
