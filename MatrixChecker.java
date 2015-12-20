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
				{	if(mat[i][j]!=mat[j][i])
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
}