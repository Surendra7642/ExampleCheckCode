//Program to print 1 to 10
import java.util.Scanner;
class  LoopEx
{
	public static void main(String[] args) 
	{
	   Scanner sc = new Scanner(System.in);
	   System.out.println("Enter  character(r,g,b):");
	   char ch = sc.next().charAt(0);
	   switch(ch)
		{
			case 'r': System.out.println("Red");
			          break;
		    case 'g': System.out.println("Green");
			          break;
		    case 'b': System.out.println("Blue");
			          break;
			default: System.out.println("wierd");
		}
	}
}
