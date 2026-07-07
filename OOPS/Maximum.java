/*Example: WAP to find max value from Array 
Create class name as MaxFinder with two methods 
void setArray(int a[]): this function accept array as parameter 
int getMax(): this function finds the max value and returns it.
*/

class Max
{
	int arr[];
	void setdata(int a[])
	{
		arr=a;
	}
	int getMax()
	{
		int max=Integer.MIN_VALUE;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]>max)
			{
				max=arr[i];
			}
		}
		return max;
	}
}
class Maximum
{
	public static void main(String[]args)
	{
		Max m=new Max();
		m.setdata(new int[]{10,20,30,40,50});
		System.out.println(m.getMax());
	}
}