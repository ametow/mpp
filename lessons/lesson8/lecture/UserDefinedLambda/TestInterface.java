package java8featurepack.lambda;

public interface TestInterface {

}

@FunctionalInterface // <- error here
interface FunctionalInterfaceExample1 {
	void show();
}

/*@FunctionalInterface
interface FunctionalInterfaceExample2 {
void apply();
void illegal(); // <- error here
}*/

@FunctionalInterface
interface A {
abstract void apply();
}


@FunctionalInterface
interface B {
abstract void apply();
String toString();
}

interface C {
void apply();
int hashCode();
}
