
import java.sql.SQLOutput;
import java.util.Scanner;
public class SecuenciaFibonacci {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.println("Ingrese la cantidad de números de la serie Fibonacci que desea mostrar:");
            int n = scanner.nextInt();

            System.out.println("Los primeros " + n + " números de la serie Fibonacci son:");

            int anterior = 0;
            int actual = 1;

            for (int i = 0; i < n; i++) {
                System.out.print(anterior + " ");
                int siguiente = anterior + actual;
                anterior = actual;
                actual = siguiente;

            }


        }
    }
