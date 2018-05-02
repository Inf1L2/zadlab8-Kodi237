package pl.edu.ur.oopl8.Produkty;

public class Dlugopis extends Produkt{

    public Dlugopis(String name, double price, String describe){
        super(name, price, describe);
    }

    public void buy() {
        System.out.println("I bought a pen");
    }

    public void showInfo() {
        System.out.println(
                "Price: " + getPrice()
                        + " name: " + getName()
                        + " describe: " + getDescribe()
        );
    }
}
