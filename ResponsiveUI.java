import java.util.Scanner;

public class ResponsiveUI{

	public static void main(String[] args){
		Scanner user_input = new Scanner( System.in );
		for(int i=0;i<10;i++){
			//System.out.println("Enter time for task "+i+" .");
			//int num = user_input.nextInt( );
			Task taska = new Task();
			Thread t = new Thread(taska);
			t.start();
			//System.out.println("Thread "+i+ " going to sleep.");
			//t.sleep(num);
			//System.out.println("Thread "+i + " woke up.");
			
		}
		
	}

}