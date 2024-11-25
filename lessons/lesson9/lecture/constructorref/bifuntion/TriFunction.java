package lesson9.lecture.constructorref.bifuntion;

@FunctionalInterface
public interface TriFunction<S, U, R, T> {

	T apply(S s, U u, R r);
	/*default Apple apply(String s, Double d1,Double d2){
		return new Apple(s,d1,d2);
	}*/
//	void show();

}
