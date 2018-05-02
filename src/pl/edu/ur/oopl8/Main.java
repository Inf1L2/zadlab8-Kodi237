package pl.edu.ur.oopl8;
import pl.edu.ur.oopl8.Figury.*;
import pl.edu.ur.oopl8.Produkty.*;

public class Main {
    public static void main(String[] args) {
        /*

        // ZADANIA 1-3

        Produkt[] kolekcja = new Produkt[10];

        kolekcja[0] = new Ksiazka("Player One", 19.99, "Book based on film xD");
        kolekcja[1] = new Czekolada("Milka", 5.99, "White bubble chocolate");
        kolekcja[2] = new Ksiazka("Chlopcy z placy broni", 15.50, "Very interesting book");
        kolekcja[3] = new Dlugopis("Bic", 2.99, "Black pen");
        kolekcja[4] = new Dzem("Lowicz", 9.99, "Strawberry jam");
        kolekcja[5] = new Polopiryna("APAP", 12, "Headache medicine");
        kolekcja[6] = new Dzem("Lowicz", 8.90, "Cherry jam");
        kolekcja[7] = new Czekolada("Wedel", 5.90, "Milk chocolate");
        kolekcja[8] = new Dlugopis("Parker", 15.75, "Blue pen");
        kolekcja[9] = new Ksiazka("Czysty kod", 59.99, "Programming guide");

        for (int i = 0; i < 10; i++ ){
            kolekcja[i].buy();
            kolekcja[i].showInfo();
        }
        */

        FiguraGeometryczna[] figury = new FiguraGeometryczna[15];

        figury[0] = new Kwadrat(4);
        figury[1] = new Szescian(6.6);
        figury[2] = new Prostokat(4, 5);
        figury[3] = new Prostopadloscian(3, 5, 7.5);
        figury[4] = new Trojkat(4, 8);
        figury[5] = new Stozek(3, 4, 5);
        figury[6] = new Trapez(12, 4, 5, 5, 3);
        figury[7] = new Romb(5, 4.2);
        figury[8] = new Kolo(5.5);
        figury[9] = new Kula(4.7);
        figury[10] = new Rownoleglobok(3, 5, 4);
        figury[11] = new Walec(4.5, 8.8);
        figury[12] = new Prostokat(2.75, 6.33);
        figury[13] = new Szescian(3.25);
        figury[14] = new Kwadrat(8.13);

        int i = 0;
        while (i < 15){
            System.out.println(figury[i].toString());
            i++;
        }
    }
}
