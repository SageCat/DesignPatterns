package $06_SimpleFactory.product;

public abstract class Calculator
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

    public Calculator(double numberA, double numberB)
    {
        this.numberA = numberA;
        this.numberB = numberB;
    }
    public abstract double calculate();
}
