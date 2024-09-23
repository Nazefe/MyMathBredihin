package org.example;

public class Main {
    public static void main(String[] args) {
        double angle = MyMath.PI / 4; // Пример угла в радианах (45 градусов)
        double radius = 5.0;

        System.out.println("Максимум (3, 7): " + MyMath.max(3, 7));
        System.out.println("Синус угла: " + MyMath.sin(angle));
        System.out.println("Косинус угла: " + MyMath.cos(angle));
        System.out.println("Тангенс угла: " + MyMath.tan(angle));
        System.out.println("Площадь окружности с радиусом 5: " + MyMath.circleArea(radius));
        System.out.println("Длина окружности с радиусом 5: " + MyMath.circleCircumference(radius));
        System.out.println("Рандомное число в диапазоне (1, 10): " + MyMath.randomInt(1, 10));
    }
}