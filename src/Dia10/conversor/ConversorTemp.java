package Dia10.conversor;

public class ConversorTemp {
    public static void main(String[] args) {
        System.out.println(celsiusParaFahrenheit(32));
        System.out.println(fahrenheitParaCelsius(89.6));
    }

    public static double celsiusParaFahrenheit(double temp) {
        return temp * 1.8 + 32;
    }

    public static double fahrenheitParaCelsius(double temp) {
        return ((temp - 32) / 9) * 5;
    }
}


