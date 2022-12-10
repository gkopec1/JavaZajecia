package zajecia;

import java.util.Random;
import java.util.Scanner;

public class Zycie_i_walka {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Zycie_i_walka a;
        while (true) {
            System.out.print("Wybierz opcje:");

            String opcja = scanner.nextLine();
            if (opcja.equals("wyjscie")) {
                break;
            }


            if (opcja.equals("walka")) {
                Random r = new Random();
                int randomInt=r.nextInt(100) + 1;

            }
            if (opcja.equals("statystyki")) {
                System.out.print();
            }
            if (opcja.equals("leczenie")) {
                int zdrowie = 100;
                System.out.print(a.zycie + zdrowie);
            }
        }
    }
}



