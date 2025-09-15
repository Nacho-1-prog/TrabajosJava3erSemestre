import java.util.ArrayList;
import java.util.List;

public class Main {
    public static <T> void ImprimirLista(List<T> lista) {
        for (T elemento : lista) {
            System.out.println(elemento);
        }
    }

    public static void main(String[] args) {
        List<Integer> listaEnteros = new ArrayList<>();
        listaEnteros.add(1);
        listaEnteros.add(2);
        listaEnteros.add(3);

        List<String> ListaStrings = new ArrayList<>();
        ListaStrings.add("A");
        ListaStrings.add("B");
        ListaStrings.add("C");

        System.out.println("Lista de enteros: ");
        ImprimirLista(listaEnteros);

        System.out.println("Lista de Strings: ");
        ImprimirLista(ListaStrings);
    }
}
