package resol.FernandezS;

import java.util.Scanner;

public class Ejercicio9 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ejercicio 9: Cuenta billetes ===");
        System.out.print("Ingrese el monto de dinero (numero entero): ");

        int monto = 0;
        while (monto <= 0) {
            if (scanner.hasNextInt()) {
                monto = scanner.nextInt();
                if (monto <= 0) {
                    System.out.print("Ingrese un monto positivo: ");
                }
            } else {
                System.out.print("Valor invalido. Ingrese un numero entero: ");
                scanner.next();
            }
        }

        int[] denominaciones = {20000, 10000, 1000, 500, 200, 100, 50, 20, 10};
        int[] cantidades     = new int[denominaciones.length];

        int resto = monto;

        for (int i = 0; i < denominaciones.length; i++) {
            cantidades[i] = resto / denominaciones[i];
            resto         = resto % denominaciones[i];
        }

        System.out.println("\nMonto ingresado: $" + monto);
        System.out.println("Desglose con minima cantidad de billetes:");

        int totalBilletes = 0;
        for (int i = 0; i < denominaciones.length; i++) {
            if (cantidades[i] > 0) {
                System.out.println("  Billetes de $" + denominaciones[i] + ": " + cantidades[i]);
                totalBilletes += cantidades[i];
            }
        }

        if (resto > 0) {
            System.out.println("  (No se puede representar exactamente $" + resto + " con los billetes disponibles)");
        }

        System.out.println("Total de billetes utilizados: " + totalBilletes);
    }
}
