package $06_Factory;

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
