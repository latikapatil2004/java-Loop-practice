import java.util.*;

class looping
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n = sc.nextInt();
		int count=1;
        for(int i = 2; count<=n; i++)
        {
            boolean flag = true;

            for(int j = 2; j <i; j++)
            {
                if(i % j == 0)
                {
                    flag = false;
                    break;
                }
            }

            if(flag)
            {
                System.out.print(i + " ");
				count++;
            }
        }
    }
}