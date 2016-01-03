public class Person
{
	private String name;
	private Person nextPerson;

	public Person(String str1)
	{
		this.name=str1;
		this.nextPerson=null;	
	}

	public String getname()
	{
		return this.name;
	}

	public void setNext(Person per)
	{
		this.nextPerson=per;
	}

	public Person getNext()
	{ return this.nextPerson;
	}

}