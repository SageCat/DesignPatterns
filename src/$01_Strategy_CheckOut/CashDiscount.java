package $01_Strategy_CheckOut;

/**
 * @author g84196891
 */
public class CashDiscount implements CashStrategy
{
    private int discount;

    public CashDiscount(int discount)
    {
        this.discount = discount;
    }

    @Override
    public double acceptCash(double amount)
    {
        return amount * discount / 10;
    }
}
