import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {

    public static List<Integer> inverter_lista (int... valores) {

        List<Integer> lista = new ArrayList<>();

        for (int valor : valores) {
            lista.add(valor);
        }

        Collections.reverse(lista);

        return lista;
    }


    public static void main(String[] args) {
        System.out.println(inverter_lista(1,2,3,4,5,6,7,8,9));
    }
}
