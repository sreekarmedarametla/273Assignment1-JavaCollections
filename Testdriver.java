
public class Testdriver {
	public static void main(String[] args) {
		Mthread sumObject=new Mthread();
		int upper=10;
		Thread thread=new Thread(new Summation(upper,sumObject));
		thread.start();
		try 
		{ 
		  thread.join();
		  System.out.println("The sum of "+upper+" is "+sumObject.getSum());
		} 
		catch (InterruptedException ie) {
			System.out.println("error is "+ ie);
			
		}
		}
		
    	
	}


