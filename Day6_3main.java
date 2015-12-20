public class Day6_3main
{
	public static void main(String[] args)
	{
		Matrix mat=new Matrix(2,3);
		mat.setElement(2,1,100);
		mat.setRow(1,"2,3,9");
		mat.setColumn(3,"3,9");
		mat.toString1();
		mat.prettyPrint();
	}

}