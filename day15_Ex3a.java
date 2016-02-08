import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;


public class day15_Ex3a{

	int[] numlist= new int[10];

   public void launch() {

	Scanner user_input = new Scanner( System.in );

	try {
		for(int i=0;i<10;i++) {
			System.out.println("enter number: ");	
			String str=user_input.next();
			numlist[i]=Integer.parseInt(str);
			System.out.println(numlist[i] + " is registered");
		}
	
	} catch (IndexOutOfBoundsException ex){
		System.out.println("Check array size");
		ex.printStackTrace();
	} catch (Exception ex){
		ex.printStackTrace();
	}
   }

   public void average() {

	int sum=0;

	try {
		for(int i=0;i<10;i++) {
			sum=sum+numlist[i];
		}
		System.out.println("Average is "+sum/10.0); 
	
	} catch (IndexOutOfBoundsException ex){
		System.out.println("Check array size");
		ex.printStackTrace();
	} catch (Exception ex){
		ex.printStackTrace();
	}	

  }

  public static void main(String[] args){

		day15_Ex3a a= new day15_Ex3a();
		a.launch();
		a.average();
		System.out.println("End of Program");
	}

}