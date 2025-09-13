import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("001", "Teclado", "Logitech", 15000);
        Producto p2 = new Producto("002", "Mouse", "Redragon", 8000);
        Producto p3 = new Producto("003", "Monitor", "Samsung", 120000);

        ProductoRecord r1 = new ProductoRecord(p1.getCodigo(), p1.getNombre(), p1.getPrecio());
        ProductoRecord r2 = new ProductoRecord(p2.getCodigo(), p2.getNombre(), p2.getPrecio());
        ProductoRecord r3 = new ProductoRecord(p3.getCodigo(), p3.getNombre(), p3.getPrecio());

        List<ProductoRecord> lista = new ArrayList<>();
        lista.add(r1);
        lista.add(r2);
        lista.add(r3);

        lista.forEach(System.out::println);

    }
}
