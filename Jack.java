
public class Jack implements Student{
	int marks[]={85,88,97,89};
	int totalMarks=0;
	
	public void totalMarks()
	{
		for(int i=0;i<marks.length;i++)
		{
			totalMarks=totalMarks+marks[i];
		}
		
		System.out.println("the total marks are "+totalMarks); 	
	}
	public void calculateGpa()
	{
		int average=totalMarks/marks.length;
		if(average>=95&&average<=100)
		{
			System.out.println("grade is A+");

		}
		else if(average>=90&&average<95)
		{
			System.out.println("grade is A");

		}
		else if(average>=85&&average<90)
		{
			System.out.println("grade is A-");

		}
		else if(average>=80&&average<85)
		{
			System.out.println("grade is B+");

		}
		else
		{
			System.out.println("grade is below B");
		}	
	}
	
	public static void main(String[] args) {
		Jack j=new Jack();
		j.totalMarks();
		j.calculateGpa();
		
		
		
	}
	
	
	

}
