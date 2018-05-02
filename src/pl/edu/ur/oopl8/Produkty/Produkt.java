package pl.edu.ur.oopl8.Produkty;

public abstract class Produkt {
    private double price;
    private String name;
    private String describe;

    public Produkt(String name, double price, String describe) {
        this.name = name;
        this.price = price;
        this.describe = describe;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescribe() {
        return describe;
    }

    public void setDescribe(String describe) {
        this.describe = describe;
    }

    public abstract void buy();

    public abstract void showInfo();
}
