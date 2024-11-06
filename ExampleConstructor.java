class ExampleConstructor 
{
	int a;
	String name;
	ExampleConstructor(int a,String name)
	{
		System.out.println("object got created");
	}
	public static void main(String[] args) 
	{
		ExampleConstructor ex = new ExampleConstructor(10,"Surya");
		System.out.println(ex.hashCode());
	}
}
