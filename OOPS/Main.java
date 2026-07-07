
class Employee
{  private String name;
   private int id;
   private int sal;
   private String address;
   private String qual;
   
   public void setId(int id)
   { this.id=id;
   }
   public int getId(){
	    return id;
   }
   public void setName(String name)
   { this.name=name;
   }
   public String getName()
   { return name;
   }
   public void setSal(int sal)
   { this.sal=sal;
   }
   public int getSal()
   { return sal;
   }
   public void setQual(String qual)
   { this.qual=qual;
   }
   public String getQual()
   { return qual;
   }
   public void setAddress(String address)
   { this.address=address;
   }
   public String getAddress()
   { return address;
   }
}
class Company
{   private Employee emp;
   void addNewEmployee(Employee emp)
   {
        this.emp=emp;
   }
   void showEmployeeDetail(){
     int empid=emp.getId();
	 String empname=emp.getName();
	  int sal=emp.getSal();
	  String address=emp.getAddress();
	  String qual=emp.getQual();
	 System.out.println(empid+"\t"+empname+"\t"+sal+"\t"+address+"\t"+qual);
   }
}
public class CompanyApplication
{    public static void main(String x[])
	{   Company c=new Company();
		Employee e = new Employee();
		  e.setId(1);
		  e.setName("RAM");
		  e.setSal(10000);
		  e.setQual("BTECH");
		  e.setAddress("PUNE");
		c.addNewEmployee(e);
		c.showEmployeeDetail();
	}
}
