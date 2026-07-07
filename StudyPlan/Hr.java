/*Suppose consider we want to design HR recruitment or hiring application for consultancy or for company we have following types of hiring categories 

Fresher 
Experience 
FreeLancer 
*/


class Hiring
{
	 void Hire(String name,String clgname,float per,String skills)
	{
		System.out.println("Freshers data ");
		System.out.println("name"+ name);
		System.out.println("clgname"+ clgname);
		System.out.println("per"+ per);
		System.out.println("name"+ skills);
		System.out.println("__________________________");
	}
	 void Hire(String name,String expsaary,String prvCompany,int exp,String Noticeperiod)
	{
		System.out.println("Experience data ");
		System.out.println("name"+ name);
		System.out.println("expsaary"+expsaary );
		System.out.println("prvCompany"+ prvCompany);
		System.out.println("Noticeperiod"+ Noticeperiod);
		System.out.println("exp"+ exp);
		System.out.println("__________________________");
	}
	 void Hire(String name,String startdate,String enddate)
	{
		System.out.println("freelancer data ");
		System.out.println("name"+ name);
		System.out.println("startdate"+ startdate);
		System.out.println("enddate"+ enddate);
		System.out.println("__________________________");
	}
}

class Hr
{
	public static void main(String[]args)
	{
	Hire("Latika","SSVPs",89f,"java");
	Hire("Sai","8LPA","MIcrosoft",5,"15Days");
	Hire("vaivbhA","12/3/2025","2/5/2025");
		
	}
}
