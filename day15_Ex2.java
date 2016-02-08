import java.util.List;
import java.util.ArrayList;
public class day15_Ex2{


   public void launch() {
	List<Integer> intList = new ArrayList<Integer>();
	intList.add(1);
	intList.add(2);
	intList.add(3);
	intList.add(4);
	intList.add(5);
	intList.add(6);
	try {
		intList.add(6);		
	} catch (NullPointerException ex) { 
		ex.printStackTrace();
	} catch (Exception ex){
		ex.printStackTrace();
	}
  }

  public static void main(String[] args){

		day15_Ex2 a= new day15_Ex2();
		a.launch();
	}

}