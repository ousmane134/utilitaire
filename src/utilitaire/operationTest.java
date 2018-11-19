package utilitaire;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class operationTest {
	
	int a,b;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		
		System.out.println("======DEBUT DES TESTS=====");
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
		System.out.print("======FIN DES TESTS=====");
	}

	@Before
	public void setUp() throws Exception {
		a = 1;
		b = 3;
		operation op = new operation(a,b);
	}

	@After
	public void tearDown() throws Exception {
	}

	
	
	
	@Test
	public void testSomme() {
		operation op = new operation(a,b);
		int result = op.somme(a, b);
		assertEquals(result, 4);
		
	}
	
	@Test
	public void testSoustraction() {
		operation op = new operation(a,b);
		int result = op.soustraction(a, b);
		assertEquals(result, -2);
		
	}
	
	@Test
	public void testModulo() {
		operation op = new operation(a,b);
		int result = op.modulo(a,b);
		assertEquals(result, 1);
		
	}
	
	@Test
	public void testMultiplication() {
		
		operation op = new operation(a,b);
		int result = op.multiplication(a,b);
;
		assertEquals(result, 3);
		
	}

}
