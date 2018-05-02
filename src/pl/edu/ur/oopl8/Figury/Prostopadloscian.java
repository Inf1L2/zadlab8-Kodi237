package pl.edu.ur.oopl8.Figury;

public class Prostopadloscian extends FiguraPrzestrzenna {

    private double a;
    private double b;
    private double c;

    public Prostopadloscian(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public double obliczObjetosc() {
        return a * b * c;
    }

    @Override
    public double obliczPole() {
        return 2 * (a * b + a * c + b * c);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDlugosc krawedzi a: " + a + "\nDlugosc krawedzi b: " + b + "\nDlugosc krawedzi c: " + c + "\nPole powierzchni prostopadloscianu: " + obliczPole() + "\nObjetosc prostopadloscianu: " + obliczObjetosc();
    }
}
