package pl.edu.ur.oopl8.Figury;

public class Kolo extends FiguraPlaska{

    private double r;

    public Kolo(double r) {
        this.r = r;
    }

    public double getR() {
        return r;
    }

    public void setR(double r) {
        this.r = r;
    }

    @Override
    public double obliczObwod() {
        return 2*Math.PI*r;
    }

    @Override
    public double obliczPole() {
        return Math.PI*Math.pow(r,2);
    }

    @Override
    public String toString() {
        return super.toString()+"\nPromien kola: "+r+"\nPole kola: "+obliczPole()+"\nObwod kola: "+obliczObwod();
    }
}
