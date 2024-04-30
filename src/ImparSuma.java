
import java.util.Scanner;
public class ImparSuma {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un número entero positivo:");
        int n = scanner.nextInt();

        int sumaImpares = 0;

        for (int i = 1; i <= n; i += 2) {
            sumaImpares += i;
        }

        System.out.println("La suma de todos los valores impares desde 0 hasta " + n + " es: " + sumaImpares);
    }
}