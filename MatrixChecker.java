public class MatrixChecker
{
	public void isSymmetrical(int[] arr)
	{	int count=0;
		for(int i=0;i<arr.length/2;i++)
		{
			if(arr[i]!=arr[arr.length-1-i])
			{count=count+1;
			}
		}
		if(count==0)
		{System.out.println("Symmetrical array");
		}
		else
		{System.out.println("Array not symmetrical");
		}
	}

	public void isSymmetrical(int[][] mat)
	{	if(mat.length==mat[0].length)
		{	int count=0;
			for(int i=0;i<mat.length;i++)
			{
				for(int j=0;j<i;j++)
				{	
					if(mat[i][j]!=mat[j][i])
					{	count+=1;
					}
				}
			}
			if(count>0)
			{	System.out.println("Matrix is not symmetrical");
			}
			else
			{	System.out.println("Matrix is symmetrical "+count);
			}
		}

		else
		{System.out.println("Matrix not symmetrical");
		}

	}


	public void prettyPrint(int[][] matrix_int)
	{
		System.out.println("Matrix is:");	
		for(int m=0;m<matrix_int.length;m++)
		{	
			
			for(int n=0;n<matrix_int[0].length;n++)
			{	System.out.print(matrix_int[m][n]);
				if(n!=matrix_int[0].length-1)
				{System.out.print("\t");
				}
			}
			if(m!=matrix_int.length-1)
			{ System.out.print("\n");
			}
		}
		System.out.print("\n");	
	}
}