public class Patient3 
{
	private String name;
	private int age;
	private String illness;
	Patient3 nextPatient;
	private static int patientcount=1;
	private int count=0;
	
	
	public Patient3(String name, int age, String illness) 
	{
		this.name = name;
		this.age = age;
		this.illness = illness;
		this.nextPatient = null;
	}

	public void addPatient(Patient3 newPatient) 
	{
		if (this.nextPatient == HospitalManager3.patientListStart || this.nextPatient==null) 
		{
			// this means this is the last patient in the list
			this.nextPatient = newPatient;
			newPatient.nextPatient=HospitalManager3.patientListStart;
			patientcount++;
		} 
		else 
		{
			this.nextPatient.addPatient(newPatient);
		}
	}

	// returns true if the patient was found and removed, false otherwise
	public boolean deletePatient(Patient3 patient) 
	{
		if (this.nextPatient == HospitalManager3.patientListStart) 
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
	
	public void printPatient(Patient3 patient)
	{
		System.out.println("Name: "+patient.name+" ,\t Age: "+patient.age+" ,\tIllness: "+patient.illness);
		if (patient.nextPatient != null && patient.nextPatient != HospitalManager3.patientListStart) 
		{	
			printPatient(patient.nextPatient);
		}
		System.out.println("-------------");
	}

	public static void patientcount()
	{	System.out.println("Patient count: "+patientcount);
	}

	public void patientcount2(Patient3 patient)
	{	count++;
		if (patient.nextPatient != HospitalManager3.patientListStart && patient.nextPatient != null) 
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