public class IntList
{
	private int value;
	private IntList nextInteger;
	private int count=0;
	
	
	public IntList(int x) 
	{
		this.value= x;
		this.nextInteger = null;
	}

	public void addInteger(IntList new1) 
	{
		if (this.nextInteger == null) 
		{
			// this means this is the last integer in the list
			this.nextInteger = new1;
		} 
		else 
		{
			this.nextInteger.addInteger(new1);
		}
	}

	// returns true if the integer was found and removed, false otherwise
	public boolean deleteInteger(IntList y) 
	{
		if (this.nextInteger == null) 
		{
			// integer to remove was not found
			return false;
		} 
		else if (this.nextInteger.equals(y)) 
		{
			// We found it! It is the next one!
			// Now link this integer to the one after the next
			this.nextInteger = nextInteger.nextInteger;
			return true;

		} 
		else 
		{
			return this.nextInteger.deleteInteger(y);
		}
	}
	
	public void printInteger(IntList a)
	{
		System.out.println("Value: "+a.value);
		if (a.nextInteger != null) 
		{	
			printInteger(a.nextInteger);
		}
		System.out.println("\n");
	}

	public void integercount(IntList a)
	{	count++;
		if (a.nextInteger != null) 
		{	
			integercount(a.nextInteger);
		}
		else
		{
			System.out.println("Count of integers(recursive method) : "+count);
		}
		count=0;
	}

}