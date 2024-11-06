import java.util.*;
class ExceptionHandllingEx 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers :");
		try{
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a/b;
		System.out.println("sum :"+c);
		}
		catch(Exception e)
		{
			System.out.println("Error Occured");
		}
		finally
		{
			System.out.println("thank and visit again");
		}

	}
}
//java.util.InputMismatchException
//java.lang.ArithmeticException: / by zero