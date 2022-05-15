package $06_SimpleFactory.concrete_product;

import $06_SimpleFactory.product.Calculator;

public class AddCalculator extends Calculator
{
    public AddCalculator(double numberA, double numberB)
    {
        super(numberA, numberB);
    }

    @Override
    public double calculate()
    {
        return getNumberA() + getNumberB();
    }
}
