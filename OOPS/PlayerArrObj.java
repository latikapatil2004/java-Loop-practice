/*
Example: WAP to create class name as Player with field id,
name and run and we have create 5 objects of player and 
sort player data by using id of player*/
import java.util.Scanner;
class Player{
	int id;
	String name;
	int run;
	public void setid(int id)
	{
		this.id=id;
	}
	public int getid()
	{
		return id ;
	}
	public void setname(String name)
	{
		this.name=name;
	}
	public String getname()
	{
		return name;
	}
	public void setrun(int run)
	{
		this.run=run;
	}
	public int getrun()
	{
		return run ;
	}
	
}
class PlayerArrObj
{
	public static void main(String[]args)
	{
		Scanner sc=new Scanner(System.in);
		Player p[]=new Player[5];
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Player();
			
			System.out.println("enter the player id");
			int id=sc.nextInt();
			sc.nextLine();
			
			System.out.println("enter the player name");
			String name=sc.nextLine();
			
			 
			
			System.out.println("enter the player run");
			int run=sc.nextInt();
			p[i].setid(id);
			p[i].setname(name);
			p[i].setrun(run);
			
		}
		System.out.println("display all employee data");
			for(int i=0;i<p.length;i++)
			{
				System.out.println("id=>"+p[i].getid()+"\t"+"name=>"+p[i].getname()+"\t"+"run=>"+p[i].getrun());
			}
			//sorting logics 
		for(int i=0;i<p.length; i++)
		{
			 for(int j=(i+1); j<p.length; j++)
			 {
				  if(p[i].getid()>p[j].getid())
				  {
					  Player temp=p[i];
					  p[i]=p[j];
					  p[j]=temp;
				  }
			 }
		}
	    System.out.println("display the all player after sorting");
		for(int i=0; i<p.length; i++)
		{ 
		   System.out.println(p[i].getid()+"\t"+p[i].getname()+"\t"+p[i].getrun());
		}
	}
}

			
			
