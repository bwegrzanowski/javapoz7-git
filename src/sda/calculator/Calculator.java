package sda.calculator;

public class Calculator {
    public int sum(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    public int multiply(int a, int b) {
        return a * b;
    }

    public int divide(int a, int b) {
        if (b == 0) {
            System.out.println("invalid operation");
            return 0;
        }
        return a / b;
    }

    public int factorial(int a) {
        int result = 1;
        for (int i = 2; i <= a; i++) {
            result = result * i;
        }
        return result;
    }
}

