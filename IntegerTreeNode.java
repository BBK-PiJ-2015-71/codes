import java.lang.*;

public class IntegerTreeNode 
{
	int value;
	IntegerTreeNode left;
	IntegerTreeNode right;
	private static int max;
	private static int min;
	private static int depthleft;
	private static int depthright;

	public IntegerTreeNode(int a)
	{
		this.value=a;
		this.left=null;
		this.right=null;
		max=0;
		min=0;
		depthleft=0;
		depthright=0;
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

	public void toString1()
	{
		System.out.print("["+this.value+"]");
		
		if(left!=null)
		{	System.out.println("");
			left.toString1();
			
		}

		if(right!=null)
		{ 	System.out.print("\t");
			right.toString1();
		}	 


	}

	
	public int depth()
	{ this.depthcalc();
	  return Math.max(depthright, depthleft);
	}

	private void depthcalc()
	{

		if(right!=null)
		{ 	right.depthcalc();
			depthright++;
		}	 

		if(left!=null)
		{	left.depthcalc();
			depthleft++;
		}
	}

}