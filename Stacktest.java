import static org.junit.Assert.*;

import org.junit.Test;

public class Stacktest {

	@Test
	public void test() {
		Stacks test=new Stacks(7);
		test.pushstring("appleis");
     	String res=test.reverseString();
		assertEquals("sielppa",res);
	}

}