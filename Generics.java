
public class Generics {
	
	public static < E > void  printarray(E[] inputarray)
	{
		for(E element:inputarray)
		{
			System.out.printf("%s",element); 
			
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		
		Integer[] intarray={1,2,3,4,5};
		Double[] doublearray={1.1,2.2,3.3};
		String[] stringarray={"apple "," orange "," mango","  pineapple"};
		System.out.println("passing integers");
		printarray(intarray);
		System.out.println("passing double values");
		printarray(doublearray);
		System.out.println("passing string values");
		printarray(stringarray);
		
		
		
	}

}
