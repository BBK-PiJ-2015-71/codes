import  java.io.File;

public class Ls {

	public static void main(String[] args){
		
		File dir1= new File(".");
		String[] list1=dir1.list();
		for(int i=0;i<list1.length;i++){
			System.out.println("Files in directory: "+list1[i]);
		}
	}
}