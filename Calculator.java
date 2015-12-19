public class Calculator
{
	public void add(int a, int b)
	{
	System.out.println("Sum of "+a+" and " +b+" is: "+(a+b));
	}

	public void subtract(int a, int b)
	{
	System.out.println(a+" minus " +b+" is: "+(a-b));
	}

	public void multiply(int a, int b)
	{
	System.out.println(a+" multiplied by " +b+" is: "+(a*b));
	}

	public void divide(int a, int b)
	{
	System.out.println(a+" divided by " +b+" is: "+(a*1.0/b));
	}

	public void modulus(int a, int b)
	{
	System.out.println(a+" modulus " +b+" is: "+(a%b));
	}
}