package resol.FernandezS;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        while (!salir) {
            System.out.println("\n╔══════════════════════════════════════╗");
            System.out.println("║        TRABAJO PRACTICO 2 - TP2      ║");
            System.out.println("╠══════════════════════════════════════╣");
            System.out.println("║  1.  Comparar dos LocalDateTime      ║");
            System.out.println("║  2.  Dias desde el nacimiento        ║");
            System.out.println("║  3.  Duracion de jornada             ║");
            System.out.println("║  4.  Dia de la semana al nacer       ║");
            System.out.println("║  5.  Tiempo hasta el parcial         ║");
            System.out.println("║  6.  Dias hasta el cumpleanos        ║");
            System.out.println("║  7.  Triangulo de asteriscos         ║");
            System.out.println("║  8.  Consumo de combustible          ║");
            System.out.println("║  9.  Cuenta billetes                 ║");
            System.out.println("║  10. Array de calificaciones         ║");
            System.out.println("║  0.  Salir                           ║");
            System.out.println("╚══════════════════════════════════════╝");
            System.out.print("Seleccione un ejercicio: ");

            int opcion = -1;
            if (scanner.hasNextInt()) {
                opcion = scanner.nextInt();
                scanner.nextLine(); // limpiar buffer
            } else {
                System.out.println("Opcion invalida. Ingrese un numero.");
                scanner.nextLine();
                continue;
            }

            System.out.println();

            switch (opcion) {
                case 1:
                    Ejercicio1.ejecutar();
                    break;
                case 2:
                    Ejercicio2.ejecutar();
                    break;
                case 3:
                    Ejercicio3.ejecutar();
                    break;
                case 4:
                    Ejercicio4.ejecutar();
                    break;
                case 5:
                    Ejercicio5.ejecutar();
                    break;
                case 6:
                    Ejercicio6.ejecutar();
                    break;
                case 7:
                    Ejercicio7.ejecutar();
                    break;
                case 8:
                    Ejercicio8.ejecutar();
                    break;
                case 9:
                    Ejercicio9.ejecutar();
                    break;
                case 10:
                    Ejercicio10.ejecutar();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. Hasta luego!");
                    salir = true;
                    break;
                default:
                    System.out.println("Opcion no valida. Elija entre 0 y 10.");
            }
        }

        scanner.close();
    }
}
