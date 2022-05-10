package $06_Factory;

import java.util.Scanner;

public class CalculatorTest
{
    public static void main(String[] args)
    {
        System.out.println("Please input a number: ");
        double numberA = new Scanner(System.in).nextDouble();
        System.out.println("Please input an operator: ");
        String operator = new Scanner(System.in).next();
        System.out.println("Please input another number: ");
        double numberB = new Scanner(System.in).nextDouble();

        Calculator calculator = CalculatorFactory.createCalculator(numberA, operator, numberB);
        double result = calculator.calculate();
        System.out.println("The result of " + numberA + " " + operator + " " + numberB + " = " + result);
    }
}
