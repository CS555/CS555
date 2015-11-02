package Project;

import java.util.Calendar;
import java.util.*;

import Data.Individual;

public class Sprint4_Ding {
	// Sprint 4
	// use function setMon to transfer string mon to integer mon
	public int setMon(String str) {
		int mon = 0;
		if (str.equals("JAN")) {
			mon = 1;
		} else if (str.equals("FEB")) {
			mon = 2;
		} else if (str.equals("MAR")) {
			mon = 3;
		} else if (str.equals("APR")) {
			mon = 4;
		} else if (str.equals("MAY")) {
			mon = 5;
		} else if (str.equals("JUN")) {
			mon = 6;
		} else if (str.equals("JUL")) {
			mon = 7;
		} else if (str.equals("AUG")) {
			mon = 8;
		} else if (str.equals("SEP")) {
			mon = 9;
		} else if (str.equals("OCT")) {
			mon = 10;
		} else if (str.equals("NOV")) {
			mon = 11;
		} else
			mon = 12;
		return mon;
	}
	
	//sprint 4
	//check the individual if he or she was 14 years old or older when he or she was married
	public String checkMarriageAfter14(Individual indiO){
		try{
			String res ="";
			if(!indiO.getBirthDate().isEmpty() && !indiO.getWeddingDate().isEmpty()){
				
				String birth = indiO.getBirthDate();
				int birthYear,birthMon,birthDay;  
				String wed = indiO.getWeddingDate();
				int wedYear, wedMon, wedDay;
				String []birnextLine = (birth.split("\\s+"));
				String []wednextLine = (wed.split("\\s+"));
				birthDay = Integer.parseInt(birnextLine[0]);
				wedDay = Integer.parseInt(wednextLine[0]);
				birthMon = setMon(birnextLine[1]);
				wedMon = setMon(wednextLine[1]);
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
			else if(indiO.getBirthDate().isEmpty() && !indiO.getWeddingDate().isEmpty()){
				res = "Data Invalid Report: Individual has a wedding date, no birth date";
			}
			else if(!indiO.getBirthDate().isEmpty() && indiO.getWeddingDate().isEmpty()){
				res = "Individual is not married yet";
			}
			return res;
		}
		catch(Exception e){
			return "Data Invalid Report: Individual neither has a wedding date not a birth date";
		}
	}
	
	//sprint 4
	//List upcoming birthdays within next 30 days.
	public List<String> checkUpcomingBirthdays(Individual indiO){
		List<String> res = new ArrayList<String>();
		try{
			if(!indiO.getBirthDate().isEmpty())
			{
				Calendar cal = Calendar.getInstance();
				String s = indiO.getBirthDate();
				int currentYear,currentMon,currentDay;
				int birthYear,birthMon,birthDay;                              
				String []nextLine = (s.split("\\s+"));	
				birthDay = Integer.parseInt(nextLine[0]);
				birthMon = setMon(nextLine[1]);
				birthYear = Integer.parseInt(nextLine[2]);
				currentYear = cal.get(Calendar.YEAR);
				currentMon = cal.get(Calendar.MONTH)+1;
				currentDay=cal.get(Calendar.DATE); 		
				if (currentYear > birthYear) { 
					if(currentMon==12 && birthMon==1){
						if(currentDay >= birthDay){
							res.add(indiO.getName());
						}
					}
					else if(birthMon - currentMon == 0){
						if(currentDay <= birthDay){
							res.add(indiO.getName());
						}
					}
					else if(birthMon - currentMon == 1){
						if(currentDay >= birthDay){
							res.add(indiO.getName());
						}
					}
			    }
				else if(currentYear == birthYear){
					if(currentMon==12 && birthMon==1){
						if(currentDay >= birthDay){
							res.add(indiO.getName());
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
