import java.io.File;

public class Mkdir{

	public static void main(String[] args){
		
		String str1="";
		for(int i=0;i<args.length;i++){
			//System.out.println("input: "+args[i]);
			str1=str1+args[i]+" ";
			
		}
		String directory_path=".\\"+str1;
		File dir1 = new File(directory_path);
		try{
			dir1.mkdir();
			System.out.println("Job done- directory created "+directory_path);
			
		} catch(SecurityException ex){

			System.out.println("SecurityManager does not allow directory names "+directory_path+" to be created.");
		
		} catch(Exception ex){

			ex.printStackTrace();

		} finally {
			System.out.println("-----End of program :) ----- ");
		}
		
	}

}