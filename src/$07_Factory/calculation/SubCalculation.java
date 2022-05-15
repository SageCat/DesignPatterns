package $07_Factory.calculation;

public class SubCalculation extends Calculation
{
    @Override
    public double doCalculation()
    {
        return getNumberA() - getNumberB();
    }
}
