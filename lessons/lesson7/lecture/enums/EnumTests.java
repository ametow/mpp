package lesson7.lecture.enums;
enum size{
	A {
		@Override
		void show() {
			// TODO Auto-generated method stub
			System.out.println("Show A");
			
		}
		
	}, B {
		@Override
		void show() {
			// TODO Auto-generated method stub
			System.out.println("Show B");
			
		}
	}, C {
		@Override
		void show() {
			// TODO Auto-generated method stub
			System.out.println("Show C");
			
		}
	};
	int x;
	  size(){
		System.out.println("Common Constructor");
	}
	void B(){
		System.out.println("Constructor B");
	}
	abstract void show();
		}
public class EnumTests {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//size x = size.A;
	
	//System.out.println(x.toString());
	size.A.show();
	size k = size.B;
	k.show();

	}

}
