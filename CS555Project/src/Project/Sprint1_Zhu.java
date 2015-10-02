package Project;

import java.util.Calendar;

import Data.Individual;

public class Sprint1_Zhu {
	
	// test Unique name and birth date
	public String uniqueNaBir(Individual ind1,Individual ind2) {
		String s="";
		if(ind1.getName().equals(ind2.getName())) {	
			s = "Same individual Name" + ind1.getName() +
					"with ID: " + ind1.getId() + ind2.getId();
		}
		if(ind1.getBirthDate().equals(ind2.getBirthDate())) {
			s = "Same individual birth date" + ind1.getBirthDate() +
					"with Name: " + ind1.getName() + ind2.getGivenName();
		}
		return s;
	}
	
	// list person's current age according the birthdate
	public String listCurrentAge(Individual ind) {
		int age  =0;
		try{
			if(!ind.getBirthDate().isEmpty())
			{
				Calendar cal = Calendar.getInstance();
				String s = ind.getBirthDate();
				int currentYear,currentMon,currentDay;
				int birthYear,birthMon,birthDay;                              
				String []nextLine = (s.split("\\s+"));	
				birthDay = Integer.parseInt(nextLine[0]);
				if(nextLine[1].equals("JAN"))
					birthMon = 1;
				else if(nextLine[1].equals("FEB"))
					birthMon = 2;
				else if(nextLine[1].equals("MAR"))
					birthMon = 3;
				else if(nextLine[1].equals("APR"))
					birthMon = 4;
				else if(nextLine[1].equals("MAY"))
					birthMon = 5;
				else if(nextLine[1].equals("JUN"))
					birthMon = 6;
				else if(nextLine[1].equals("JUL"))
					birthMon = 7;
				else if(nextLine[1].equals("AUG"))
					birthMon = 8;
				else if(nextLine[1].equals("SEP"))
					birthMon = 9;
				else if(nextLine[1].equals("OCT"))
					birthMon = 10;
				else if(nextLine[1].equals("NOV"))
					birthMon = 11;
				else
					birthMon = 12;
				birthYear = Integer.parseInt(nextLine[2]);
				currentYear = cal.get(Calendar.YEAR);
				currentMon = cal.get(Calendar.MONTH)+1;
				currentDay=cal.get(Calendar.DATE); 		
				age= currentYear - birthYear;
				if (currentMon <= birthMon) { 
			           if (currentMon == birthMon) { 
			               if (currentDay < birthDay) age--; 
			           }else{ 
			               age--; 
			           } 
			    } 							
			}
		}
		catch(Exception e){
			return "This individual does not have a birth date";
		}
		return "Age: " + age;
	}
}