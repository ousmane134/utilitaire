/**
 * 
 */
package utilitaire;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 * @author ousmanecisse
 *
 */
public class PersonneTest {

	/**
	 * @throws java.lang.Exception
	 */
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	
	
	@Test
	public void testOperation() {
		Personne personne1 = new Personne(23, "CISSE", "OUSMANE", 'M');
		Personne personne2 = new Personne(38, "CISSE", "MADORE", 'F');
		
		assertEquals(personne1.getM_nom(), "CISSE");
		assertEquals(personne1.getM_age(), 23);
		assertEquals(personne1.getM_sexe(), 'M');
		assertEquals(Personne.getNombre(), 2);
		assertEquals(Personne.getNombre_homme(), 1);
		assertEquals(Personne.getNombre_femme(), 1);
		assertEquals(Personne.getNombre(), Personne.getNombre_femme()+Personne.getNombre_femme()+Personne.getNombre_ni_femme_ni_femme());
		
	}

}
