import java.util.Scanner;

public class SoloPares2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor de n:");
        int n = scanner.nextInt();

        System.out.println("Los primeros " + n + " números pares son:");

        int contador = 0;
        int numero = 1;

        while (contador < n) {
            if (numero % 2 == 0) {
                System.out.println(numero);
                contador++;

            }
            numero++;
        }
    }
}