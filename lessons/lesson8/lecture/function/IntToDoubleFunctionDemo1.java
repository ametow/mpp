package java8featurepack.lambda.function;
import java.util.function.IntToDoubleFunction;

public class IntToDoubleFunctionDemo1 {
    public static void main(String[] args) {
        IntToDoubleFunction celciusToFahrenheit = 
                (input) -> 1.8 * input + 32;
        int celcius = 100;
        double fahrenheit = 
                celciusToFahrenheit.applyAsDouble(celcius);
        System.out.println(celcius + "\u2103" + " = " 
                + fahrenheit + "\u2109\n");
    }
}