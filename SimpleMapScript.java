public class SimpleMapScript
{
	public static void main(String[] str)
	{
		ArraySimpleMap map1= new ArraySimpleMap(20);
		map1.put(4,"Jamie");
		map1.put(1,"john");
		map1.put(10,"Ali");

		System.out.println(map1.get(10));
		System.out.println(map1.get(11));
		
		map1.remove(10);

		System.out.println(map1.get(4));
		System.out.println(map1.get(10));

		System.out.println("Empty map: "+map1.isEmpty());
	}

}