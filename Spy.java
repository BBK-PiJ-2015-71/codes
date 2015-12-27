public class Spy
{
	private static int spyCount=0;
	private int spyID;
	public Spy(int id)
		{
		 spyID=id;
		 spyCount++;
		 System.out.println("ID of new spy: "+spyID+ " ," +"number of spies: "+spyCount);

		}
	public static int getNumberOfSpies()
		{ return spyCount;
		}
	public void die()
		{ spyCount--;
		  System.out.println("Spy "+ spyID+" has been detected and eliminated");
		  System.out.println("Spies active :"+spyCount);
		}

	public static void main(String[] args)
		{
		Spy one = new Spy(1);
      		Spy two = new Spy(2);
		Spy three=new Spy(3);
		two.die();
		}
}
