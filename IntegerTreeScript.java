public class IntegerTreeScript
{
	
	public static void main(String[] str)
	{
		IntegerTreeNode tree1 = new IntegerTreeNode(5);
		tree1.add(4);
		tree1.add(3);
		tree1.add(2);
		tree1.add(9);
		tree1.add(20);
		tree1.add(-1);
		tree1.add(-3);
		tree1.add(7);
		tree1.add(2);

		System.out.println(tree1.contains(5));
		System.out.println(tree1.contains(4));
		System.out.println(tree1.contains(3));

		System.out.println("Max: "+tree1.getMax());
		System.out.println("Min: " +tree1.getMin());
		//Min does work if no value less than 0
		tree1.toString1();
		System.out.println("Depth: "+tree1.depth());
		
	}

}