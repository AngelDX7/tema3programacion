import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un día (1-31): ");
        int dia = sc.nextInt();
        System.out.print("Introduce un mes (1-12): ");
        int mes = sc.nextInt();
        System.out.print("Introduce un año: ");
        int año = sc.nextInt();
        if (esFechaValida(dia, mes, año)) {
            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " es correcta.");
        } else {
            System.out.println("La fecha " + dia + "/" + mes + "/" + año + " no es válida.");
        }

        sc.close();
    }

    public static boolean esFechaValida(int dia, int mes, int año) {
        if (mes < 1 || mes > 12) {
            return false;
        }

        if (dia < 1 || dia > 31) {
            return false;
        }


        if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            return dia <= 30;
        } else if (mes == 2) {
            if (esBisiesto(año)) {
                return dia <= 29;
            } else {
                return dia <= 28;
            }
        } else {
            return dia <= 31;
        }
    }

    public static boolean esBisiesto(int año) {
        return (año % 4 == 0 && año % 100 != 0) || (año % 400 == 0);
    }
}
