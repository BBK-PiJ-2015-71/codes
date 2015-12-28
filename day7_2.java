public class day7_2
{
	private static int marksCount=0;
	private static int distinctions=0;
	private static int passes=0;
	private static int failed=0;
	private static int invalid=-1;

	public static void marksgetter()
	{
		int marks=0;
		while(marks!=-1)
		{
			System.out.println("Input a mark: ");
			marks=Integer.parseInt(System.console().readLine());
			System.out.println("Marks entered: "+marks);
			marksCount++;
			if(marks>=70 && marks<=100)
			{	distinctions++;
			}
			else if(marks>=50 && marks<=69)
			{	passes++;
			}
			else if(marks>=0 && marks<=49)
			{ failed++;
			}
			else if(marks>100 && marks<0)
			{ invalid++;
			}
			else { invalid++ ;}
		}
		System.out.println("There are "+(distinctions+passes+failed)+" students: "+distinctions+" distinctions, "+passes+" pass, "+failed+" fails (plus "+invalid+" invalid)");
	}
	
	public static void main(String[] args)
	{
    	day7_2.marksgetter();
	}

}