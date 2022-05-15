package $07_Factory.calculation;

public class TimesCalculation extends Calculation
{
    @Override
    public double doCalculation()
    {
        return getNumberA() * getNumberB();
    }
}
