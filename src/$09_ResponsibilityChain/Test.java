package $09_ResponsibilityChain;

public class Test
{
    public static void main(String[] args)
    {
        double balance = calculateBalance(100000, 8);
        System.out.println("假如换过来的钱用于理财，年化为 3.8%， 则8个月后，我将拥有： " + balance + "， 总共算起来，年化收益相当于 " + (balance - 100000)/100000 * 100 + "%");
    }

    private static double calculateBalance(int totalMoney, int monthNum)
    {
        double myMoney = 0;
        for (int i = 1; i <= monthNum; i++)
        {
            myMoney += totalMoney/monthNum;
            myMoney += myMoney * 0.038 / 365 * 30;
        }

        return myMoney + totalMoney * 0.05;
    }

}
