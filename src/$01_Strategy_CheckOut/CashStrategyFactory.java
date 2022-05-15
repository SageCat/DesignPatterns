package $01_Strategy_CheckOut;

/**
 * @author g84196891
 */
public class CashStrategyFactory
{
    public static CashStrategy getCashStrategy(String type)
    {
        switch (type)
        {
            case "正常收费":
                return new CashNormal();
            case "打8折":
                return new CashDiscount(8);
            case "打5折":
                return new CashDiscount(5);
            case "打6折":
                return new CashDiscount(6);
            case "打7折":
                return new CashDiscount(7);
            default:
                return null;
        }
    }
}
