public class Matrix
{
	int [][] matrix_int;
	public Matrix(int a, int b)
	{
		matrix_int=new int[a][b];
		System.out.println("matrix is: "+matrix_int.length+" by "+matrix_int[0].length);
		for(int i=0;i<a;i++)
		{
			for(int j=0;j<b;j++)
			{
				matrix_int[i][j]=1;
			}
		}
	}	
	public void setElement(int x, int y, int newValue)
	{
		if(x>matrix_int.length || y>matrix_int[0].length)
		{
			System.out.println("Index not valid");
		}
		else 
		{
			matrix_int[x-1][y-1]=newValue;
			System.out.println("New value at location "+x+","+y +" is: "+matrix_int[x-1][y-1]);
		}
	}

	public void setRow(int a, String str)
	{
	
		String[] array_str=str.split(",");
		int not_numeric=0;
		for(int m=0;m<array_str.length;m++)
		{
			if(!isNumeric(array_str[m]))
			{
				not_numeric+=1;
			}

		}
		if(not_numeric>0 || a>matrix_int.length || array_str.length!=matrix_int[0].length)
		{
			System.out.println("incorrect row number, incorrect number of entries or non-numeric entry ");
		}
		else
		{
			for(int k=0;k<array_str.length;k++)
			{
				matrix_int[a-1][k]= Integer.parseInt(array_str[k]);
			}
			System.out.println("set row "+a+" to the new set of values "+str);
		}
		
	}

	public static boolean isNumeric(String str)  
	{  
  		try  
  		{  
    			double d = Double.parseDouble(str);  
  		}  
  		catch(NumberFormatException nfe)  
  		{  
    			return false;  
  		}  
 	 return true;  
	}


	public void setColumn(int a, String str)
	{
	
		String[] array_str=str.split(",");
		int not_numeric=0;
		for(int m=0;m<array_str.length;m++)
		{
			if(!isNumeric(array_str[m]))
			{
				not_numeric+=1;
			}

		}
		if(not_numeric>0 || a>matrix_int[0].length || array_str.length!=matrix_int.length)
		{
			System.out.println("incorrect column number, incorrect number of entries or non-numeric entry ");
		}
		else
		{
			for(int k=0;k<array_str.length;k++)
			{
				matrix_int[k][a-1]= Integer.parseInt(array_str[k]);
			}
			System.out.println("set column "+a+" to the new set of values "+str);
		}
		
	}

	public void toString1()
	{
		System.out.print("[");	
		for(int m=0;m<matrix_int.length;m++)
		{	
			
			for(int n=0;n<matrix_int[0].length;n++)
			{	System.out.print(matrix_int[m][n]);
				if(n!=matrix_int[0].length-1)
				{System.out.print(",");
				}
			}
			if(m!=matrix_int.length-1)
			{ System.out.print(";");
			}
		}
		System.out.print("]");	
	}

	public void prettyPrint()
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
