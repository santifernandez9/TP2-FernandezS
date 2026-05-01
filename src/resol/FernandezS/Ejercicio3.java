package resol.FernandezS;

import java.time.Duration;
import java.time.LocalTime;

public class Ejercicio3 {

    public static void ejecutar() {
        System.out.println("=== Ejercicio 3: Duracion de jornada laboral ===");

        LocalTime inicio = LocalTime.of(7, 0);   // 07:00
        LocalTime fin    = LocalTime.of(15, 0);  // 15:00

        Duration duracion = Duration.between(inicio, fin);

        long horas   = duracion.toHours();
        long minutos = duracion.toMinutes();

        System.out.println("Actividad: Jornada laboral");
        System.out.println("Hora de inicio: " + inicio);
        System.out.println("Hora de fin:    " + fin);
        System.out.println();
        System.out.println("Duracion total: " + horas + " horas");
        System.out.println("Duracion total: " + minutos + " minutos");
    }
}
