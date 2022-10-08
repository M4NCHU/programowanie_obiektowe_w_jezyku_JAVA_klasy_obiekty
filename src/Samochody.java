import java.util.Scanner;

public class Samochody {
//    Zadanie 4
//    Napisz program przechowujący informacje o samochodach uwzględniając takie atrybuty, jak: marka, moc silnika, typ silnika, cena.
//    Zadeklaruj wszystkie niezbędne składowe (zmienne oraz metody) wspomagające zarządzaniu danymi. Wprowadź informację o co najmniej trzech samochodach.
//    Zadeklaruj niezbędne elementy programu tak aby możliwe było wprowadzanie danych samochodu w trakcie tworzenia nowego obiektu.

    String marka, typSamochodu;
    double mocSilnika, cena;

    // default values - Constructor
    Samochody() {
        marka = "";
        cena = 0.0;
        typSamochodu = "A00000";
        mocSilnika = 0.0;
    }

    // values - Constructor with many arguments
    Samochody(String mark, String type, double price, double engine) {
        this.marka = mark;
        this.typSamochodu = type;
        this.cena = price;
        this.mocSilnika = engine;
    }

    // function printing values of variables
    void pokazWartosci(){
        System.out.println("Dodano nowy samochód! marka: " + marka + " typSamochodu: " + typSamochodu + " cena: " + cena + " mocSilnika: " + mocSilnika);
    }

    public static void main(String[] args) {
        // Creating objects
        Samochody c1 = new Samochody("BMW", "Sedan", 30200, 2.0);
        c1.pokazWartosci();
        Samochody c2 = new Samochody("Skoda", "Combi", 12500, 1.9);
        c2.pokazWartosci();
        Samochody c3 = new Samochody("Mercedes", "Coupe", 80900, 3.0);
        c3.pokazWartosci();
        Samochody c4 = new Samochody("Nissan", "SUV", 25000, 3.0);
        c4.pokazWartosci();

        Scanner scan = new Scanner(System.in);
        Scanner text = new Scanner(System.in);


        System.out.println("Dodawanie nowego samochodu:");

        // Add new car
        try{
            System.out.println("Podaj markę samochodu: ");
            String mark = text.nextLine();
            System.out.println("Podaj rodzaj nadwozia: ");
            String type = text.nextLine();
            System.out.println("Podaj cenę: ");
            double price = scan.nextDouble();
            System.out.println("Podaj moc silnika: ");
            double engine = scan.nextDouble();

            Samochody car = new Samochody(mark, type, price, engine);
            car.pokazWartosci();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane");
        }
    }

}


