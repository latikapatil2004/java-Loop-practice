 /*8️⃣ Login System 🔐 (Real-life logic)

👉 Input:

username
password

👉 Conditions:

सही है → "Login Successful"
गलत password → "Wrong Password"
गलत username → "User Not Found*/
    import java.util.*;
	 class LoginApp
	 {
	   public static void main(String[]args)
	   {
	    Scanner sc=new Scanner(System.in);
		System.out.println("enter the name");
		String name=sc.nextLine();
		System.out.println("enter the password");
		String password=sc.nextLine();
		if(name.equals("Latika"))
		{
		
		if(password.equals("123"))
		{
		System.out.println("Loin sucssesful");
		}
	 else 
	    { 
		System.out.println("Wrong password");
		}
	 }
		else{
		System.out.println("user Not found");
	}
	 
  }
}