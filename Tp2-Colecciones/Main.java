import java.util.Set;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) {

        HashSet<Producto> productos = new HashSet();
        productos.add(new Producto("P-1000","Papel Higienico"));
        productos.add(new Producto("P-1001","Manteca"));
        productos.add(new Producto("A-0821","Yogurt Ilolay"));
        productos.add(new Producto("E-3257","Jamon Crudo 100g"));
        productos.add(new Producto("P-1000","Papel Higienico"));

        System.out.println("Productos:");

        for (Producto producto : productos) {
            System.out.println(producto.getCodigo() + " " + producto.getDescripcion());
        }
    }
}