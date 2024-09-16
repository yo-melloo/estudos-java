public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        //celsius --> fahrenheit
        //(Celsius * 1.8 + 32)

        double celsius = 45.5;
        double fahrenheit = (celsius * 1.8) + 32;
        int temperatura = (int) fahrenheit;

        System.out.println("-> A temperatura de " + celsius + " °C equivale a: " + fahrenheit + " °F.");
        System.out.println("--> " + temperatura + " °F.");

    }
}
