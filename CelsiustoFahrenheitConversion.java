import java.util.Scanner;

public class CelsiustoFahrenheitConversion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the temperature in Celsius: ");
        double celsius = scanner.nextDouble();

        double fahrenheit = (celsius * 9 / 5) + 32;

        System.out.printf("Temperature in Fahrenheit: %.2f\n", fahrenheit);
        scanner.close();
    }
}
