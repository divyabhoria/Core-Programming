import java.util.Scanner;

public class CalculateAverageofThreeNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        double num1 = scanner.nextDouble();

        System.out.print("Enter second number: ");
        double num2 = scanner.nextDouble();

        System.out.print("Enter third number: ");
        double num3 = scanner.nextDouble();

        double average = (num1 + num2 + num3) / 3.0;

        System.out.println("Average = " + average);

        scanner.close();
    }
}

