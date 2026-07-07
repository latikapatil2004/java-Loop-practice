class PreacticeSet2
{
	public static void main (String[]args)
	{
		int a[] = new int[]{0, 3, 6, 9, 12, 14, 18, 20, 22, 25, 27};
		for(int i=0;i<a.length;i++)
		{
			for(int j=i+1;j<a.length;j++)
			{
				System.out.println(a[i] + ","+a[j]);
			}
		}
}
}