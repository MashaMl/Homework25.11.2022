package Task5;

public class ConverterTemperature {
    final int CELSIUS = 1;
    final int KELVIN = 2;
    final int FAHRENHEIT = 3;

    public static void convert(double valueToConvert, int typeOriginal, int typeToConvert) {
        if(typeToConvert < 1 || typeToConvert > 3 || typeOriginal < 1 || typeOriginal > 3)
            System.out.println("Wrong type for converting");
        if(typeToConvert == typeOriginal && typeToConvert >= 1 && typeToConvert <= 3 && typeOriginal >= 1 && typeOriginal <= 3) {
            System.out.println("You try to convert the same types");
        }
        else {
            switch (typeOriginal) {
                case 1:
                    switch (typeToConvert) {
                        case 2:
                            System.out.println(valueToConvert + " CELSIUS to KELVIN = " + (valueToConvert + 273.15));
                            break;
                        case 3:
                            System.out.println(valueToConvert + " CELSIUS to FAHRENHEIT = " + ((valueToConvert * 9 / 5) + 32));
                            break;
                    }
                    break;
                case 2:
                    switch (typeToConvert) {
                        case 1:
                            System.out.println(valueToConvert + " KELVIN to CELSIUS = " + (valueToConvert - 273.15));
                            break;
                        case 3:
                            System.out.println(valueToConvert + " KELVIN to FAHRENHEIT = " + (((valueToConvert - 273.15) * 9 / 5) + 32));
                            break;
                    }
                    break;
                case 3:
                    switch (typeToConvert) {
                        case 1:
                            System.out.println(valueToConvert + " FAHRENHEIT to CELSIUS = " + ((valueToConvert - 32) * 5 / 9));
                            break;
                        case 2:
                            System.out.println(valueToConvert + " FAHRENHEIT to KELVIN = " + ((valueToConvert - 32) * 5 / 9 + 273.15));
                            break;
                    }
                    break;
            }
        }
    }
}
