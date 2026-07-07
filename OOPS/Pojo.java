/*Example: WAP POJO class name as Player with field id,name and run store data in Player object and retrieve data from player object.
*/

class Player
{
  private int id;
  private String name;
  private int run;
  void setid(int id)
  {
	  this.id=id;
  }
  int getid()
  {
	  return id;
  }
   void setname(String name)
   {
	   this.name=name;
   }
   String getname()
   {
	   return name;
   }
   void setrun(int run)
   {
	   this.run=run;
   }
    int getrun()
  {
	  return run;
  }
  
}
class Pojo
{
	public static void main(String[]args)
	{
		Player p=new Player();
		p.setid(1);
		p.setname("Vaibhav");
		p.setrun(100);
		System.out.println(" "+ p.getid() + " " + p.getname() + " " + p.getrun());
	}
}
