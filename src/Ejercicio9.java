import java.util.Scanner;

public class Ejercicio9 {

    public static void mostrarTriangulo(char caracter, int lineas) {
        for (int i = 1; i <= lineas; i++) {
            for (int j = 1; j <= lineas - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el carácter para el triángulo: ");
        char caracter = sc.next().charAt(0);
        System.out.print("Introduce el número de líneas: ");
        int lineas = sc.nextInt();
        mostrarTriangulo(caracter, lineas);
    }
}
