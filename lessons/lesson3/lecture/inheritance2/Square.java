package lesson3.lecture.inheritance2;

/**
 * Square IS-A Rectangle, but LSP is violated.
 *
 */
public class Square extends Rectangle {
	
	public Square(int side) {
		super(side, side);
	}
	
}
