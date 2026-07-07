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

    public void setQty(int qty)
    {
        this.qty = qty;
    }

    public int getQty()
    {
        return qty;
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

        System.out.println("\nCustomer Details");
        System.out.println("Name : " + cust.getName());
        System.out.println("Id : " + cust.getId());
        System.out.println("Contact : " + cust.getContact());

        System.out.println("\n==============================================================");
        System.out.println("ID\tNAME\tQTY\tPRICE\tTOTAL");
        System.out.println("==============================================================");

        for(int i = 0; i < prod.length; i++)
        {
            int total = prod[i].getQty() * prod[i].getPrice();
            grandTotal += total;

            System.out.println(
                    prod[i].getId() + "\t" +
                    prod[i].getName() + "\t" +
                    prod[i].getQty() + "\t" +
                    prod[i].getPrice() + "\t" +
                    total);
        }

        System.out.println("==============================================================");
        System.out.println("Grand Total = " + grandTotal);
    }
}

public class BillingApplication
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        Product p[] = new Product[3];

        for(int i = 0; i < p.length; i++)
        {
            p[i] = new Product();

            System.out.println("\nEnter Product Id:");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter Product Name:");
            String name = sc.nextLine();

            System.out.println("Enter Product Price:");
            int price = sc.nextInt();

            System.out.println("Enter Product Quantity:");
            int qty = sc.nextInt();
            sc.nextLine();

            p[i].setId(id);
            p[i].setName(name);
            p[i].setPrice(price);
            p[i].setQty(qty);
        }

        Customer c = new Customer();

        System.out.println("\nEnter Customer Id:");
        int cid = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Customer Name:");
        String cname = sc.nextLine();

        System.out.println("Enter Customer Contact:");
        long contact = sc.nextLong();

        c.setId(cid);
        c.setName(cname);
        c.setContact(contact);

        Shop s = new Shop();
        s.acceptOrder(p, c);
        s.generateInvoice();
    }
}