
import java.util.Scanner;
public class SumaImparLimite {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese el valor mínimo del rango:");
        int minimo = scanner.nextInt();

        System.out.println("Ingrese el valor máximo del rango:");
        int maximo = scanner.nextInt();

        int sumaImpares = 0;

        // Ajuste del minimo si es par
        if (minimo % 2 == 0) {
            minimo++;
        }

        // Suma de los pares dentro del rango
        for (int i = minimo; i <= maximo; i += 2) {
            sumaImpares += i;
        }

        System.out.println("La suma de todos los valores impares entre " + minimo + " y " + maximo + " es: " + sumaImpares);


    }
}
