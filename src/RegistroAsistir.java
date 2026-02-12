import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RegistroAsistir {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Set<String> asistentes = new HashSet<>();

        String nombre;
        System.out.println("Registro de asistencia (escribe 'fin' para terminar)");

        while (true) {
            System.out.print("Ingrese nombre: ");
            nombre = scanner.nextLine();

            if (nombre.equalsIgnoreCase("fin")) {
                break;
            }

            // Intentar agregar al set
            if (asistentes.add(nombre)) {
                System.out.println("Asistencia registrada.");
            } else {
                System.out.println("Esta persona ya fue registrada.");
            }
        }

        System.out.println("\nLista final de asistentes:");
        for (String persona : asistentes) {
            System.out.println("- " + persona);
        }

        scanner.close();
    }
}
