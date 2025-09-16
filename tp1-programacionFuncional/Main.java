import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        List<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("Ana", 7.6,"Matematica"));
        alumnos.add(new Alumno("Jose", 9.7,"Base de Datos"));
        alumnos.add(new Alumno("Pepe", 3.5,"Programacion"));
        alumnos.add(new Alumno("Martina", 8.1,"Metodologia"));

        List<String> aprobadosOrdenados = alumnos.stream()
                .filter(a -> a.getNota() >= 7)
                .map(a -> a.getNombre().toUpperCase())
                .sorted()
                .collect(Collectors.toList());

        double promedioGeneral = alumnos.stream()
                .mapToDouble(Alumno::getNota)
                .average()
                .orElse(0.0);

        Map<String, List<Alumno>> agrupadosPorCurso = alumnos.stream()
                .collect(Collectors.groupingBy(Alumno::getCurso));

        List<Alumno> top3 = alumnos.stream()
                .sorted(Comparator.comparingDouble(Alumno::getNota).reversed())
                .limit(3)
                .collect(Collectors.toList());

        System.out.println("Lista de aprobados: \n" + aprobadosOrdenados);
        System.out.println("Promedio general: " + promedioGeneral);
        for (Alumno alumno : top3){
            System.out.println("Nombre: " + alumno.getNombre()+" -- Nota: "+alumno.getNota());
        }
    }
}
