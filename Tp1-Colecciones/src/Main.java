import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<>();

        alumnos.add(new Alumno("José", 8));
        alumnos.add(new Alumno("Carlos", 6));
        alumnos.add(new Alumno("Rubén", 9));
        alumnos.add(new Alumno("José", 8));

        System.out.println("Alumnos:");
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombre() +" nota: " + alumno.getNota());
        }
    }
}

