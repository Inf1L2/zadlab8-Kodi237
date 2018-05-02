package pl.edu.ur.oopl8.Produkty;

public class Czekolada extends Produkt{

    public Czekolada(String name, double price, String describe){
        super(name, price, describe);
    }

    public void buy() {
        System.out.println("I bought a bar of chocolate :)");
    }

    public void showInfo() {
        System.out.println(
                "Price: " + getPrice()
                        + " name: " + getName()
                        + " describe: " + getDescribe()
        );
    }
}
