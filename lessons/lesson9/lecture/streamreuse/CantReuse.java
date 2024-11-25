package lesson9.lecture.streamreuse;

import java.util.stream.Stream;

//Shows how streams cannot be reused
public class CantReuse {
	//private Stream<String> stream =
		//	   Folks.friends.stream().filter(name -> name.startsWith("N")).forEach(System.out::println);
	public static void main(String[] args) {
		Stream<String> stream = Folks.friends.stream().filter(name -> name.startsWith("N"));
		stream.forEach(System.out::println); // Terminal operation invoked.
		int numFriendsStartWithN = (int)stream.count(); // Making use of Stream object causes Exception
		System.out.println(numFriendsStartWithN);
		
		//		CantReuse cr = new CantReuse();
	//	int numFriendsStartWithN = (int)cr.stream.count();
	//	System.out.println("Count = " + numFriendsStartWithN );
		//this leads to IllegalStateException because already terminal operation done with stream(count())
	//	List<String> nameListStartWithN = cr.stream.collect(Collectors.toList());
		//System.out.println(nameListStartWithN);
		
		
		/*  List<String>  lang= Arrays.asList("Python", "Java", "Java Script", "Kotlin", "JQuery", "Scala");
			Stream<String> fstream = lang.stream().filter(name -> name.startsWith("J"));
			String res=fstream.collect(Collectors.joining(","));
			long c = fstream.count();  
			System.out.println(res);
			System.out.println(c);*/

	}
}
