class SingletonEx 
{
	//R1
	private static final SingletonEx obj = new SingletonEx();
	//R2
	private SingletonEx()
	{
		
	}
	//R3
	public static SingletonEx printSingleton()
	{
		return obj;
	}

	public static void main(String[] args) 
	{
		SingletonEx s1 = SingletonEx.printSingleton();
		SingletonEx s2 = SingletonEx.printSingleton();
		SingletonEx s3 = SingletonEx.printSingleton();
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(s3.hashCode());
	}
}
