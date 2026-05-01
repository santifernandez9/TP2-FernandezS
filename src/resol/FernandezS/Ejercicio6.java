package resol.FernandezS;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class Ejercicio6 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("=== Ejercicio 6: Dias hasta el proximo cumpleanos ===");

        LocalDate fechaNacimiento = null;

        while (fechaNacimiento == null) {
            System.out.print("Ingrese su fecha de nacimiento (dd/MM/yyyy): ");
            String input = scanner.nextLine().trim();
            try {
                fechaNacimiento = LocalDate.parse(input, formatter);
            } catch (DateTimeParseException e) {
                System.out.println("Formato invalido. Intente de nuevo.");
            }
        }

        LocalDate hoy = LocalDate.now();

        // Calcular el proximo cumpleanos en el año actual
        LocalDate cumpleAnioActual = fechaNacimiento.withYear(hoy.getYear());

        LocalDate proximoCumple;
        if (cumpleAnioActual.isAfter(hoy)) {
            // El cumpleaños todavia no paso este año
            proximoCumple = cumpleAnioActual;
        } else if (cumpleAnioActual.equals(hoy)) {
            System.out.println("\nHoy es tu cumpleanos! Felicitaciones!");
            proximoCumple = cumpleAnioActual.plusYears(1);
        } else {
            // Ya paso, el proximo es el año que viene
            proximoCumple = cumpleAnioActual.plusYears(1);
        }

        // Calcular dias usando toEpochDay (sin ChronoUnit), tal como pide la consigna
        long diasRestantes = proximoCumple.toEpochDay() - hoy.toEpochDay();

        System.out.println("\nFecha de nacimiento: " + fechaNacimiento.format(formatter));
        System.out.println("Hoy:                 " + hoy.format(formatter));
        System.out.println("Proximo cumpleanos:  " + proximoCumple.format(formatter));
        System.out.println("Dias restantes:      " + diasRestantes + " dias");
    }
}
