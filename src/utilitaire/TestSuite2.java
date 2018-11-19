package utilitaire;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;

import junit.framework.TestResult;
import junit.framework.TestSuite;

//JUnit Suite Test
//@RunWith(Suite.class)

//@Suite.SuiteClasses({ 
//   operationTest.class ,PersonneTest.class
//})

public class TestSuite2 {
	
	 public static void main(String[] a) {
	      // add the test's in the suite
	      TestSuite suite = new TestSuite(operationTest.class, PersonneTest.class, EmpBusinessLogic.class);
	      TestResult result = new TestResult();
	      suite.run(result);
	      System.out.println("Number of test cases = " + result.runCount());
	   }

}
