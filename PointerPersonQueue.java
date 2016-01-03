public class PointerPersonQueue implements PersonQueue 
{
	private Person head;
	private Person tail;
	
	public PointerPersonQueue()
	{
		this.head=null;
		this.tail=null;
	}

	/** Add a person to a queue */
	public void insert(Person person)
	{
		if(this.tail!=null)
		{	
			tail.setNext(person);
			tail=person;
		}
		else if (this.tail==null || this.head==null) //empty queue
		{ head=person;
		  tail=person;
		}

	}

	/** Remove a person from a queue */
	public Person retrieve()
	{
		Person result;
		if(head==null || tail==null) //no element in queue
		{ return null;
		}
		else if(head==tail) //only one element in queue
		{
			tail=null;
		}
		result=head;
		head=head.getNext();

		return result;
	}

}


