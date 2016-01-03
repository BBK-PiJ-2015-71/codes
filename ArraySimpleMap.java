public class ArraySimpleMap implements SimpleMap
{
	private int array_size;
	private boolean[] num;
	private String[] str;

	public ArraySimpleMap(int a)
	{
		this.array_size=a;
		this.num=new boolean[a];
		this.str=new String[a];
	}

	public void put(int key, String name)
	{
		if(num[key-1]!=true)
		{
			num[key-1]=true;
			str[key-1]=name;		
		}
	}	

	public String get(int key)
	{
		if(num[key-1]!=true)
		{ return null;
		}
		return str[key-1];
	}

	public void remove(int key)
	{
		if(num[key-1]==true)
		{
			num[key-1]=false;
			str[key-1]=null;
			
		}
	}

	public boolean isEmpty()
	{
		int count=0;
		boolean flag=true;
		for(int i=0;i<num.length;i++)
		{	if(num[i]==true)
			{count++;
			}
		}
		if(count>0)
		{ flag=false;	
		}
		return flag;
	}

}