package ru.mirea.lab6.ex11;
import java.util.Scanner;

interface Convert {
    double convert(double celsius);
}

class CelsKel implements Convert {
    public double convert(double celsius) {
        return celsius + 273.15;
    }
}

class CelsFar implements Convert {
    public double convert(double celsius) {
        return (celsius * 9/5) + 32;
    }
}
public class celc {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double cel = 0;
        System.out.print("Введите температуру: ");
        cel = scanner.nextInt();
        Convert celKel = new CelsKel();
        double kelvinTemperature = celKel.convert(cel);
        System.out.printf("Температура %.2f°C равна %.2fK\n", cel, kelvinTemperature);

        Convert celsiusToFahrenheit = new CelsFar();
        double fahrenheitTemperature = celsiusToFahrenheit.convert(cel);
        System.out.printf("Температура %.2f°C равна %.2f°F\n", cel, fahrenheitTemperature);
    }
}
