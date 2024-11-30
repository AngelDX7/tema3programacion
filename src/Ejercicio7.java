import java.util.Scanner;
public class Ejercicio7 {
    public static boolean esPrimo(int num) {
        if (num < 2) {
            return false;
        }
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Introduce numeros enteros positivos (0 para terminar):");
        numero = scanner.nextInt();

        while (numero != 0) {
            if (esPrimo(numero)) {
                System.out.println(numero + " es un número primo.");
            } else {
                System.out.println(numero + " no es un número primo.");
            }
            System.out.print("Número: ");
            numero = scanner.nextInt();
        }
    }
}





