public class SmartPhone extends MobilePhone
{
	public SmartPhone(String brand) 
	{
		super(brand);
	}
	public void browseWeb(String web)
	{
	}

	public String findPosition()
	{
		return "12.54, 3.45";
	}

	@Override
	public void call(String number)
	{
		if(number.substring(0,2).equals("00"))
		{
    			System.out.println("Calling "+number+" through the internet to save money");
		}
		else
		{ super.call(number);
		}
	}

}