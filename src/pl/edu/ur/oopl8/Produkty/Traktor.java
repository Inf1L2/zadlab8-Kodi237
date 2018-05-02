package pl.edu.ur.oopl8.Produkty;


public class Traktor extends Produkt {

    public Traktor(String name, double price, String describe) {
        super(name, price, describe);
    }

    public void buy() {
        System.out.println("I bought a black tractor, capacity 2400!");
    }

    public void showInfo() {
        System.out.println(
                "Price: " + getPrice()
                        + " name: " + getName()
                        + " describe: " + getDescribe()
        );
    }
}
