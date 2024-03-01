import java.util.Scanner;

public class FahrenheitToCelsius {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite a temperatura em Fahrenheit: ");
        double tempFahrenheit = scanner.nextDouble();

        double tempCelsius = (tempFahrenheit - 32) * 5 / 9;

        System.out.println("A temperatura em Celsius é: " + tempCelsius + "°C");
    }
}
