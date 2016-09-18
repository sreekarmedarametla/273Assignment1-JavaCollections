import static org.junit.Assert.*;

import org.junit.Test;

public class Queuetest {

	@Test
	public void test() {
		Queues test=new Queues(7);
		test.pushString("MADAM");
		String palindrome=test.checkPalindrome();
		assertEquals("MADAM",palindrome);
	}
 
}
