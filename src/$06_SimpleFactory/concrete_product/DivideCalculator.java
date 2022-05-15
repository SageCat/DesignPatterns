package $06_SimpleFactory.concrete_product;

import $06_SimpleFactory.product.Calculator;

public class DivideCalculator extends Calculator
{
    public DivideCalculator(double numberA, double numberB)
    {
        super(numberA, numberB);
    }

    @Override
    public double calculate()
    {
        if (getNumberB() == 0)
        {
            throw new ArithmeticException("Divide by 0");
        }
        return getNumberA() / getNumberB();
    }
}
