public class IntegerTreeNode 
{
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	private static int max;
	private static int min;

	public IntegerTreeNode(int a)
	{
		this.value=a;
		this.left=null;
		this.right=null;
		max=0;
		min=0;
	}
	

	public void add(int newNumber) 
	{
		if (newNumber > this.value) 
		{
			if (right == null) 
			{
				right = new IntegerTreeNode(newNumber);

			} 
			else 
			{
				right.add(newNumber);
			}
		} 
		else 
		{
			if (left == null) 
			{
				left = new IntegerTreeNode(newNumber);
			} 
			else 
			{
				left.add(newNumber);
			}
		}
	}

	public boolean contains(int n) 
	{
		if (n == this.value) 
		{
			return true;
		} 
		else if (n > this.value) 
		{
			if (right == null) 
			{
				return false;
			} 
			else 
			{
				return right.contains(n);
			}
		} 
		else 
		{
			if (left == null) 
			{
				return false;
			} 
			else 
			{
				return left.contains(n);
			}
		}
	}

	public int getValue()
	{	return this.value;
			
	}

	public int getMax()
	{
		this.calc();
		return max;
	}

	public int getMin()
	{
		this.calc();
		return min;
	}

	public void calc()
	{
		if(max<this.value)
		{
			max=this.value;
		}
		if(min>this.value)
		{
			min=this.value;
		}

		if(right!=null)
		{ 	right.calc();
		}	 

		if(left!=null)
		{	left.calc();
		}
	}


}