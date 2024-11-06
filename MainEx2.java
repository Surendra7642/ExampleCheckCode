//interface Ex
interface First
{
     void m1();
     void m2();
}
class Second implements First
{ 
	public void m1()
	{
		System.out.println("m1() method...");
	}
	public void m2()
	{
		System.out.println("m2() method...");
	}

}
class MainEx2
{
	public static void main(String[] args) 
	{
		First s = new Second();
		s.m1();
		s.m2();
	}
}