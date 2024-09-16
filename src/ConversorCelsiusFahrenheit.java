public class ConversorCelsiusFahrenheit {
    public static void main(String[] args) {
        //celsius --> fahrenheit
        //(Celsius * 1.8 + 32)

        double celsius = 45.5;
        double fahrenheit = (celsius * 1.8) + 32;
        int temperatura = (int) fahrenheit;
        String mensagem = String.format("-> A temperatura de %.1f °C, equivale a: %.1f °F.", celsius, fahrenheit);

        System.out.println(mensagem);

        System.out.println("--> " + temperatura + " °F.");

    }
}
