class InvalidAgeException extends Exception
{
	InvalidAgeException(String name)
	{
		super(name);
	}
}

public class PersonVote
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
