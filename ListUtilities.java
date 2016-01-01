public class ListUtilities
{
	private static IntList IntListStart = null;
	public void list(int[] x)
	{	//Create Linked list of integers
		IntList first = new IntList(x[0]);
		IntListStart = first;

		for(int i=1;i<x.length;i++)
		{
			IntList intobject=new IntList(x[i]);	
			IntListStart.addInteger(intobject);
		}	
	
		//count fo elements in linked list
		IntListStart.integercount(IntListStart);

		//printed elements of linked list
		IntListStart.printInteger(IntListStart);
	}
	
	public static void main(String[] args)
	{
		ListUtilities lu = new ListUtilities();
		int[] x = {1,3,5,7,9};
		lu.list(x);
	}

}