package pl.edu.ur.oopl8.Figury;

public class Rownoleglobok extends FiguraPlaska{

    private double a;
    private double b;
    private double h;

    public Rownoleglobok(double a, double b, double h) {
        this.a = a;
        this.b = b;
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

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    @Override
    public double obliczObwod() {
        return 2*a+2*b;
    }

    @Override
    public double obliczPole() {
        return a*h;
    }

    @Override
    public String toString() {
        return super.toString()+"\nDlugosc boku a: "+a+"\nDlugosc boku b: "+b+"\nWysokosc rownolegloboku: "+h+"\nPole rownolegloboku: "+obliczPole()+"\nObwod rownolegloboku: "+obliczObwod();
    }
}
