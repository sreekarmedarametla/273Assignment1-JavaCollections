import java.util.*;
public class HashValue {
	
	public boolean checkElement(int []array)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		int i;
		for(i=0;i<array.length;i++)
		{
			if(set.contains(array[i]))
			{
				System.out.println("repeated");
			    return true;
			}
			set.add(array[i]);
			if(i>=2)
			{
				set.remove(array[i-2]);
			}
			
		}
		if(i==array.length)
		{
			System.out.println("not repeated");
		}
		return false;		
	}

	
	public static void main(String[] args) 
	{
		
		  int []array={4,6,10,9,15,17,15};
		  HashValue h= new HashValue();
		  h.checkElement(array);
		  
		  
	}
}	
