/*	In an Employee Management System, why would you create multiple constructors for the Employee class?*/


class Employee
{
	
    private String OrganisationName;

	Employee(String OrganisationName,int Eid)
	{
		this.OrganisationName=OrganisationName;
		System.out.println(" OrganisationName : "+OrganisationName );
		System.out.println(" Employee id: "+Eid );
		System.out.println("______________________");
		
	}
	Employee( String OrganisationName,int Eid,String Ename)
	{
		
		this.OrganisationName=OrganisationName;
		System.out.println(" OrganisationName : "+OrganisationName );
		System.out.println(" Employee id: "+Eid );
		System.out.println(" Employee name: "+Ename );
		System.out.println("______________________");
		
	}
	Employee( String OrganisationName,int Eid,String Ename,double salary)
	{
		
		this.OrganisationName=OrganisationName;
		System.out.println(" OrganisationName : "+OrganisationName );
		System.out.println(" Employee id: "+Eid );
		System.out.println(" Employee name: "+Ename );
		System.out.println("emplayee salary: "+salary);
		System.out.println("______________________");
	}
}
class EmployeeScenario{
	public static void main(String[]args)
	{
	Employee b=new Employee("TCS",1253);
	Employee b1=new Employee("TCS",1253,"vivek");
	Employee b2=new Employee("TCS",1253,"vivek",122344.0);

}
}