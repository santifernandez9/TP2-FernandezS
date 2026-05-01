package resol.FernandezS;

import java.time.DayOfWeek;
import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Ejercicio5 {

    public static void ejecutar() {
        System.out.println("=== Ejercicio 5: Tiempo hasta el primer parcial ===");

        // Fecha y hora del parcial: 25 de junio a las 19:20
        LocalDateTime parcial = LocalDateTime.of(2026, 6, 25, 19, 20);
        LocalDateTime ahora   = LocalDateTime.now();

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");

        System.out.println("Ahora:            " + ahora.format(formatter));
        System.out.println("Fecha del parcial: " + parcial.format(formatter));
        System.out.println();

        if (ahora.isAfter(parcial)) {
            System.out.println("El parcial ya paso.");
            return;
        }

        // Tiempo restante con Period (fecha) + Duration (hora)
        LocalDate fechaHoy     = ahora.toLocalDate();
        LocalDate fechaParcial = parcial.toLocalDate();
        Period periodo = Period.between(fechaHoy, fechaParcial);

        Duration duracion = Duration.between(ahora, parcial);
        long horasTotales   = duracion.toHours();
        long minutosTotales = duracion.toMinutes();

        System.out.println("Tiempo restante:");
        System.out.println("  " + periodo.getMonths() + " mes/es, "
                + periodo.getDays() + " dia/s");
        System.out.println("  (" + horasTotales + " horas / " + minutosTotales + " minutos en total)");

        // Contar clases los jueves hasta la fecha del parcial
        // Segun el ejemplo del App.java, la materia se dicta los jueves
        int cantidadClases = 0;
        LocalDate cursor = fechaHoy.plusDays(1); // empezamos desde mañana

        while (!cursor.isAfter(fechaParcial)) {
            if (cursor.getDayOfWeek() == DayOfWeek.THURSDAY) {
                cantidadClases++;
            }
            cursor = cursor.plusDays(1);
        }

        System.out.println();
        System.out.println("Clases de Programacion II que quedan (jueves): " + cantidadClases);
    }
}
