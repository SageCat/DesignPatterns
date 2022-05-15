package $06_SimpleFactory.concrete_product;

import $06_SimpleFactory.product.Calculator;

public class TimesCalculator extends Calculator
{

    public TimesCalculator(double numberA, double numberB)
    {
        super(numberA, numberB);
    }

    @Override
    public double calculate()
    {
        return getNumberA() * getNumberB();
    }
}
