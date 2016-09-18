import static org.junit.Assert.*;

import org.junit.Test;

public class Hashtest {

	@Test
	public void test() {
		HashValue test= new HashValue();
		int []array={12,14,16,18,22,44,55,44};
		System.out.println("to check if after any element the same element is repated after two positions");	
		assertTrue(test.checkElement(array));
	}

}
