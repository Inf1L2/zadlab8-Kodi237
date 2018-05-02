package pl.edu.ur.oopl8.Produkty;

public class Ksiazka extends Produkt {


    public Ksiazka(String name, double price, String describe){
        super(name, price, describe);
    }

    public void buy() {
        System.out.println("I bought new book!");
    }

    public void showInfo() {
        System.out.println(
                "Price: " + getPrice()
                        + " name: " + getName()
                        + " describe: " + getDescribe()
        );
    }
}
