package resol.FernandezS;

import java.util.Scanner;

public class Ejercicio10 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ejercicio 10: Array de calificaciones ===");

        int cantidad = 10;
        String[] nombres       = new String[cantidad];
        double[] notas         = new double[cantidad];
        String[] resultados    = new String[cantidad];

        // Cargar datos
        for (int i = 0; i < cantidad; i++) {
            System.out.println("\nAlumno " + (i + 1) + ":");

            System.out.print("  Nombre: ");
            nombres[i] = scanner.nextLine().trim();

            notas[i] = ingresarNotaValida(scanner, i + 1);
            resultados[i] = calificarNota(notas[i]);
        }

        // Mostrar resultados
        System.out.println("\n========================================");
        System.out.println("         LISTADO DE CALIFICACIONES      ");
        System.out.println("========================================");
        System.out.printf("%-20s %-8s %-15s%n", "Alumno", "Nota", "Resultado");
        System.out.println("----------------------------------------");

        for (int i = 0; i < cantidad; i++) {
            System.out.printf("%-20s %-8.2f %-15s%n", nombres[i], notas[i], resultados[i]);
        }

        System.out.println("========================================");
        System.out.printf("Promedio general: %.2f%n", calcularPromedio(notas));
    }

    // Metodo: ingresar y validar nota entre 0 y 10
    public static double ingresarNotaValida(Scanner scanner, int nroAlumno) {
        double nota = -1;
        while (nota < 0 || nota > 10) {
            System.out.print("  Nota (0 a 10): ");
            if (scanner.hasNextDouble()) {
                nota = scanner.nextDouble();
                scanner.nextLine(); // limpiar buffer
                if (nota < 0 || nota > 10) {
                    System.out.println("  Nota invalida. Debe estar entre 0 y 10.");
                }
            } else {
                System.out.println("  Valor invalido. Ingrese un numero.");
                scanner.nextLine();
            }
        }
        return nota;
    }

    // Metodo: calificar nota en palabras
    public static String calificarNota(double nota) {
        if (nota >= 0 && nota < 5) {
            return "Suspenso";
        } else if (nota >= 5 && nota < 7) {
            return "Bien";
        } else if (nota >= 7 && nota < 9) {
            return "Notable";
        } else {
            return "Sobresaliente";
        }
    }

    // Metodo: calcular promedio del array
    public static double calcularPromedio(double[] notas) {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
}
