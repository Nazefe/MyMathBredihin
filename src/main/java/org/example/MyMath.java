package org.example;

import java.util.Random;

public class MyMath {

    public static final double PI = 3.141592653589793;
    public static final double E = 2.718281828459045;

    //максимальное число от двух
    public static double max(double a, double b) {
        return (a > b) ? a : b;
    }

    // синус
    public static double sin(double radians) {
        double result = 0;
        double term = radians;
        int n = 1;

        for (int i = 1; i <= 10; i++) {
            result += term;
            n += 2;
            term *= (-1) * radians * radians / (n * (n - 1));
        }

        return result;
    }

    // косинус
    public static double cos(double radians) {
        double result = 1;
        double term = 1;
        int n = 0;

        for (int i = 1; i <= 10; i++) {
            n += 2;
            term *= (-1) * radians * radians / (n * (n - 1));
            result += term;
        }

        return result;
    }

    // тангенс
    public static double tan(double radians) {
        return sin(radians) / cos(radians);
    }

    // площадь
    public static double circleArea(double radius) {
        return PI * radius * radius;
    }

    // длина
    public static double circleCircumference(double radius) {
        return 2 * PI * radius;
    }

    // рандомное число
    public static int randomInt(int min, int max) {
        Random random = new Random();
        return random.nextInt((max - min) + 1) + min;
    }
}