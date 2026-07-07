import java.util.Scanner;
class Value{
	int a,b;
	void setValue(int x,int y)
	{
		a=x;
		b=y;
	}
	int getResult()
	{
		return 0;
	}
	
}
class Add extends Value{
	int getResult()
	{
		return a+b;
	}
}
class Mul extends Value{
	int getResult()
	{
		return a*b;
	}
}
class Div extends Value{
	int  getResult()
	{
		return a/b;
	}
}

class Dynamicpoly
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Value v=null;
		System.out.println("Enter your choice");
		int choice;
		do{
	  System.out.println("1:Addition");
	  System.out.println("2:Multiplication");
	  System.out.println("3:Division");
	  System.out.println("4:Substraction");
	  choice=sc.nextInt();
	  
	  System.out.println("Enter two values");
	  int a=sc.nextInt();
	  int b=sc.nextInt();
		switch(choice)
		{
			case 1:
			
				v=new Add();
				v.setValue(a,b);
				System.out.println("Addition is : "+v.getResult());
				break;
			
			case 2:
			
				v=new Mul();
				v.setValue(a,b);
				System.out.println("Multiplication is : "+v.getResult());
				break;
			
			case 3:
			
				v=new Div();
				v.setValue(a,b);
				System.out.println("Division is : "+v.getResult());
				break;
			
			default:
			
				System.out.println("invalid choice");
			
		}
		
			
		
		}
		while(choice!=3);
		
		
	}
}