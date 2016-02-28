public class Task implements Runnable{

	private final String name;
	public  final int duration;
	public Task(String name, int dur){
		this.name    =name;
		this.duration=dur;
	}

	public void run(){
		//System.out.println(name + " starting.");
		try {
                     Thread.sleep(duration);
		} catch(InterruptedException ex) {

		}
		//System.out.println(name + " woke up.");
		List_thread.add(name);

		
	}

}