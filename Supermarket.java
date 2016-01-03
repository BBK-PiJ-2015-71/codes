class Supermarket
{
		
	public static void main(String[] args)
	{
		Supermarket sm= new Supermarket();
		PersonQueue queue1=new PointerPersonQueue();
		Person per1 = new Person("Steve");
		Person per2 = new Person("Jack");
		Person per3 = new Person("Andy");
		sm.addPerson(queue1,per1);
		sm.addPerson(queue1,per2);
		sm.addPerson(queue1,per3);
		Person per= sm.servePerson(queue1);
		System.out.println(per.getname());
		Person per_x1= sm.servePerson(queue1);
		System.out.println(per_x1.getname());
		Person per_x2= sm.servePerson(queue1);
		System.out.println(per_x2.getname());

	}
	

	public void addPerson(PersonQueue queue, Person per)
	{
		queue.insert(per);
	}
	
	public Person servePerson(PersonQueue queue)
	{
		return queue.retrieve();
	}

}