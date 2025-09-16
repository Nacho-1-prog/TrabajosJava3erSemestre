import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Producto> productos = new ArrayList<>();

        productos.add(new Producto("Papel Higienico","Higiene", 2500,100));
        productos.add(new Producto("Televisor","Televisores", 300000,20));
        productos.add(new Producto("Lavarropas","Electrodomesticos", 150000,60));
        productos.add(new Producto("Galletas de agua","Galletas", 1500,300));
        productos.add(new Producto("Botella de Agua","Bebidas", 2000,120));


        System.out.println(" Productos mayores o igual a 100: ");
        productos.stream()
                .filter(p -> p.getPrecio() > 100)
                .sorted(Comparator.comparingDouble(Producto::getPrecio).reversed())
                .forEach(p -> System.out.println("- " + p.getNombre() + " ($" + p.getPrecio() + ")"));

        System.out.println("\n Stock total por categoría:");
        Map<String, Integer> stockPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.summingInt(Producto::getStock)
                ));

        stockPorCategoria.forEach((categoria, stockTotal) ->
                System.out.println("- " + categoria + ": " + stockTotal + " unidades")
        );

        String resumen = productos.stream()
                .map(p -> p.getNombre() + " $" + p.getPrecio())
                .collect(Collectors.joining("; "));

        System.out.println("\n Resumen de productos:");
        System.out.println(resumen);

        double promedioGeneral = productos.stream()
                .mapToDouble(Producto::getPrecio)
                .average()
                .orElse(0.0);

        System.out.println("\n Precio promedio general: $" + promedioGeneral);

        Map<String, Double> promedioPorCategoria = productos.stream()
                .collect(Collectors.groupingBy(
                        Producto::getCategoria,
                        Collectors.averagingDouble(Producto::getPrecio)
                ));

        System.out.println(" Precio promedio por categoría:");
        promedioPorCategoria.forEach((categoria, promedio) ->
                System.out.println("- " + categoria + ": $" + promedio)
        );
    }
}
