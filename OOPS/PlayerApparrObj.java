/*WAP to create class name as Player with field id,name and run and we have create 5 objects of player and sort player data by using id of player 

*/

import java.util.Scanner;
 class Player
{
	private int id;
	private String name;
	private int run;
	public void setId(int id)
	{
		this.id=id;
	}
		public int getId()
	{
		return id;
	}
	public void setname(String name)
	{
		this.id=id;
	}
		public String getname()
	{
		return  name;
	}
	public void setrun(int run)
	{
		this.run=run;
	}
		public int getrun()
	{
		return run;
	}
	
	
}


class PlayerApparrObj
{
	public static void main(Stirng[]args)
	{
		Scanner sc=new Scanner(System.in);
		Player p[]=new Player[5];    //array of refrence
		for(int i=0;i<p.length;i++)
		{
			Sytem.out.println("enter player data id name run  ");
			int id=sc.nextInt();
			String name=sc.nextLine();
			int run=sc.nextInt();
			player[i]=new player();   // array of objects
			p.setId(id);
			p.setname(name);
			p.setrun(run);
			
		}
		System.out.println("display the all player before sorting");
		for(int i=0;i<p.length;i++)
		{
			System.out.println(" "+ p.getId() + " " + p.getname()+ " "+ p.getrun());
		}
		System.out.println("display the all player after sorting");
		for(int i=0;i<p.length;i++)
		{
			for(int j=i+1;j<p.length;j++)
			{
				if(p[i].getId()>p[j].getId())
				{
					int temp=p[i];
					p[i]=p[j];
					p[j]=temp;
				}
			}
		}
		System.out.println("display the all player after sorting");
		for(int i=0;i<p.length;i++)
		{
			 System.out.println(p[i].getId()+"\t"+p[i].getName()+"\t"+p[i].getRun());

		}
	}
	
}