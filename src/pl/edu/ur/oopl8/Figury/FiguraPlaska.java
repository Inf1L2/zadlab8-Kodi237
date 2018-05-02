package pl.edu.ur.oopl8.Figury;

abstract class FiguraPlaska extends FiguraGeometryczna {

    public abstract double obliczObwod();

    @Override
    public String toString() {
        return "\nObliczanie parametrow figury plaskiej.\n";
    }
}
