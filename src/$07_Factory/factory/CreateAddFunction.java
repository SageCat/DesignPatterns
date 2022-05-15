package $07_Factory.factory;

import $07_Factory.calculation.AddCalculation;
import $07_Factory.calculation.Calculation;

public class CreateAddFunction implements CreateFunction
{

    @Override
    public Calculation createOperation()
    {
        return new AddCalculation();
    }
}
