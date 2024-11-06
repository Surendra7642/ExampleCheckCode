//POJO
class Employee
{
	private int empId;
	private String empName;
	public void setEmpId(int empId){
		this.empId = empId;
	}
	public void setEmpName(String empName){
		this.empName = empName;
	}
	public int getEmpId()
	{
		return this.empId;
	}
	public String getEmpName()
	{
		return this.empName;
	}
}

class  AccountEmployee
{
	public static void main(String[] args) 
	{
		Employee e1 = new Employee();
		e1.setEmpId(101);
		e1.setEmpName("surya");
		System.out.println("employee Id :"+e1.getEmpId());
		System.out.println("employee Name :"+e1.getEmpName());
		Employee e2 = new Employee();
		Employee e3 = new Employee();
		System.out.println(e1.hashCode());
		System.out.println(e2.hashCode());
		System.out.println(e3.hashCode());
	}
}
