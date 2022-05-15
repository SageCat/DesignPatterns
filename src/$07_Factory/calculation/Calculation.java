package $07_Factory.calculation;

public abstract class Calculation
{
    private double numberA;
    private double numberB;

    public double getNumberA()
    {
        return numberA;
    }

    public double getNumberB()
    {
        return numberB;
    }

    public void setNumberA(double numberA)
    {
        this.numberA = numberA;
    }

    public void setNumberB(double numberB)
    {
        this.numberB = numberB;
    }

    public abstract double doCalculation();
}
