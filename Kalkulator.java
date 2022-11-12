package zajecia;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Podaj działanie.");
            String dzialanie = scanner.nextLine();
            System.out.print("Podaj pierwszą liczbę.");
            String liczba_jeden = scanner.nextLine();
            System.out.print("Podaj drugą liczbę");
            String liczba_dwa = scanner.nextLine();
            if (dzialanie.equals("x")){
                break;
            }
        if(dzialanie.equals("Dodawanie")){
            System.out.println("Wynik twojego działania to" + (Float.parseFloat(liczba_jeden) + Float.parseFloat(liczba_dwa)));
        }
        if(dzialanie.equals("Odejmowanie")){
            System.out.println("Wynik twojego działania to" + (Float.parseFloat(liczba_jeden) - Float.parseFloat(liczba_dwa)));
        }
        if(dzialanie.equals("Mnozenie")) {
            System.out.println("Wynik twojego działania to" + (Float.parseFloat(liczba_jeden) * Float.parseFloat(liczba_dwa)));
        }
        if (dzialanie.equals("Dzielenie")) {
            System.out.println("Wynik twojego działania to" + (Float.parseFloat(liczba_jeden)/Float.parseFloat(liczba_dwa)));
        }
        if(dzialanie.equals("Dzielenie modulo")){
            System.out.println("Wynik twojego działania to" + (Float.parseFloat(liczba_jeden)%Float.parseFloat(liczba_dwa)));
        }


    }

    }
}