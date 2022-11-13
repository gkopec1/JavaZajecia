import java.util.Scanner;

public class Uczen {
    public String imie;
    private int [] matematyka = new int[4];
    private int [] polski = new int[5];
    private int [] angielski = new int[6];
    private int [] biologia = new int[4];

    public Uczen(){
        this.imie=imie;
    }
    public void dodajMatematyka() {
        for (int i = 0; i < matematyka.length; i++) {

            System.out.println("Podaj ocene z Matematyki");
            Scanner s = new Scanner(System.in);
            matematyka[i] = s.nextInt();
        }
    }
    public void wyswietlOceny() {
        String ocenyMatematyka = "";
        for (int i = 0; i < 4; i++) {
            if (matematyka[i] != 0) {
                ocenyMatematyka += Integer.toString(i) + ". " + Integer.toString(matematyka[i]) + "/n";
            }
            System.out.println(ocenyMatematyka);
        }
    }
}