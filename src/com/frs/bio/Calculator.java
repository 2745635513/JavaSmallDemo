package com.frs.bio;

public class Calculator {
    public static double addition(double a, double b) {
        return a + b;
    }

    public static double subtraction(double a, double b) {
        return a - b;
    }

    public static double multiplication(double a, double b) {
        return a * b;
    }

    public static double division(double a, double b) {
        return a / b;
    }

    public static double cal(String expression) {
        String substring = expression.substring(1, 2);
        int a = Integer.valueOf(expression.substring(0, 1));
        int b = Integer.valueOf(expression.substring(2, 3));
        if (substring.equals("+")) return addition(a, b);
        if (substring.equals("-")) return subtraction(a, b);
        if (substring.equals("*")) return multiplication(a, b);
        if (substring.equals("/")) return division(a, b);
        return 0;
    }
}
