package $01_Strategy_CheckOut;

/**
 * @author g84196891
 */
public class CashNormal implements CashStrategy
{    @Override
    public double acceptCash(double amount)
    {
        return amount;
    }
}
