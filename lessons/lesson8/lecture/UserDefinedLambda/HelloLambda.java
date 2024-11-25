
package java8featurepack.lambda;

import java.util.function.Function;

//  Simple Lambda Expression

public class HelloLambda {
    
    /**
     * Functional Interface
     */
    public interface HelloType {
        /**
         * Function that will be implemented within the lambda
         * @param text 
         */
        void hello(String text);
    }
    
    public static void main(String[] args){
        // Invoke the lambda, passing a parameter named "text" to the
        // hello() method, returning the string
        HelloType helloLambda = 
                (String text) -> {System.out.println("Hello " + text);};
                
        // Invoke the method call
        helloLambda.hello("Lambda");
      
        // Using Function
      //  Function<String,Integer> FI = (String text) -> {return text.length();};
        Function<String,Integer> FI = (text) ->  text.length();
        int res = FI.apply("Renuka");
        System.out.println("String Length : "  +res);
        
        double  c = 1.6;
        Function<Integer, Double> milesToKms = (input) -> c * input; 
        
        double km = milesToKms.apply(15);
        System.out.println("Equalent Kms for 15 miles  : "  +km);
    }
    }

