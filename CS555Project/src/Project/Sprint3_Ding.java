package Project;

import java.util.Calendar;

import Data.Individual;

public class Sprint3_Ding {
	
	Helper helper = new Helper();
	//check birthdate before marriage date
	//only output invalid data
	public String checkBirthBeforeMarr(Individual indiO){
		try{
			String res ="";
			if(indiO.getBirthDate() != null && indiO.getWeddingDate() != null){
				
				String birth = indiO.getBirthDate();
				int birthYear,birthMon,birthDay;  
				String wed = indiO.getWeddingDate();
				int wedYear, wedMon, wedDay;
				String []birnextLine = (birth.split("\\s+"));
				String []wednextLine = (wed.split("\\s+"));
				birthDay = Integer.parseInt(birnextLine[0]);
				wedDay = Integer.parseInt(wednextLine[0]);
				birthMon = helper.transfMon(birnextLine[1]);
				wedMon = helper.transfMon(wednextLine[1]);
				birthYear = Integer.parseInt(birnextLine[2]);
				wedYear = Integer.parseInt(wednextLine[2]);
				if(birthYear < wedYear){
					res = "";
				}
				else if(birthYear == wedYear){
					if(birthMon < wedMon){
						res = "";
					}
					else if(birthMon == wedMon){
						if(birthDay <= wedDay){
							res = "";
						}
						else{
							res = "Data Invalid Report: Birth Date is behind Wedding Date";
						}
					}
					else{
						res = "Data Invalid Report: Birth Date is behind Wedding Date";
					}
				}
				else{
					res = "Data Invalid Report: Birth Date is behind Wedding Date";
				}
			}
			else if(indiO.getBirthDate() == null && indiO.getWeddingDate() != null){
				res = "Data Invalid Report: Individual has a wedding date, no birth date";
			}
			else{
				res = "";
			}
			return res;
		}
		catch(Exception e){
			return "";
		}
	}
	
	//check current age, if it is greater than 150
	//only output invalid data
	public String currentAgeCheck(Individual ind) {
		int age  =0;
		String res = "";
		try{
			if(ind.getBirthDate() != null)
			{
				Calendar cal = Calendar.getInstance();
				String s = ind.getBirthDate();
				int currentYear,currentMon,currentDay;
				int birthYear,birthMon,birthDay;                              
				String []nextLine = (s.split("\\s+"));	
				birthDay = Integer.parseInt(nextLine[0]);
				birthMon = helper.transfMon(nextLine[1]);
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
			return "Data Invalid Report: This individual does not have a birth date";
		}
		if(age < 150){
			res =  "";
		}
		else{
			res =  "Data Invalid Report: This individual's age is greater than 150";
		}
		return res;
	}
}
