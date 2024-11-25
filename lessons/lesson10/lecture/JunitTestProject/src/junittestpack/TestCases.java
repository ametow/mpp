package lesson10.lecture.JunitTestProject.src.junittestpack;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestCases {
	FunctionClass fc = new FunctionClass();
	@Test   // @Test, annotates each test	method.
	public void test() {
		
		int oo = fc.add(10, 20);
		int ep=30;
		assertEquals(oo,ep);
	}
	
	@Test
	public void test1() {
		
		String oo = fc.StringJoin("Java", "Programming"); 
		String ep = "JavaProgramming";
		assertEquals(oo,ep);
	}

}
