package $06_SimpleFactory;

import $06_SimpleFactory.concrete_product.AddCalculator;
import $06_SimpleFactory.concrete_product.DivideCalculator;
import $06_SimpleFactory.concrete_product.TimesCalculator;
import $06_SimpleFactory.product.Calculator;

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
