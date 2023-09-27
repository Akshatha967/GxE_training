package dayTwo;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int [] values = {1,2,3,4,5,6};
		List<Patient> patients = new ArrayList<>();
		
		Patient pat1 = new Patient();
		pat1.setId(2);
		pat1.setName("Mia");
		patients.add(pat1);
		
		Patient pat2 = new Patient();
		pat2.setId(1);
		pat2.setName("Niar");
		patients.add(pat2);
		
		for(Patient pats: patients)
		{
			System.out.println(pats.getName()+" "+pats.getId());
			
		}
	}

}
