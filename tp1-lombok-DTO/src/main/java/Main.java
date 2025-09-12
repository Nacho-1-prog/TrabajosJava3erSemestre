import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ArrayList<Persona> personas = new ArrayList();

        personas.add(new Persona("Pepe",18));
        personas.add(new Persona("Jose", 20));
        personas.add(new Persona("Pedrito",31));

        System.out.println("Personas: ");

        for (Persona persona : personas) {
            System.out.println(persona.getNombre() + ", Edad: " + persona.getEdad());
        }
    }

}
