//example for MultipleInheritanceEx2 through classes
class A
{
	public void sort()
	{
		System.out.println("Bubble");
	}
}
class B
{
	public void sort()
	{
		System.out.println("Quick");
	}
}
class C extends A,B
{
}

class MultipleInheritanceEx2 
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.sort();
	}
}
