import java.util.*;
public class FPAPP
{ 
   public static void main(String x[])
{ 
        Scanner xyz = new Scanner(System.in);
          int a[]=new int[5];
        System.out.println("Enter values in array");
           for(int i=0; i<a.length;i++)
        { 
           a[i]=xyz.nextInt();
        }
         System.out.println("Display array values");
           for(int i=0; i<a.length;i++)
         { 
              System.out.printf("%d\t",a[i]);
            }
            //find pair logic
             boolean flag=false;
           for(int i=0; i<a.length; i++)
           { 
            for(int j=(i+1); j<a.length; j++)
              {
            if((a[i]==a[j]))
              {  
          flag=true;
         System.out.printf("(%d,%d)",a[i],a[j]);
           break;
            }
        }
    }
         if(flag)
{ System.out.println("\nDuplicate found");
}
else{
System.out.println("No duplicates");
}
}