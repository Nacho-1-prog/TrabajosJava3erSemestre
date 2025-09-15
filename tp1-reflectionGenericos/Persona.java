public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public Persona() {
        this.nombre = "Sin nombre";
        this.edad = 0;
    }

    public String Saludar(){
        return "Hola, soy " + nombre + " y tengo " + edad + " años.";
    }


}
