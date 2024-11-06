//conditional Statements
//Give the student grade only if the student passed in all subjects
import java.util.Scanner;
class CondEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter m1,m2 and m3 marks :");
		int m1 = sc.nextInt();
		int m2= sc.nextInt();
		int m3= sc.nextInt();
		
		if(m1>=40 && m2>=40 && m3>=40)
		{
			int total = m1+m2+m3;
			int avg = total/3;
			if(avg>=60)
			{
				System.out.println("A grade");
			}
			else if (avg>=50)
			{
				System.out.println("B grade");
			}
			else
			{
				System.out.println("C grade");
			}
			
		}
		else
		{
			System.out.println("Student failed");
		}
		
	}

}
