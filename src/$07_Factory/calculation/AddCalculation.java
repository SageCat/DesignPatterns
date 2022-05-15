package $07_Factory.calculation;

public class AddCalculation extends Calculation
{
    @Override
    public double doCalculation()
    {
        return getNumberA() + getNumberB();
    }
}
