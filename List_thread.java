public class List_thread{

	private static String[] finished=new String[10];
	private static int items=0;

	public synchronized static void add(String str){
		finished[items]=str;
		items++;
		//System.out.println("Length of array: "+items);
		
	}
	
	public synchronized  static void retrieve(){
		if(items>0){
	
			System.out.print("Finished tasks : ");
			for(int i=0;i<items;i++){
				System.out.print(finished[i]+ "  ");
				finished[i]=null;
			}
			System.out.println("  ");
			items=0;
		} else {
		}		
	}

	
}