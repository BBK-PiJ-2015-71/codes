public class Day6_5main
{
	public static void main(String[] args)
	{
	MatrixChecker mat = new MatrixChecker();
	int[] array1={1,2,3,4,1};
	mat.isSymmetrical(array1);
	int[][] matrix1={{1,2,3},{2,1,5},{3,4,1}};
	mat.isSymmetrical(matrix1);
	mat.prettyPrint(matrix1);
	}

}