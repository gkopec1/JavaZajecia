import java.util.ArrayList;
import java.util.List;

public class Main1 {
    public static void main(String[] args){
        List<Uczen> lista_uczniow = new ArrayList<>();
        lista_uczniow.add(new Uczen());
        lista_uczniow.add(new Uczen());
        lista_uczniow.add(new Uczen());
        lista_uczniow.add(new Uczen());

        for(Uczen uczen : lista_uczniow){
            uczen.jakieImie();
        }
    }
}
