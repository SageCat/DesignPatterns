package $07_Factory.calculation;

public class DividCalculation extends Calculation
{
    @Override
    public double doCalculation()
    {
        if (getNumberB() == 0)
        {
            throw new ArithmeticException("The second number is 0");
        }
        return getNumberA() / getNumberB();
    }
}
