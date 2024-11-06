public class ExampleCheck
{
	ExampleCheck()
	{
		System.out.println("Zero args constructor");
	}
	ExampleCheck(int x)
	{
		this();
		System.out.println("Args constructor");
	}
	ExampleCheck(int x,int y)
	{
		this(10);
		System.out.println("second args constructor");
	}
	public static void main(String args[]){
		ExampleCheck ec1 = new ExampleCheck(10,20);
		
		
		
	}

}
