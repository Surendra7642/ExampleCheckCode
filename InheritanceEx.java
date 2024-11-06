//Example for upcasting
class Parent
{
	void fun()
	{
		System.out.println("parent functionality()");
	}
}
class Child extends Parent
{
	void fun()
	{
		System.out.println("child functionality()");
	}


}

class InheritanceEx 
{
	public static void main(String[] args) 
	{
		//upcasting
		Parent  addr = new Child();
		addr.fun();
		
		//regular object creation
		Child c = new Child();
		c.fun();
	

	}
}
