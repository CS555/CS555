package Project;

import java.util.Calendar;

import Data.Individual;

public class Sprint1_Zhu {
	
	public String uniqueNaBir(Individual individualObject1,Individual individualObject2) {
		String s="";
		if(individualObject1.getName().equals(individualObject2.getName())) {	
			s = "US23 error,same individual Name" + individualObject1.getName() +
					"with ID: " + individualObject1.getId() + individualObject2.getId();
		}
		if(individualObject1.getBirthDate().equals(individualObject2.getBirthDate())) {
			s = "US23 error,same individual birth date" + individualObject1.getBirthDate() +
					"with Name: " + individualObject1.getName() + individualObject2.getGivenName();
		}
		return s;
	}
	
	public String listCurrentAge(Individual individualObject1) {
		Calendar cal = Calendar.getInstance();
		int age=0;
		try{
			if(!individualObject1.getBirthDate().isEmpty())
			{
				String s = individualObject1.getBirthDate();
				int y,m,d,yy,mm,dd;
				String []nextLine = (s.split("\\s+"));	
				dd = Integer.parseInt(nextLine[0]);
				if(nextLine[1] == "JAN")
					mm = 1;
				else if(nextLine[1] == "FEB")
					mm = 2;
				else if(nextLine[1] == "MAR")
					mm = 3;
				else if(nextLine[1] == "APR")
					mm = 4;
				else if(nextLine[1] == "MAY")
					mm = 5;
				else if(nextLine[1] == "JUN")
					mm = 6;
				else if(nextLine[1] == "JUL")
					mm = 7;
				else if(nextLine[1] == "AUG")
					mm = 8;
				else if(nextLine[1] == "SEP")
					mm = 9;
				else if(nextLine[1] == "OCT")
					mm = 10;
				else if(nextLine[1] == "NOV")
					mm = 11;
				else
					mm = 12;
				yy = Integer.parseInt(nextLine[2]);
				y = cal.get(Calendar.YEAR);
				m = cal.get(Calendar.MONTH);
				d=cal.get(Calendar.DATE); 		
				age= y - yy;
				if (m <= mm) { 
			           if (m == mm) { 
			               if (d < dd) age--; 
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
