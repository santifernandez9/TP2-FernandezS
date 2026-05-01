package resol.FernandezS;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Ejercicio4 {

    public static void ejecutar() {
        System.out.println("=== Ejercicio 4: Dia de la semana de nacimiento ===");

        // Fecha de nacimiento de Santiago Fernandez
        LocalDate fechaNacimiento = LocalDate.of(1999, 12, 20);

        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        DayOfWeek diaSemana = fechaNacimiento.getDayOfWeek();

        String diaEnEspanol = traducirDia(diaSemana);

        System.out.println("Fecha de nacimiento: " + fechaNacimiento.format(formatter));
        System.out.println("Naciste un: " + diaEnEspanol + " (" + diaSemana + ")");
    }

    private static String traducirDia(DayOfWeek dia) {
        switch (dia) {
            case MONDAY:    return "Lunes";
            case TUESDAY:   return "Martes";
            case WEDNESDAY: return "Miercoles";
            case THURSDAY:  return "Jueves";
            case FRIDAY:    return "Viernes";
            case SATURDAY:  return "Sabado";
            case SUNDAY:    return "Domingo";
            default:        return "Desconocido";
        }
    }
}
