package pl.edu.ur.oopl8.Produkty;

public class Polopiryna extends Produkt{

    public Polopiryna(String name, double price, String describe){
        super(name, price, describe);
    }

    public void buy() {
        System.out.println("I bought a medicine");
    }

    public void showInfo() {
        System.out.println(
                "Price: " + getPrice()
                        + " name: " + getName()
                        + " describe: " + getDescribe()
        );
    }
}
