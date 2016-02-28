import java.util.Scanner;

public class ResponsiveUI{

	public static void main(String[] args){
		Scanner user_input = new Scanner( System.in );
		//int num = user_input.nextInt( );

		for(int i=0;i<10;i++){
			System.out.print("Enter time for task "+i+" in milliseconds : ");
			
			int duration=user_input.nextInt( );
			Task taska = new Task("Task "+i,duration);
			Thread t = new Thread(taska);

			t.start();
			List_thread.retrieve();	
			
		}
		List_thread.retrieve();				
	}

}