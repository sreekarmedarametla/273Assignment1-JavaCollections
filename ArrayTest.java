import static org.junit.Assert.*;

import org.junit.Test;

public class ArrayTest {

	@Test
	public void test() {
		Arrays test=new Arrays();
		System.out.println("find the missing number among first ten numbers star from 0");
		int A[]={0,1,2,3,4,9,6,7,8};
		System.out.println("missing number is "+test.findMissingNumber(A,10));
		assertEquals(5,test.findMissingNumber(A,10));
	}

}
