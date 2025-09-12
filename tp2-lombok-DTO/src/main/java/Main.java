import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        Usuario usuario = Usuario.builder()
                .id(1L)
                .nombre("Juan")
                .email("juan@email.com")
                .build();

        Usuario usuario1 = Usuario.builder()
                .id(2L)
                .nombre("Jose")
                .email("jose@email.com")
                .build();

        Usuario usuario2 = Usuario.builder()
                .id(3L)
                .nombre("Pepe")
                .email("Pepe@email.com")
                .build();

        System.out.println(usuario);
        System.out.println(usuario1);
        System.out.println(usuario2);
    }

}
