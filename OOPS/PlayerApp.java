/*Example: WAP POJO class name as Player with field id,name and run store data in Player object and retrieve data from player object.*/


class Player
{
	private int id;
	private String name;
	private int run;
	void setId(int id)
	{
		this.id = id;
	}
	int getId()
	{
		return id;
	}
	void setName(String name)
	{
		this.name=name;
	}
	String getName()
	{
		return  name;
	}
	void setRun(int run)
	{
		this.run=run;
	}
	int getRun()
	{
		return run;
	}
}
class PlayerApp
{
	public static void main(String[]args)
	{
		Player p=new Player();
		p.setId(1);
		p.setName("Latika");
		p.setRun(122);
		System.out.println("id : "+ p.getId());
		System.out.println("Name : "+ p.getName());
		System.out.println("Run : "+ p.getRun());
	}
}