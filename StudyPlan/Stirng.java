public class Player {
	private int id;
	private String name;
	private String adress;
	public void setId(int id)
	{
		this.id=id;
	}
	public int getId()
	{
		return id;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	public String  getName()
	{
		return name;
	}
	public void setAdress(String adress)
	{
		this.adress=adress;
	}
	public String  getadress()
	{
		return adress;
	}
	
}
class Stirng
{
    public static void main(String[]args)
	{
		Player p[]=new Player[3];
		for(int i=0;i<p.length;i++)
		{
			p[i]=new Player();
		
		p[i].setId(1);
		p[i].setName("latuak");
		p[i].setAdress("Pimp");
		for( i=0;i<p.length;i++)
		{
		System.out.println(p[i].getId()+ "/t" + p[i].getName()+"\t" +p[i].getadress());
	}
		}
	}
}

       