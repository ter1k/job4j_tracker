package ru.job4j.oop;

import static java.lang.Math.sqrt;

public class Triangle {
    private Point a;
    private Point b;
    private Point c;

    public Triangle(Point a, Point b, Point c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Triangle() {
        this.a = new Point();
        this.b = new Point();
        this.c = new Point();
    }

    public boolean exist(double ab, double bc, double ac) {
        return ab < ac + bc && bc < ab + ac && ac < ab + bc;
    }

    public double semiPerimeter(double a, double b, double c) {
        return (a + b + c) / 2;
    }

    public double area() {
        double ab = a.distance(b);
        double bc = b.distance(c);
        double ac = a.distance(c);
        if (this.exist(ab, bc, ac)) {
            double p = semiPerimeter(ab, bc, ac);
            return sqrt(p * (p - ab) * (p - bc) * (p - ac));
        }
        return -1;
    }
}
