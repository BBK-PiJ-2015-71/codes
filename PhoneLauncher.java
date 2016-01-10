public class PhoneLauncher 
{
	public static void main(String[] args) 
	{
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() 
	{
	// your code creating and using SmartPhone here...
		SmartPhone phone1 = new SmartPhone("Nokia");
		phone1.playGame("Game of Thrones");
		phone1.call("1234523");
		phone1.call("001234523");
		System.out.println(phone1.findPosition());
		System.out.println(phone1.getBrand());
	}

}