import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) throws Exception {

        Constructor<?> constructor = Persona.class.getDeclaredConstructor(String.class, int.class);
        Object personaObj = constructor.newInstance("Carlos", 25);

        Method saludarMethod = Persona.class.getDeclaredMethod("Saludar");
        saludarMethod.setAccessible(true);
        String saludo1 = (String) saludarMethod.invoke(personaObj);
        System.out.println("Saludo original: " + saludo1);

        Field nombreField = Persona.class.getDeclaredField("nombre");
        nombreField.setAccessible(true);
        nombreField.set(personaObj, "Juan");

        String saludo2 = (String) saludarMethod.invoke(personaObj);
        System.out.println("Saludo modificado: " + saludo2);
    }
}

