import java.util.Scanner;
class InvalidAgeException extends Exception
{
	InvalidAgeException(String name)
	{
		super(name);
	}
}
class PersonVote1
{
	static void canVote(int age) throws InvalidAgeException {
		if(age>=18)
		{
			System.out.println("can vote");
		}
		else
		{
			InvalidAgeException obj = new InvalidAgeException("Invalid age");
			throw obj;
		}
	}
}
class MainEx3 
{
	public static void main(String[] args) 
	{
		System.out.println("Enter age");
		Scanner sc = new Scanner(System.in);
		int age = sc.nextInt();
		try{
			PersonVote1.canVote(age);
		}
		catch(InvalidAgeException e)
		{
			System.out.println("Exception :"+e.getMessage());
		}
	}
}


