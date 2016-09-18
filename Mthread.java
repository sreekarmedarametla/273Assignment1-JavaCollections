
public class Mthread {
	private int sum;
	
	public int getSum()
	{
	
		return sum;
	}
    public void setSum(int sumvalue)
    {
    	 sum =sumvalue;
    }
}

class Summation implements Runnable{
	
	private Mthread sumobject;
	private int upper;
	
	Summation(int value, Mthread sumvalue)
	{
		this.upper=value;
		this.sumobject=sumvalue;
		
	}
	
	public void run()
	{
		int sum=0;
		for(int i=0;i<upper;i++)
		{
			sum=sum+i;
		}
	
		sumobject.setSum(sum);
	}
	
}




