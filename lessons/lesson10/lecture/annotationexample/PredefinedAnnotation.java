package lesson10.lecture.annotationexample;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.swing.JDialog;

public class PredefinedAnnotation {
	//@SuppressWarnings("all")
	
	public static void main(String[] args) {
	// SuppressWarnings examples
		@SuppressWarnings("unused")
		int x = 10;
		
		@SuppressWarnings({ "rawtypes", "unused" })
		List words = new ArrayList();
		
		
		Date d = new Date();
		d.getDay(); // Deprecated Method
		
		}
	
	@SuppressWarnings("deprecation")
	public void showDialog() {
	    JDialog dialog = new JDialog();
	    dialog.show();  // this is a deprecated method
	}
	@Deprecated
	public void testDepricate(){
	System.out.println("No longer used this method");	
	}
	
}
