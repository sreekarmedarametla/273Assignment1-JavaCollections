import static org.junit.Assert.*;

import org.junit.Test;

public class Threadtest {

	@Test
	public void test() {
		
		Mthread sumObject=new Mthread();
		int upper=10;
		Thread thread=new Thread(new Summation(upper,sumObject));
		thread.start();
		int expected=45;
		try 
		{ 
		  thread.join();
		  System.out.println("The sum of "+upper+" is "+sumObject.getSum());
		} 
		catch (InterruptedException ie) {
			System.out.println("error is "+ ie);
			
		}
				
		assertEquals(expected,sumObject.getSum());
	}
		
		      
		
		
	}


