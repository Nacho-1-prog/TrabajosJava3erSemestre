import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Producto p1 = new Producto("P001", "Libro Java", 1500.0, "Juan Pérez");
        Producto p2 = new Producto("P002", "Libro SQL", 1200.0, "Ana Gómez");
        Producto p3 = new Producto("P003", "Libro Spring", 2000.0, "Carlos Ruiz");

        ProductoDTO dto1 = new ProductoDTO("", "", 0);
        dto1.setCodigo("D001");
        dto1.setNombre("Cuaderno");
        dto1.setPrecio(300.0);

        ProductoDTO dto2 = new ProductoDTO("", "", 0);
        dto2.setCodigo("D002");
        dto2.setNombre("Lapicera");
        dto2.setPrecio(100.0);

        List<ProductoDTO> listaDTO = new ArrayList<>();
        listaDTO.add(dto1);
        listaDTO.add(dto2);

        System.out.println("Lista de ProductoDTO:");
        for (ProductoDTO dto : listaDTO) {
            System.out.println(dto);
        }

        System.out.println("\nLista de Producto:");
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);
    }
}
