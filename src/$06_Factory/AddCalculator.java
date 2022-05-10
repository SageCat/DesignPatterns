package $06_Factory;

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
