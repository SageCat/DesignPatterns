package $07_Factory;

import java.util.Scanner;

public class CalculationTest
{
    public static void main(String[] args)
    {
        System.out.println("Please input a number: ");
        double numberA = new Scanner(System.in).nextDouble();
        System.out.println("Please input an operator: ");
        String operator = new Scanner(System.in).next();
        System.out.println("Please input another number: ");
        double numberB = new Scanner(System.in).nextDouble();
    }
}
