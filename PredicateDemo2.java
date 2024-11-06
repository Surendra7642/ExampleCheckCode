import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate; 

//print emp names who are working in hyd location in db team
class Employee
{
	String name;
	String location;
	String dept;
	Employee(String name,String location,String dept)
	{
		this.name=name;
		this.location=location;
		this.dept=dept;
		
	}
}

public class PredicateDemo2 {
	public static void main(String[] args) {
		Employee e1 = new Employee("surya","chennai","Develop");
		Employee e2 = new Employee("kareem","pune","Testing");
		Employee e3 = new Employee("abbas","hyd","Devops");
		Employee e4 = new Employee("vamsi","hyd","DB");
		List<Employee> emps = Arrays.asList(e1,e2,e3,e4);
		Predicate<Employee> p1 = e -> e.location.equals("hyd");
		Predicate<Employee> p2 = e -> e.dept.equals("DB");
		//predicate joining
		Predicate<Employee> p = p1.and(p2);
		for(Employee e: emps)
		{
			if(p.test(e))
			{
				System.out.println(e.name);
			}
		}
	}

}
