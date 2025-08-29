package Trabajo2;

import java.util.ArrayList;

public class Main{
    public static void main(String[] args) {

        ArrayList<Estudiante> estudiantes = new ArrayList();
        ArrayList<Estudiante> estudiantes2 = new ArrayList();
        ArrayList<Estudiante> estudiantes3 = new ArrayList();

        estudiantes.add(new Estudiante("Juan",20,"Ingieneria en Sistemas"));
        estudiantes.add(new Estudiante("María", 22, "Diseño Gráfico"));
        estudiantes.add(new Estudiante( "Pedro", 21, "Medicina"));
        estudiantes2.add(new Estudiante("Jose",20,"Ingieneria en Sistemas"));
        estudiantes2.add(new Estudiante("Martina", 22, "Diseño Gráfico"));
        estudiantes2.add(new Estudiante( "Pablo", 21, "Medicina"));
        estudiantes3.add(new Estudiante("Jeronimo",20,"Ingieneria en Sistemas"));
        estudiantes3.add(new Estudiante("Melina", 22, "Diseño Gráfico"));
        estudiantes3.add(new Estudiante( "Franciso", 21, "Medicina"));

        Curso curso1 = new Curso("Programación", estudiantes);
        Curso curso2 = new Curso("Base de Datos", estudiantes2);
        Curso curso3 = new Curso("Ingles", estudiantes3);

        System.out.println(curso1);
        System.out.println(curso2);
        System.out.println(curso3);

    }
}