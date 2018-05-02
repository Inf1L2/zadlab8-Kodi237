package pl.edu.ur.oopl8.Produkty;

public class Dzem extends Produkt {

    public Dzem(String name, double price, String describe){
        super(name, price, describe);
    }

    public void buy() {
        System.out.println("I bought a jar of jam :)");
    }

    public void showInfo() {
        System.out.println(
                "Price: " + getPrice()
                        + " name: " + getName()
                        + " describe: " + getDescribe()
        );
    }
}
