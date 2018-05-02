package pl.edu.ur.oopl8.Figury;

public class Trapez extends FiguraPlaska{

    private double a;
    private double b;
    private double c;
    private double d;
    private double h;

    public Trapez(double a, double b, double c, double d, double h) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.h = h;
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

    public double getD() {
        return d;
    }

    public void setD(double d) {
        this.d = d;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObwod() {
        return a+b+c+d;
    }

    @Override
    public double obliczPole() {
        return ((a+b)*h)/2;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDlugosc a: "+a+"\nDlugosc b: "+b+"\nDlugosc ramion trapezu: "+c+" | "+d+"\nWysokosc trapezu: "+h+"\nPole trapezu: "+obliczPole()+"\nObwod trapezu: "+obliczObwod();
    }
}
