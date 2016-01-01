public class HospitalManager2
{
	private static Patient2 patientListStart = null;

	public static void main(String[] args) 
	{	

		HospitalManager2 hm = new HospitalManager2();

		hm.launch();
		patientListStart.printPatient(patientListStart);
		Patient.patientcount();
		patientListStart.patientcount2(patientListStart);


		Patient2 yetAnotherPatient = new Patient2("Mary", 66, "Meningitis");
		patientListStart.addPatient(yetAnotherPatient);
		
		//patientListStart.printPatient(patientListStart);
		//Patient2.patientcount();
		//patientListStart.patientcount2(patientListStart);

		Patient2 three = new Patient2("Martha", 60, "Cholera");
		patientListStart.addPatient(three);
		//patientListStart.printPatient(patientListStart);
		//Patient2.patientcount();
		//patientListStart.patientcount2(patientListStart);

		Patient2 four = new Patient2("Abi", 26, "Influenza");
		patientListStart.addPatient(four);
		Patient2 five = new Patient2("Stan", 18, "Mums");
		patientListStart.addPatient(five);

		Patient2 six = new Patient2("Ravi", 40, "Influenza");
		patientListStart.addPatient(six);
		Patient2 seven = new Patient2("Arihant", 13, "Fracture");
		patientListStart.addPatient(seven);

		Patient2 eight = new Patient2("Ben", 25, "TB");
		patientListStart.addPatient(eight);

		Patient2 nine = new Patient2("Ola", 6, "Influenza");
		patientListStart.addPatient(nine);
		Patient2 ten = new Patient2("Martin", 28, "Cancer");
		patientListStart.addPatient(ten);

		//Patient2.patientcount();
		patientListStart.patientcount2(patientListStart);
		
		patientListStart.printPatient(patientListStart);
		patientListStart.deletePatient(three);
		patientListStart.deletePatient(four);
		//patientListStart.printPatient(patientListStart);
		//patientListStart=yetAnotherPatient;//delete firstpatient
		patientListStart.printPatient(patientListStart);
		patientListStart.patientcount2(patientListStart);

		Patient2 another = new Patient2("uli", 36, "Influenza");
		patientListStart.addPatient(another);

		Patient2 notinlist = new Patient2("utk", 34, "Bakwas");
		patientListStart.deletePatient(notinlist);
		patientListStart.printPatient(patientListStart);
		patientListStart.patientcount2(patientListStart);

	}

	public void launch()
	{
		Patient2 firstPatient = new Patient2("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
	}


}