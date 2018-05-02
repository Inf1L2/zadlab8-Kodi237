package pl.edu.ur.oopl8.Figury;

public class Szescian extends FiguraPrzestrzenna {

    private double a;

    public Szescian(double a) {
        this.a = a;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    @Override
    public double obliczObjetosc() {
        return Math.pow(a, 3);
    }

    @Override
    public double obliczPole() {
        return 6 * Math.pow(a, 2);
    }

    @Override
    public String toString() {
        return super.toString() + "\nDlugosc krawedzi a: " + a + "\nPole powierzchni szescianu: " + obliczPole() + "\nObjetosc szescianu: " + obliczObjetosc();
    }
}
