/*Example:  Billing Application using Array of objects concept 
Objective : The objective of this assignments is to generate the invoice for customer like as 
*/

import java.util.*;

class Product
{
    private int id;
    private String name;
    private int price;
    private int qty;

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public int getQty()
    {
        return qty;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getPrice()
    {
        return price;
    }
}

class Customer
{
    private int id;
    private String name;
    private long contact;

    public void setId(int id)
    {
        this.id = id;
    }

    public int getId()
    {
        return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public void setContact(long contact)
    {
        this.contact = contact;
    }

    public long getContact()
    {
        return contact;
    }
}

class Shop
{
    Product prod[];
    Customer cust;

    void acceptOrder(Product prod[], Customer cust)
    {
        this.prod = prod;
        this.cust = cust;
    }

    void generateInvoice()
    {
        int grandTotal = 0;

        System.out.println(
            "Cust Name : " + cust.getName() +
            "\tCust Id : " + cust.getId() +
            "\tCust Contact : " + cust.getContact()
        );

        System.out.println("=======================================================================");
        System.out.println("\nID\tNAME\tQuantity\tPrice\tTotal\n");

        for(int i = 0; i < prod.length; i++)
        {
            grandTotal = grandTotal +
                        (prod[i].getQty() * prod[i].getPrice());

            System.out.println(
                prod[i].getId() + "\t" +
                prod[i].getName() + "\t" +
                prod[i].getQty() + "\t\t" +
                prod[i].getPrice() + "\t\t" +
                (prod[i].getQty() * prod[i].getPrice())
            );
        }

        System.out.println("======================================================================");
        System.out.println("\t\t\t\tGrand Total is " + grandTotal);
    }
}

public class BillingArrobj
{
    public static void main(String x[])
    {
        Scanner xyz = new Scanner(System.in);

        Shop s = new Shop();

        Product p[] = new Product[3];

        for(int i = 0; i < p.length; i++)
        {
            System.out.println("Enter name, id, price and quantity of product");

            String name = xyz.nextLine();
            int id = xyz.nextInt();
            int price = xyz.nextInt();
            int qty = xyz.nextInt();

            p[i] = new Product();

            p[i].setName(name);
            p[i].setId(id);
            p[i].setPrice(price);
            p[i].setQty(qty);

            xyz.nextLine();
        }

        Customer c = new Customer();

        System.out.println("Enter name, id and contact of customer");

        String custname = xyz.nextLine();
        int id = xyz.nextInt();
        long contact = xyz.nextLong();

        c.setName(custname);
        c.setId(id);
        c.setContact(contact);

        s.acceptOrder(p, c);
        s.generateInvoice();
    }
}


		