package lesson10.lecture.exceptions;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.stream.Collectors;

public class TypicalExceptionFunctional {

	static String fileName = "sample.txt";
	static void printFile(File f) {
		try {
			BufferedReader reader = new BufferedReader(new FileReader(f));
			System.out.println(reader.lines().collect(Collectors.joining(", ")));
			reader.close();
		} catch(IOException e) {
			System.out.println("Error printing file: " + e.getMessage());
			
		}
	}
	public static void main(String[] args) {
		
		File f = new File(fileName);
		MakeFile(f);
		printFile(f);
	}
	
	public static void MakeFile(File f){
		try {
            
            FileWriter fileWriter =
                new FileWriter(fileName);

            // Always wrap FileWriter in BufferedWriter.
            BufferedWriter bufferedWriter =
                new BufferedWriter(fileWriter);
            // Note that write() does not automatically
            // append a newline character.
            bufferedWriter.write("Java Supports Functional Style");
            bufferedWriter.newLine();
            bufferedWriter.write("Programs are decaive");
            bufferedWriter.newLine();
             bufferedWriter.write("Higher order functions.");
             bufferedWriter.close();
		
	}
		catch(IOException e) {
			System.out.println("Error printing file: " + e.getMessage());
			
		}
}
}
