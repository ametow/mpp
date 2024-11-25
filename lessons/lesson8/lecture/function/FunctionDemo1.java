package java8featurepack.lambda.function;
import java.util.function.Function;

public class FunctionDemo1 {
    public static void main(String[] args) {
        Function<Integer, Double> milesToKms = 
                (input) -> 1.6 * input; // Lambda Implementation for apply method
        int miles = 3;
        double kms = milesToKms.apply(miles);
        System.out.printf("%d miles = %3.2f kilometers\n", 
                miles, kms);
        
        int kg = 5;
        Function<Integer, Double> kgToLbs = 
                (input) ->{
                	  	return 2.20462 * input;
                };
        double lbs = kgToLbs.apply(kg);
        System.out.printf("%d Kilograms = %3.2f Pounds\n", 
                        kg,lbs);
    }
}