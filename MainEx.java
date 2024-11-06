//interface Ex
public interface First
{
    void m1();
	void m2();
}
class Second implements First
{ 
	void m1()
	{
		System.out.println("m1() method...");
	}
	void m2()
	{
		System.out.println("m2() method...");
	}

}

class MainEx 
{
	public static void main(String[] args) 
	{
		Second s = new Second();
		s.m1();
		s.m2();
	}
}
