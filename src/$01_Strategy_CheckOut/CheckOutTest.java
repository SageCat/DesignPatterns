package $01_Strategy_CheckOut;

/**
 * @author g84196891
 */
public class CheckOutTest
{
    public static void main(String[] args)
    {
        double billAmount = CashStrategyFactory.getCashStrategy("正常收费").acceptCash(200);
        System.out.println("Your amount is " + billAmount);

        System.out.println(">>>>>>>>>>>>>>>>>>> 8折后价 >>>>>>>>>>>>>>>>>>>");

        double billAmount1 = CashStrategyFactory.getCashStrategy("打8折").acceptCash(499);
        System.out.println("You amount after discount is " + billAmount1);

        System.out.println(">>>>>>>>>>>>>>>>>>> 6折后价 >>>>>>>>>>>>>>>>>>>");

        double billAmount2 = CashStrategyFactory.getCashStrategy("打6折").acceptCash(988);
        System.out.println("You amount after discount is " + billAmount2);
    }
}
