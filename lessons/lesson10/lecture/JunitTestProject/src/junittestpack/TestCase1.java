package lesson10.lecture.JunitTestProject.src.junittestpack;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.List;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestCase1 {

	/* The first type, @BeforeClass, is run once before anything else, 
	 * and the results will be shared by all the tests. 
	 * This is helpful for timely processes like logging into a database.*/
	@BeforeClass 
	public static void setUpBeforeClass() throws Exception {
		System.out.println("setUpBeforeClass()");
	}
	
	/* @Before, runs once before each test, so multiple times in a series of tests.*/
	@Before
	public void setUp() throws Exception {
		System.out.println("setUp()");
	}

	/* Annotating computationally expensive processes as @Before will slow your overall testing down. 
	 * The tear‐down methods actually function similarly to the finally block of a try‐catch‐finally statement. 
	 * If you allocate resources using a @Before method, you will need to release them using an @After method. 
	 * If you allocate resources using a @BeforeClass method, you need to release them using an @AfterClass method. Just as the @
		BeforeClass runs once before everything else starts, @AfterClass runs exactly once after everything
		else finishes. Similarly, @After methods will run after each test. These @After and @AfterClass
		methods will run even if there is an exception thrown, just like the finally block.*/
	
	@After
	public void tearDown() throws Exception {
		System.out.println("tearDown()");
	}
	

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.println("tearDownAfterClass()");
	}
	
	
	FunctionClass fc = new FunctionClass();
	@Test
	public void test() { 
		
		System.out.println("Testcase 1");
		    List<String> input = Arrays.asList("aa", "bb", "hello");
		    List<String> result = fc.allToUpperCase(input);
		    assertEquals(Arrays.asList("AA", "BB", "HELLO"), result);
		
	}
	@Test
	public void test1(){ // Testing with the complex behavior
		System.out.println("Testcase 1");
		String input = "ab";
	    String result = fc.firstToUppercase(input);
	    assertEquals("Ab", result);
	}

}
