package $06_SimpleFactory;

import $06_SimpleFactory.product.Calculator;

import java.util.Scanner;

/**
 * @author g84196891
 */
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
