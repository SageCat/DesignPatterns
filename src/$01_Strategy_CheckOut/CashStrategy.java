package $01_Strategy_CheckOut;

/**
 * @author g84196891
 */
public interface CashStrategy
{
    /**
     * @param amount 账单金额
     * @return 结算后的实际金额， 可能包含打折等情况
     */
    double acceptCash(double amount);
}
