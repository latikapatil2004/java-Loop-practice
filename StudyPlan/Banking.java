/*In a Banking System, how would you use constructor overloading to create different types of accounts?*/

class Bank
{
	private int Accno;
    private String accountType;

	Bank(int Accno,String name)
	{
		this.Accno=Accno;
		System.out.println("Account no : "+Accno );
		System.out.println("name : "+name );
		System.out.println("______________________");
		
	}
	Bank(int Accno,String name,int Ballance)
	{
		this.Accno=Accno;
		System.out.println("Account no : "+Accno );
		System.out.println("name : "+name );
		System.out.println("Ballance : "+Ballance );
		System.out.println("______________________");
		
	}
	Bank(int Accno,String name,int Ballance,String accountType)
	{
		this.Accno=Accno;
		this.accountType=accountType;
		System.out.println("Account no : "+Accno );
		System.out.println("name : "+name );
		System.out.println("Ballance : "+Ballance );
		System.out.println("accountType : "+accountType );
		System.out.println("______________________");
	}
}
class Banking{
	public static void main(String[]args)
	{
	Bank b=new Bank(1253,"LAtika");
	Bank b1=new Bank(1233,"latiwk",30000);
	Bank b2=new Bank(1251,"aas",2000,"SAving");

}
}