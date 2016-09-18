
public class ArraysPractise {
	public int[]  findCommon(int array1[],int array2[])
	{
		int length1=array1.length;
		int length2=array2.length;
		int array3[];
		
		int count=0;
		
		if(length1<length2)
		{
			array3=new int[length1];
			int temp=0;
			for(int i=0;i<length1;i++)
			{
			  for(int j=0;j<length2;j++)
			   {
				  if(array1[i]==array2[j])
				  {
					  count++;
					  array3[temp++]=array1[i];
					  
				   }
			    }
			 }		
		}
		else
			
		{
			array3=new int[length2];
			int temp=0;
			for(int i=0;i<length2;i++)
			{
			  for(int j=0;j<length1;j++)
			  {
				  if(array2[i]==array1[j])
				  {
					  count++;
					  array3[temp++]=array2[i];
				  }
			  }
			}
			
			
		}
		int newarray3[]=new int[count];
		System.arraycopy(array3, 0, newarray3, 0, count);
		array3 = newarray3;
		
		System.out.println("number of common values are "+count);
		for(int i=0;i<count;i++)
		{
			System.out.print(array3[i]+" ");
		}  	
		
		return array3;
		
	}
	public static void main(String[] args) {

		
		ArraysPractise a=new ArraysPractise();
		int array1[]={2,6,8,10,16,22,44,66,89};
		int array2[]= {3,9,6,8,12,66,10};
	    a.findCommon(array1,array2);	
	}

}
