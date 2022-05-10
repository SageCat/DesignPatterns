package $06_Factory;

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
