
public class Queues {
	int front=0;
	int rear=-1;
	char A[];
	char R[];
	int size=0;
    int cap;
    Queues(int s)
    {
    	cap=s;
    	A=new char[cap];	
    }
	 public void enqueue(char val)
    {
    	size++;
    	A[++rear]=val;
    }
			
    public char dequeue()
    {
    	char value=A[0];
    	for(int i=0;i<size;i++)
    	{
    		A[i]=A[i+1];
    		
    	}
    	size=size-1;
    	
    	
    	return value;
    	
    	
    }
    
    public void print()
    {
     for(int i=0;i<size;i++)
      {
    	System.out.print(A[i]);
    	
       }
    }
    public void pushString(String str)
    {
    	for(int i=0;i<str.length();i++)
    	{
    		enqueue(str.charAt(i));
    	}	
    }
    public String checkPalindrome()
    {
    	R=new char[size];
    	
    	for(int i=0;i<R.length;i++)
    	{
    		R[i]=dequeue();
    	}
    	String value=String.valueOf(R);
    	return value;
    	
    	
    }
    
	
	public static void main(String[] args) {
		
		Queues q= new Queues(7);
		q.pushString("madam");	
		q.print();
		System.out.println();
		System.out.println("reverse palindrome string is "+q.checkPalindrome());
		q.print();
		
	}

}
