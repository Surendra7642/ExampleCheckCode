//Example for this and this(),super and super()
abstract class Parent
{
	String pname;
	Parent(String pname){
		this.pname = pname;
	}
	abstract void details();

}
class Child extends Parent
{
    String cname;
	Child(String pname,String cname){
		super(pname);
		this.pname = pname;
		this.cname = cname;
	}
	void details()
	{
		System.out.println("parent naem :"+ super.pname);
		System.out.println("child name :"+this.cname);
	}

}

class  Main
{
	public static void main(String[] args) 
	{
         Child c = new Child("Srinu","Surya");
		c.details();
	}
}
