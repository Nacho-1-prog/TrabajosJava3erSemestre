import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<Curso, Integer> cursos = new HashMap<>();

        cursos.put(new Curso("Base de Datos","Profe 1"), 1);
        cursos.put(new Curso("Programación 3","Profe 2"), 2);
        cursos.put(new Curso("Inglés II","Profe 3"), 3);
        cursos.put(new Curso("Base de Datos","Profe 1"), 1);

        System.out.println("Cursos:");

        for (Map.Entry<Curso, Integer> entry : cursos.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}