import java.util.Scanner;

//         Zadanie 2
//         Napisz program, w którym zadeklaruj klasę Towar przechowującą następujące składowe:
//         - zmienną nazwa,
//         - zmienną cena,
//         - zmienną kod,
//         - metodę wyświetlającą wartości wszystkich składowych na ekranie pokazWartosci,
//         - metodę ustawWartosci przypisującą wartości podane jako argumenty tej metody do zmiennych nazwa, cena, kod.
//
//         Zadeklaruj klasę Sklep (główną klasę programu), w której utwórz trzy obiekty oraz przypisz im
//         przykładowe wartości odwołując się bezpośrednio do zmiennych lub przez metodę ustawWartości.
//         Wyświetl wartości wszystkich zadeklarowanych obiektów.
//
//         Zadanie 3
//         Zmodyfikuj program z zadania 2 tak, aby w czasie tworzenia nowego obiektu przypisywane były wartości początkowe dla składowych nazwa „brak”, cena „0.0”, kod „A00000”.

class Towar {
    String nazwa, kod;
    double cena;

    // default values - Constructor
    Towar() {
        nazwa = "";
        cena = 0.0;
        kod = "A00000";
    }

    // function printing values of variables
    void pokazWartosci(){
        System.out.println("Nazwa: " + nazwa + " cena: " + cena + " kod: " + kod);
    }

    // function assigning values to variables
    void ustawWartosci(String name, double price, String code) {
        this.nazwa = name;
        this.cena = price;
        this.kod = code;
    }
}

class Sklep{
    public static void main(String[] args) {
        // Creating objects
        Towar t1 = new Towar();

//        ===== Method 1 ======
//        t1.nazwa = "chleb";
//        t1.cena = 5.25;
//        t1.kod = 2512434;
//        t1.pokazWartosci();

        Scanner scan = new Scanner(System.in);
        Scanner text = new Scanner(System.in);
        try{
            System.out.println("Podaj nazwę towaru: ");
            String name = text.nextLine();
            System.out.println("Podaj cenę towaru: ");
            double cena = scan.nextDouble();
            System.out.println("Podaj kod towaru");
            String kod = text.nextLine();

            // calling functions of class Towar
            t1.ustawWartosci(name, cena, kod);
            t1.pokazWartosci();
        } catch (Exception e) {
            System.out.println("Niepoprawne dane");
        }

    }
}
