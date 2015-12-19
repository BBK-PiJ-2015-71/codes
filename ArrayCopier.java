public class ArrayCopier
{
	public void copy(int[] src, int[] dst)
	{
		int src_length=src.length;
		int dst_length=dst.length;
		System.out.println("length of source array is "+src_length);
		System.out.println("length of target array is "+dst_length);
		if(src_length>=dst_length)
		{
			for(int j=0;j<dst_length;j++)
			{
				dst[j]=src[j];
			}
		}
		else if(src_length<dst_length)
		{
			for(int j=0;j<src_length;j++)
			{
				dst[j]=src[j];
			}
			for(int j=src_length;j<dst_length;j++)
			{
				dst[j]=0;
			}
		}
		System.out.println("After swapping, the destination array has the following elements");
		for(int i=0;i<dst_length;i++)
		{
			System.out.print(dst[i]+" ");
		}
	
	}

}