import static org.junit.Assert.*;

import org.junit.Test;

public class ArraysTest {

	@Test
	public void test() {
		ArraysPractise test = new ArraysPractise();
		int array1[]={2,6,8,10,16,22,44,66,89};
		int array2[]={3,9,6,8,12,66,10};
		
		
        assertArrayEquals(new int[]{6,8,66,10},test.findCommon(array1,array2));		
		
		 
	}

}