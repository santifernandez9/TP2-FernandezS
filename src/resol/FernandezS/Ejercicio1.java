package resol.FernandezS;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ejercicio1 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("=== Ejercicio 1: Comparar dos fechas y horas ===");

        LocalDateTime fecha1 = null;
        LocalDateTime fecha2 = null;

        // Ingresar primera fecha
        while (fecha1 == null) {
            System.out.print("Ingrese la primera fecha y hora (dd/MM/yyyy HH:mm): ");
            String input1 = scanner.nextLine().trim();
            try {
                fecha1 = LocalDateTime.parse(input1, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato invalido. Intente de nuevo.");
            }
        }

        // Ingresar segunda fecha
        while (fecha2 == null) {
            System.out.print("Ingrese la segunda fecha y hora (dd/MM/yyyy HH:mm): ");
            String input2 = scanner.nextLine().trim();
            try {
                fecha2 = LocalDateTime.parse(input2, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato invalido. Intente de nuevo.");
            }
        }

        System.out.println("\nFecha 1: " + fecha1.format(formatter));
        System.out.println("Fecha 2: " + fecha2.format(formatter));

        if (fecha1.isAfter(fecha2)) {
            System.out.println("Resultado: La Fecha 1 es mayor (mas reciente).");
        } else if (fecha2.isAfter(fecha1)) {
            System.out.println("Resultado: La Fecha 2 es mayor (mas reciente).");
        } else {
            System.out.println("Resultado: Ambas fechas son iguales.");
        }
    }
}
