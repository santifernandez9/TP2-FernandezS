package resol.FernandezS;

import java.util.Scanner;

public class Ejercicio8 {

    // Constantes de consumo
    private static final double CONSUMO_NORMAL   = 8.0;   // litros cada 100 km
    private static final double AUMENTO_DESIGUAL = 0.15;  // 15% mas de consumo

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ejercicio 8: Consumo de combustible ===");
        System.out.print("Ingrese la cantidad de litros en el deposito: ");

        double litros = 0;
        while (litros <= 0) {
            if (scanner.hasNextDouble()) {
                litros = scanner.nextDouble();
                if (litros <= 0) {
                    System.out.print("Ingrese un valor positivo: ");
                }
            } else {
                System.out.print("Valor invalido. Ingrese un numero: ");
                scanner.next();
            }
        }

        double kmNormales  = calcularKmNormales(litros);
        double kmDesiguales = calcularKmDesiguales(litros);

        System.out.println("\nCon " + litros + " litros:");
        System.out.printf("  En carretera normal:   %.2f km%n", kmNormales);
        System.out.printf("  En carretera desigual: %.2f km%n", kmDesiguales);
    }

    // Metodo 1: kilometros en carretera normal
    public static double calcularKmNormales(double litros) {
        return (litros / CONSUMO_NORMAL) * 100;
    }

    // Metodo 2: kilometros en carretera desigual (15% mas de consumo)
    public static double calcularKmDesiguales(double litros) {
        double consumoDesigual = CONSUMO_NORMAL * (1 + AUMENTO_DESIGUAL);
        return (litros / consumoDesigual) * 100;
    }
}
