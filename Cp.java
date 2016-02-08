import java.lang.StringBuilder;
import java.io.*;

public class Cp{

	public static void main(String... args){


		
		if(args.length==2){	

                     String file_name1=args[0];
		     String file_name2=args[1];

		     File file1=new File(file_name1); 
		     File file2=new File(file_name2); 

		     StringBuilder sb=new StringBuilder();

		     if(file1.exists()){	
			
			  try(BufferedReader in = new BufferedReader(new FileReader(file1))){
		       	              
				String line ;//=in.readLine()



				while((line=in.readLine()) !=null) {
					
					sb.append(line);
					//line=in.readLine();
				}
		     		System.out.println("Content of first file: "+sb.toString());
			
                          } catch(FileNotFoundException ex){
				 System.out.println("File " + file1 + " does not exist.");
			   }catch(IOException ex){
				 ex.printStackTrace();
			   }

		    } else{
		             System.out.println("First file does not exist");
			     System.exit(-1);	
		    }
                    
    		    if(!file2.exists()){
     			  try(PrintWriter out = new PrintWriter(file2)){
		       	              
				out.write(sb.toString());
                                System.out.println(" Contents of file "+file1+ " written to file "+file2+" .");
			
                          } catch(FileNotFoundException ex){
				 System.out.println("Cannot write to file " + file1 + ".");
			   }
		    }
		    else {
			 System.out.println("Second file exists. To overwrite enter 1. To abort enter 0 ");
			 
		    }
		    
			
		} 
		else{
			System.out.println("Enter two file names");
			System.exit(-1);
		}
 	
	}


}