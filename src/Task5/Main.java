package Task5;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("----WELCOME TO TEMPERATURE CONVERTER---- \nPlease enter the original value of temperature: ");
        Scanner scanner = new Scanner(System.in);
        double value = scanner.nextDouble();
        System.out.println("Choose the original type of temperature: \nTo choose CELSIUS - type 1\nTo choose KELVIN - type 2\nTo choose FAHRENHEIT - type 3");
        int originalType = scanner.nextInt();
        System.out.println("Choose the type to convert: \nTo choose CELSIUS - type 1\nTo choose KELVIN - type 2\nTo choose FAHRENHEIT - type 3");
        int convertType = scanner.nextInt();
        ConverterTemperature converterTemperature = new ConverterTemperature();
        converterTemperature.convert(value, originalType, convertType);
    }
}
