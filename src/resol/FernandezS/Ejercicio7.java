package resol.FernandezS;

import java.util.Scanner;

public class Ejercicio7 {

    public static void ejecutar() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Ejercicio 7: Triangulo de asteriscos ===");
        System.out.print("Ingrese el numero de filas (n): ");

        int n = 0;
        while (n <= 0) {
            if (scanner.hasNextInt()) {
                n = scanner.nextInt();
                if (n <= 0) {
                    System.out.print("Ingrese un numero positivo: ");
                }
            } else {
                System.out.print("Valor invalido. Ingrese un numero entero positivo: ");
                scanner.next();
            }
        }

        System.out.println();
        for (int i = 1; i <= n; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
