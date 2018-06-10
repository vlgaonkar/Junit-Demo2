import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest2 {
	
	@Test
	public void SampleTestPass()
	{
		int a = 1; 
<<<<<<< HEAD
		int b = 5;
		assertTrue(a * b == 5);/*comment by vaibhav*/
=======
		int b = 3;
		assertTrue(a * b == 3);
>>>>>>> 8235702150c7b41448981c5c8db0c0e0648af3ec
		
	}
	
	@Test
	public void SampleTestFail()
	{
		int a = 1; 
		int b = 2;
		assertTrue(b * b == 4);
	}


}
