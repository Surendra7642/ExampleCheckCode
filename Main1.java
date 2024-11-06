//Example for compiletime polymorphism
class Calculator
{
	void add(int x,int y)
	{
		int sum = x+y;
		System.out.println("sum of 2 numbers :"+sum);
		
	}
	int add(int x,int y,int z)
	{
		return x+y+z;
	}
}

class Main1 
{
	public static void main(String[] args) 
	{
		Calculator c = new Calculator();
		c.add(10,20);
		System.out.println(c.add(10,20,30));
	}
}
