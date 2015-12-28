public class Patient 
{
	private String name;
	private int age;
	private String illness;
	private Patient nextPatient;
	private static int patientcount=1;
	private int count=0;
	
	
	public Patient(String name, int age, String illness) 
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public void addPatient(Patient newPatient) 
	{
		if (this.nextPatient == null) 
		{
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
			patientcount++;
		} 
		else 
		{
			this.nextPatient.addPatient(newPatient);
		}
	}

	// returns true if the patient was found and removed, false otherwise
	public boolean deletePatient(Patient patient) 
	{
		if (this.nextPatient == null) 
		{
			// patient to remove was not found
			return false;
		} 
		else if (this.nextPatient.name.equals(patient.name)) 
		{
			// We found it! It is the next one!
			// Now link this patient to the one after the next
			this.nextPatient = nextPatient.nextPatient;
			patientcount--;
			return true;

		} 
		else 
		{
			return this.nextPatient.deletePatient(patient);
		}
	}
	
	public void printPatient(Patient patient)
	{
		System.out.println("Name: "+patient.name+" ,\t Age: "+patient.age+" ,\tIllness: "+patient.illness);
		if (patient.nextPatient != null) 
		{	
			printPatient(patient.nextPatient);
		}
		System.out.println("-------------");
	}

	public static void patientcount()
	{	System.out.println("Patient count: "+patientcount);
	}

	public void patientcount2(Patient patient)
	{	count++;
		if (patient.nextPatient != null) 
		{	
			patientcount2(patient.nextPatient);
		}
		else
		{
			System.out.println("Count of patients(recursive) : "+count);
		}
		count=0;
	}

}