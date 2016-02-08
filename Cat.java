import java.lang.StringBuilder;
import java.io.*;

public class Cat{

	public static void main(String... args){
		
		if(args.length==1){	

                     String file_name=args[0];

		     File file1=new File(file_name); 

		     if(file1.exists()){	
			
			  try(BufferedReader in = new BufferedReader(new FileReader(file1))){
		       	              
				String line ;//=in.readLine()

				StringBuilder sb=new StringBuilder();

				while((line=in.readLine()) !=null) {
					
					sb.append(line);
					//line=in.readLine();
				}
		     		System.out.println("Content of file: "+sb.toString());
			
                          } catch(FileNotFoundException ex){
				 System.out.println("File " + file1 + " does not exist.");
			   }catch(IOException ex){
				 ex.printStackTrace();
			   }

		    } else{
		             System.out.println("File does not exist");
		    }
			
		} else{
			System.out.println("No filename entered");
			System.exit(-1);
		}

	}

}