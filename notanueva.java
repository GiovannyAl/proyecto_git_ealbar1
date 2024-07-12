import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Capturar el primer número
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();

        // Capturar el segundo número
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        // Calcular la suma
        double suma = num1 + num2;

        // Mostrar el resultado
        System.out.println("La suma es: " + suma);
    }
}
