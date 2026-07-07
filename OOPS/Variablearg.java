class Sum
{
    int sum = 0;

    void calSum(int ...x)
    {
        for(int i=0; i<x.length; i++)
        {
            sum = sum + x[i];
        }

        System.out.println("sum is = " + sum);
    }
}

public class Variablearg
{
    public static void main(String[] args)
    {
        Sum s = new Sum();
        s.calSum(1,2,3,4,5,6,7);
    }
}