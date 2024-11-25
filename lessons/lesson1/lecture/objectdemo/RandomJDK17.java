package lesson1.lecture.objectdemo;
import java.util.Random;
import java.util.random.RandomGenerator;
public class RandomJDK17 {
    public static void main(String args[])  {
        // Get the object of RandomGenerator using L32X64MixRandom algorithm
        RandomGenerator rg = RandomGenerator.getDefault();
        int r1 = rg.nextInt();
        // Get the Random Integer
        var rn1 =  RandomGenerator.getDefault().nextInt();
        System.out.println(rn1);
        // Print five random double values with the bound
        for(int i=1;i<=5;i++){
            System.out.printf("%.2f\n",rg.nextDouble(100));
        }
        // Returns an instance of RandomGenerator that uses the name algorithm.
        var rg2 = RandomGenerator.of("Xoshiro256PlusPlus");
        System.out.println(rg2.nextLong(10l,50l));

        // From JDK 17, Random class implements RandomGenerator. Can use all the methods from it
        Random random = new Random();
        System.out.println(random.nextDouble(10.5,23.5));
    }
}
