
public class Arrays {
	
	public int findMissingNumber(int []A,int numbers)
	{
		int actualSum=0;
		int givenSum=0;
		for(int i=0;i<10;i++)
		{
			actualSum=actualSum+i;
		}
		for(int i=0;i<A.length;i++)
		{
			givenSum=givenSum+A[i];
		}
		
		int missing=actualSum-givenSum;
		return missing;
		
	}

	public static void main(String[] args) {
		
		Arrays a=new Arrays();
		int A[]={0,1,2,3,4,9,6,7,8};
		int numbers=10;
		System.out.println("find the missing number among first ten numbers star from 0");
		
		System.out.println();
		System.out.println("missing number is "+a.findMissingNumber(A,numbers));	
	}
	
}
