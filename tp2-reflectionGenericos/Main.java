import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Caja <String> cajaString = new Caja<>();
        cajaString.setContenido("Contenido");
        System.out.println("Contenido: " + cajaString.getContenido());

        Caja <Integer> cajaIntege = new Caja<>();
        cajaIntege.setContenido(10);
        System.out.println("Contenido: " + cajaIntege.getContenido());

        List lista = new ArrayList();
        lista.add("Un texto");
        lista.add(456);

        for (Object o : lista) {
            System.out.println("Elemento: " + o);
        }

        try {
            String texto = (String) lista.get(1);
        } catch (ClassCastException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
