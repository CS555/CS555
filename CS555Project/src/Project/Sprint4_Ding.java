package Project;

import java.util.*;

import Data.Individual;

public class Sprint4_Ding {
	
	//read string file from GEDCOM where months were described in abbreviation
	//use helper class to process the month from the GEDCOM file
	Helper helper = new Helper();
	
	//sprint 4
	//check the individual if he or she was 14 years old or older when he or she was married
	// only invalid data will be output
	public String checkMarriageAfter14(Individual indiO){
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
					if(wedYear - birthYear > 14){
						res = "";
					}
					else if(wedYear - birthYear == 14){
						if(birthMon < wedMon){
							res = "";
						}
						else if(birthMon == wedMon){
							if(birthDay < wedDay){
								res = "";
							}
							else{
								res = "Data Invalid Report: Marriage is before 14 years old";
							}
						}
						else{
							res = "Data Invalid Report: Marriage is before 14 years old";
						}
					}
					else{
						res = "Data Invalid Report: Marriage is before 14 years old";
					}
				}
				else{
					res = "Data Invalid Report: Marriage is before 14 years old";
				}
			}
			return res;
		}
		catch(Exception e){
			return "Data Invalid Report: Individual neither has a wedding date nor a birth date";
		}
	}
	
	//sprint 4
	//List upcoming birthdays within next 30 days by using calendar function.
	public String checkUpcomingBirthdays(Individual indiO){
		String res = "";
		try{
			if(indiO.getBirthDate() != null)
			{
				Calendar cal1 = Calendar.getInstance();
				String s = indiO.getBirthDate();
				int currentYear,currentMon,currentDay;
				int birthYear,birthMon,birthDay;                              
				String []nextLine = (s.split("\\s+"));	
				birthDay = Integer.parseInt(nextLine[0]);
				birthMon = helper.transfMon(nextLine[1]);
				birthYear = Integer.parseInt(nextLine[2]);
				
				Calendar cal=new GregorianCalendar();
				
				//add 30 days to current days
				cal.add(Calendar.DATE, 30);
				int maxMon,maxDay;                             
				maxMon = cal.get(Calendar.MONTH)+1;
				maxDay=cal.get(Calendar.DATE);
				
				currentYear = cal1.get(Calendar.YEAR);
				currentMon = cal1.get(Calendar.MONTH)+1;
				currentDay=cal1.get(Calendar.DATE); 		
				if(birthYear < currentYear) {
					if(birthMon == currentMon) {
						if(birthDay > currentDay)
							res = "Upcoming birthday is: " + indiO.getBirthDate();
					}
					else if(birthMon == currentMon+1) {
						if(birthDay <= maxDay) {
							res = "Upcoming birthday is: " + indiO.getBirthDate();
						}
					}
					else if(birthMon == maxMon && birthMon==1 && currentMon==12) {
						if(birthDay <= maxDay) {
							res = "Upcoming birthday is: " + indiO.getBirthDate();
						}
					}
				}
				else if(birthYear == currentYear) {
					if(birthMon == maxMon && birthMon==1 && currentMon==12) {
						if(birthDay <= maxDay) {
							res = "Upcoming birthday is: " + indiO.getBirthDate();
						}
					}
				}
			}
			return res;
		}
		catch(Exception e){
			return res;
		}
	}
}
