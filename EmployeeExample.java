class  EmployeeExample
{

		static String company = "axios";
		static String address = "hyd";
		int empId;
		String empName;
		double empSal;
		void totalSal(double basic)
		{
			double hra = 0.2*basic;
			double ta = 0.15*basic;
			double da = 0.25*basic;
			double totalSal = basic+hra+da+ta;
			System.out.println("Total Salary :"+totalSal);
		}
	public static void main(String[] args) 
	{
		System.out.println("CompanyName :"+EmployeeExample.company);
		System.out.println(" address :"+EmployeeExample.address);
		EmployeeExample e1 = new EmployeeExample();
		System.out.println(e1.empId=101);
		System.out.println(e1.empName="surya");
		System.out.println(e1.empSal=100000.00);
		e1.totalSal(60000.00);
		EmployeeExample e2 = new EmployeeExample();
		System.out.println(e2.empId=103);
		System.out.println(e2.empName="sandeep");
		System.out.println(e2.empSal=900000.00);
		e1.totalSal(60000.00);

		

	}
}
