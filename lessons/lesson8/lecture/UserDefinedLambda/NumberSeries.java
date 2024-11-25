package java8featurepack.lambda;

import java.util.function.BiConsumer;

@FunctionalInterface
interface IGenerate{
	public void generate(int x);
}

@FunctionalInterface
interface IGenerateRange{
	public void generate(int x,int y);
}

public class NumberSeries {

	public static void main(String[] args) {
		// To Print the natural numbers
		IGenerate nn = (n)->{
			System.out.println("\nNatural Numbers : ");
			for(int i=1;i<=n;i++){
				System.out.print("  " + i );
			
		}

	};
nn.generate(10);
IGenerate odd = (n)->{
	System.out.println("\nOdd Numbers");
	for(int i=1;i<=n;i+=2){
		System.out.print("  " + i );
	
}

};
odd.generate(12);


IGenerateRange nnr = (x,y)->{
	System.out.println("\nNatural Numbers");
	for(int i=x;i<=y;i++){
		System.out.print("  " + i );
	
}

};
nnr.generate(20, 30);
// Find the suitable API Functional Interface
BiConsumer<Integer,Integer> ob = (x,y)-> {
	System.out.println("\nNatural Numbers");

for(int i=x;i<=y;i++){
	System.out.print("  " + i );

}
	};
	ob.accept(1, 5);
	System.out.println("\nFunctional Interface as arguments");

	TestGenerator obj = new TestGenerator();
	obj.testIGenerate(nn);
}
	
}

class TestGenerator
{
	public void testIGenerate(IGenerate I1){
		I1.generate(10);
	}
}