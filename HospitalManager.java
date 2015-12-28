public class HospitalManager 
{
	private static Patient patientListStart = null;

	public static void main(String[] args) 
	{	

		HospitalManager hm = new HospitalManager();

		hm.launch();
		patientListStart.printPatient(patientListStart);
		Patient.patientcount();
		patientListStart.patientcount2(patientListStart);


		Patient yetAnotherPatient = new Patient("Mary", 66, "Meningitis");
		patientListStart.addPatient(yetAnotherPatient);
		patientListStart.printPatient(patientListStart);
		Patient.patientcount();
		patientListStart.patientcount2(patientListStart);

		Patient three = new Patient("Martha", 60, "Cholera");
		patientListStart.addPatient(three);
		patientListStart.printPatient(patientListStart);
		Patient.patientcount();
		patientListStart.patientcount2(patientListStart);

		Patient four = new Patient("Abi", 26, "Influenza");
		patientListStart.addPatient(four);
		Patient five = new Patient("Stan", 18, "Mums");
		patientListStart.addPatient(five);

		Patient six = new Patient("Ravi", 40, "Influenza");
		patientListStart.addPatient(six);
		Patient seven = new Patient("Arihant", 13, "Fracture");
		patientListStart.addPatient(seven);

		Patient eight = new Patient("Ben", 25, "TB");
		patientListStart.addPatient(eight);

		Patient nine = new Patient("Ola", 6, "Influenza");
		patientListStart.addPatient(nine);
		Patient ten = new Patient("Martin", 28, "Cancer");
		patientListStart.addPatient(ten);

		Patient.patientcount();
		patientListStart.patientcount2(patientListStart);
		
		patientListStart.printPatient(patientListStart);
		patientListStart.deletePatient(three);
		patientListStart.deletePatient(four);
		patientListStart.printPatient(patientListStart);
		//patientListStart=yetAnotherPatient;//delete firstpatient
		patientListStart.printPatient(patientListStart);
		Patient.patientcount();
		patientListStart.patientcount2(patientListStart);
	
	}

	public void launch()
	{
		Patient firstPatient = new Patient("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
	}


}