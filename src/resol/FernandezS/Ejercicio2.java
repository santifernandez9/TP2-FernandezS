package resol.FernandezS;

import java.time.LocalDate;
import java.time.Period;

public class Ejercicio2 {

    public static void ejecutar() {
        System.out.println("=== Ejercicio 2: Dias transcurridos desde el nacimiento ===");

        // Fecha de nacimiento de Santiago Fernandez
        LocalDate fechaNacimiento = LocalDate.of(1999, 12, 20);
        LocalDate hoy = LocalDate.now();

        // Calcular sin ChronoUnit usando Period para mostrar desglose
        Period periodo = Period.between(fechaNacimiento, hoy);
        int años = periodo.getYears();
        int meses = periodo.getMonths();
        int dias = periodo.getDays();

        // Calculo exacto de dias totales sin ChronoUnit usando toEpochDay (metodo de LocalDate)
        long diasExactos = hoy.toEpochDay() - fechaNacimiento.toEpochDay();

        System.out.println("Fecha de nacimiento: " + fechaNacimiento);
        System.out.println("Fecha actual:        " + hoy);
        System.out.println();
        System.out.println("Tiempo transcurrido: " + años + " años, " + meses + " meses y " + dias + " dias");
        System.out.println("Dias exactos transcurridos: " + diasExactos + " dias");
    }
}
