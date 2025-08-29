import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = new ArrayList();

        estudiantes.add(new Estudiante("Juan",20,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("María", 22, "Diseño Gráfico"));
        estudiantes.add(new Estudiante( "Pedro", 21, "Medicina"));

        System.out.println(estudiantes);

    }
}