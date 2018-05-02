package pl.edu.ur.oopl8.Figury;

public class Stozek extends FiguraPrzestrzenna{

    private double r;
    private double h;
    private double l;

    public Stozek(double r, double h, double l) {
        this.r = r;
        this.h = h;
        this.l = l;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    public double getH() {
        return h;
    }

    public void setH(double h) {
        this.h = h;
    }

    public double getL() {
        return l;
    }

    public void setL(double l) {
        this.l = l;
    }

    @Override
    public double obliczObjetosc() {
        return (Math.PI*Math.pow(r,2)*h)/3;
    }

    @Override
    public double obliczPole() {
        return Math.PI*r*(r+l);
    }

    @Override
    public String toString() {
        return super.toString()+"\nPromien podstawy stozka: "+r+"\nWysokosc stozka: "+h+"\nTworzaca stozka: "+l+"\nPole powierzchni stozka: "+obliczPole()+"\nObjetosc stozka: "+obliczObjetosc();
    }
}
