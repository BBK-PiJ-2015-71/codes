class HashUtilities
{

	public static int shortHash(int a)
	{
		int x=Math.abs(a);
		while(x<0 || x>1000)
		{	
			if(x<0)
 			{	x=Math.abs(x*10);
			}
			else if(x>1000)
			{	x=Math.abs(x/10);
			}
		}
		return x;
	}

	public static void main(String[] str)
	{
		int x=-10560;
		System.out.println("Hash of "+x+" is: "+HashUtilities.shortHash(x));

		System.out.println("Give me a string and I will calculate its hash code");
		String str2 = System.console().readLine();
		int hash = str2.hashCode();
		int smallHash = HashUtilities.shortHash(hash);
		System.out.println("0 < " + smallHash + " < 1000");
	}


}