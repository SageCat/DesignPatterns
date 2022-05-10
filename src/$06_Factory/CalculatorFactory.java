package $06_Factory;

/**
 * @author g84196891
 */
public class CalculatorFactory
{
    private static Calculator calculator = null;

    public static Calculator createCalculator(double numberA, String operator, double numberB)
    {

        switch (operator)
        {
            case "+":
                calculator = new AddCalculator(numberA, numberB);
                break;
            case "/":
                calculator = new DivideCalculator(numberA, numberB);
                break;
            case "*":
                calculator = new TimesCalculator(numberA, numberB);
                break;
            default:
                calculator = null;
        }
        return calculator;
    }
}
