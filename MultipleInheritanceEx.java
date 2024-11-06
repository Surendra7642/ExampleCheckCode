//Multiple Inheritance Example 
interface A
{
  public abstract void sort();

}
interface B 
{
	public abstract void sort2();
	
}
class C implements A , B
{
	public void sort()
	{
		
		System.out.println("bubble");
	}
	public void sort2()
	{
		System.out.println("quick");
		
	}
	
}

class  MultipleInheritanceEx
{
	public static void main(String[] args) 
	{
		C c1 = new C();
		c1.sort();
		c1.sort2();
	}
}
