package sda;

import sda.calculator.Calculator;
import sda.calculator.RandomGenerator;

public class Application {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();
        RandomGenerator randomGenerator = new RandomGenerator();

        System.out.println(myCalculator.sum(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(myCalculator.subtract(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(myCalculator.multiply(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));
        System.out.println(myCalculator.divide(randomGenerator.getSmallNumber(), randomGenerator.getBigNumber()));

        System.out.println("hello world");

    }
}
