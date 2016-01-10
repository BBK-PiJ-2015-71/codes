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
		SmartPhone phone1 = new SmartPhone();
		phone1.call("1234523");
		phone1.call("001234523");
		System.out.println(phone1.findPosition());
	}

}