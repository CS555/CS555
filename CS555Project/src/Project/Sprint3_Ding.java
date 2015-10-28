package Project;

import java.util.Calendar;

import Data.Individual;

public class Sprint3_Ding {
	//Sprint 3
	public int setMon(String str){
		int mon=0;
		if(str.equals("JAN")){
			mon = 1;
		}
		else if(str.equals("FEB")){
			mon = 2;
		}
		else if(str.equals("MAR")){
			mon = 3;
		}
		else if(str.equals("APR")){
			mon = 4;
		}
		else if(str.equals("MAY")){
			mon = 5;
		}
		else if(str.equals("JUN")){
			mon = 6;
		}
		else if(str.equals("JUL")){
			mon = 7;
		}
		else if(str.equals("AUG")){
			mon = 8;
		}
		else if(str.equals("SEP")){
			mon = 9;
		}
		else if(str.equals("OCT")){
			mon = 10;
		}
		else if(str.equals("NOV")){
			mon = 11;
		}
		else
			mon = 12;
		return mon;
	}
	
	//check birthdate before marriage date
	//only output invalid data
	public String checkBirthBeforeMarr(Individual indiO){
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
			else if(indiO.getBirthDate().isEmpty() && !indiO.getWeddingDate().isEmpty()){
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
			if(!ind.getBirthDate().isEmpty())
			{
				Calendar cal = Calendar.getInstance();
				String s = ind.getBirthDate();
				int currentYear,currentMon,currentDay;
				int birthYear,birthMon,birthDay;                              
				String []nextLine = (s.split("\\s+"));	
				birthDay = Integer.parseInt(nextLine[0]);
				birthMon = setMon(nextLine[1]);
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
