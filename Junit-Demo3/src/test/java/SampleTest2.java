import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class SampleTest2 {
	
	@Test
	public void SampleTestPass()
	{
		int a = 1; 
		int b = 3;
		assertTrue(a + b == 4);
		
	}
	
	@Test
	public void SampleTestFail()
	{
		int a = 1; 
		int b = 2;
		assertTrue(b * b == 4);
	}


}
