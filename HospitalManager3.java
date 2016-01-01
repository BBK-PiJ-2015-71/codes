public class HospitalManager3
{
	static Patient3 patientListStart = null;

	public static void main(String[] args) 
	{	

		HospitalManager3 hm = new HospitalManager3();

		hm.launch();
		//patientListStart.printPatient(patientListStart);
		//Patient3.patientcount();
		//patientListStart.patientcount2(patientListStart);

		Patient3 yetAnotherPatient = new Patient3("Mary", 66, "Meningitis");
		patientListStart.addPatient(yetAnotherPatient);
		//patientListStart.printPatient(patientListStart);
		//Patient3.patientcount();
		//patientListStart.patientcount2(patientListStart);

		Patient3 three = new Patient3("Martha", 60, "Cholera");
		patientListStart.addPatient(three);
		//patientListStart.printPatient(patientListStart);
		//Patient3.patientcount();
		//patientListStart.patientcount2(patientListStart);

		Patient3 four = new Patient3("Abi", 26, "Influenza");
		patientListStart.addPatient(four);
		Patient3 five = new Patient3("Stan", 18, "Mums");
		patientListStart.addPatient(five);

		Patient3 six = new Patient3("Ravi", 40, "Influenza");
		patientListStart.addPatient(six);
		Patient3 seven = new Patient3("Arihant", 13, "Fracture");
		patientListStart.addPatient(seven);

		Patient3 eight = new Patient3("Ben", 25, "TB");
		patientListStart.addPatient(eight);

		Patient3 nine = new Patient3("Ola", 6, "Influenza");
		patientListStart.addPatient(nine);
		Patient3 ten = new Patient3("Martin", 28, "Cancer");
		patientListStart.addPatient(ten);

		//Patient3.patientcount();
		//patientListStart.patientcount2(patientListStart);
		
		patientListStart.printPatient(patientListStart);
		patientListStart.deletePatient(three);
		patientListStart.deletePatient(four);
		patientListStart.printPatient(patientListStart);

		Patient3 another = new Patient3("uli", 36, "Influenza");
		patientListStart.addPatient(another);

		Patient3 notinlist = new Patient3("utk", 34, "Bakwas");
		patientListStart.deletePatient(notinlist);
		patientListStart.printPatient(patientListStart);

		//patientListStart=yetAnotherPatient;//delete firstpatient
		//patientListStart.printPatient(patientListStart);
		//Patient3.patientcount();
		//patientListStart.patientcount2(patientListStart);
	
	}

	public void launch()
	{
		Patient3 firstPatient = new Patient3("John", 33, "Tuberculosis");
		patientListStart = firstPatient;
	}


}