/*Question 31: Write a Java program to implement an Electricity Bill Generator using POJO class.
Create a POJO class Electricity with variables customerId and units.
Calculate bill using slabs:
- First 100 units => Rs.5 per unit
- Next 100 units => Rs.7 per unit
- Above 200 units => Rs.10 per unit*/


class Bill
{
	private int customerId;
    private int units;
	public void setid(int customerId)
	{
		this.customerId=customerId;
	}
	int  getid()
	{
		return customerId;
	}
	public void setunit(int units)
	{
		this.units=units;
	}
	int getunit()
	{
		return units;
	}
	
    public double calculateBill()
    {
        double bill = 0;

        if(units <= 100)
        {
            bill = units * 5;
        }
        else if(units <= 200)
        {
            bill = (100 * 5) + ((units - 100) * 7);
        }
        else
        {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        return bill;
    }

	
}

class ElectricityBill
{
   public static void main(String[]args)
   {
	   Bill b=new Bill();
	   b.setid(10);
	   b.setunit(200);
	    System.out.println("Customer ID : " + b.getid());
        System.out.println("Units Consumed : " + b.getunit());
        System.out.println("Electricity Bill : Rs." + b.calculateBill());
   }   
}
