
public class Stacks{
	int top=0;
	int cap;
	char A[];
	int size=0;
	char R[];
	
	Stacks(int s )
	{
		cap=s;
		this.A=new char[cap];
		top=-1;		
	}
	public boolean isFull()
	{
		return(cap==size);
	}
	public boolean isEmpty()
	{
		return (size==0);
	}
	public void push(char val)
	{
		if(!isFull())
		{
			size++;
			A[++top]=val;
			
		}
		
	}
	public char pop()
	{
		
		size--;
		char result=A[top];
		
		top--;
		return result;
		
	}
	
	public char seekTop()
	{
		return A[top];
	}	
	public void print()
	{
		for (int i=0;i<size;i++) 
		{
			System.out.print(A[i]);  
		}
	}
	
	public void pushstring(String str)
	{
		
		for(int i=0;i<str.length();i++)
		{
			push(str.charAt(i));
		}
				
	}
	
	
	public String reverseString()
	{
		R=new char[size];
		for(int i=0;i<R.length;i++)
		{
			R[i]=pop();
			
		}
		
		String reverse1=String.valueOf(R);
		return reverse1;
		
		
	}
	
	

	
public static void main(String[] args) {

	Stacks  s= new Stacks(7);
    s.pushstring("apple is");
    s.print(); 
    System.out.println();
    System.out.println("reverse string is ");
    System.out.println(s.reverseString());
    
}
}
