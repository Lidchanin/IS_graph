package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double a = 0.5,
                b = 2,
                c = -3,
                x, y;
        System.out.print("x = ");
        x = new Scanner(System.in).nextDouble();
        System.out.print("y = ");
        y = new Scanner(System.in).nextDouble();
        if (y > 0 && y < parabola(x, a, b, c)) {
            System.out.println("Принадлежит");
        } else if (y == 0 && y < parabola(x, a, b, c)) {
            System.out.println("Принадлежит прямой");
        } else if (y >= 0 && y == parabola(x, a, b, c)) {
            System.out.println("Принадлежит параболе");
        } else
            System.out.println("Не принадлежит");

    }

    //parabola(x,a,b,c)
    public static Double parabola(double x, double a, double b, double c) {
        return a * x * x + b * x + c;
    }
}
