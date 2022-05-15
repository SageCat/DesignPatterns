package $07_Factory.factory;

import $07_Factory.calculation.Calculation;
import $07_Factory.calculation.SubCalculation;

public class CreateSubFunction implements CreateFunction
{

    @Override
    public Calculation createOperation()
    {
        return new SubCalculation();
    }
}
