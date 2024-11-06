//Example for Single level inheritance
class Employee
{
	void doWork()
	{
		System.out.println("Employee do work");
	}
}
class Manager extends Employee
{
	void monitorWork()
	{
		System.out.println("Manager do work as well as monitor the other works ");
	}
}
class  CompanyEx
{
	public static void main(String[] args) 
	{
		Manager m = new Manager();
		m.doWork();
		m.monitorWork();
		
	}
}
