package Project;

import Data.Family;
import Data.Individual;
import java.util.Calendar;

public class Sprint2_Ding {
	//sprint 2 by Zejie Ding
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
	
	public String checkBirthDateBeforeCurrentForIndi(Individual indiO){
		try{
			String res = "";
			Calendar cal = Calendar.getInstance();
			int currentDay, currentMonth, currentYear;
			currentDay = cal.get(Calendar.DATE);
			currentMonth = cal.get(Calendar.MONTH);
			currentYear = cal.get(Calendar.YEAR);
			if(!indiO.getBirthDate().isEmpty()){
				String birth = indiO.getBirthDate();
				int birthYear, birthMon, birthDay;
				String []birthNextLine = birth.split("\\s+") ;
				birthDay = Integer.parseInt(birthNextLine[0]);
				birthMon = setMon(birthNextLine[1]);
				birthYear = Integer.parseInt(birthNextLine[2]);			
				if(birthYear < currentYear){
					res = "";
				}
				else if(birthYear == currentYear){
					if(birthMon < currentMonth){
						res = "";
					}
					else if(birthMon == currentMonth){
						if(birthDay <= currentDay){
							res = "";
						}
						else{
							res = "Data Invalid: Birth Date is behind Current Date";
						}
					}
					else{
						res = "Data Invalid: Birth Date is behind Current Date";
					}
				}
				else{
					res = "Data Invalid: Birth Date is behind Current Date";
				}
			}
			return res;
		}
		catch(Exception e){
			return "This individual does not have birth date information you need";
		}
	}
	
	public String checkDeathDateBeforeCurrentForIndi(Individual indiO){
		try{
			String res = "";
			Calendar cal = Calendar.getInstance();
			int currentDay, currentMonth, currentYear;
			currentDay = cal.get(Calendar.DATE);
			currentMonth = cal.get(Calendar.MONTH);
			currentYear = cal.get(Calendar.YEAR);
			if(!indiO.getDeathDate().isEmpty()){
				String death = indiO.getDeathDate();
				int deathYear, deathMon, deathDay;
				String []deathNextLine = death.split("\\s+") ;
				deathDay = Integer.parseInt(deathNextLine[0]);
				deathMon = setMon(deathNextLine[1]);
				deathYear = Integer.parseInt(deathNextLine[2]);			
				if(deathYear < currentYear){
					res = "Data Valid";
				}
				else if(deathYear == currentYear){
					if(deathMon < currentMonth){
						res = "Data Valid";
					}
					else if(deathMon == currentMonth){
						if(deathDay <= currentDay){
							res = "Data Valid";
						}
						else{
							res = "Data Invalid: Death Date is behind Current Date";
						}
					}
					else{
						res = "Data Invalid: Death Date is behind Current Date";
					}
				}
				else{
					res = "Data Invalid: Death Date is behind Current Date";
				}
			}
			return res;
		}
		catch(Exception e){
			return "";
		}
	}
	
	public String checkMarriageDateBeforeCurrentForFam(Family famO){
		try{
			String res = "";
			Calendar cal = Calendar.getInstance();
			int currentDay, currentMonth, currentYear;
			currentDay = cal.get(Calendar.DATE);
			currentMonth = cal.get(Calendar.MONTH);
			currentYear = cal.get(Calendar.YEAR);
			if(!famO.getWeddingDate().isEmpty()){
				String Wedd = famO.getWeddingDate();
				int weddYear, weddMon, weddDay;
				String []weddNextLine = Wedd.split("\\s+") ;
				weddDay = Integer.parseInt(weddNextLine[0]);
				weddMon = setMon(weddNextLine[1]);
				weddYear = Integer.parseInt(weddNextLine[2]);			
				if(weddYear < currentYear){
					res = "";
				}
				else if(weddYear == currentYear){
					if(weddMon < currentMonth){
						res = "";
					}
					else if(weddMon == currentMonth){
						if(weddDay <= currentDay){
							res = "";
						}
						else{
							res = "Data Invalid: Marriage Date is behind Current Date";
						}
					}
					else{
						res = "Data Invalid: Marriage Date is behind Current Date";
					}
				}
				else{
					res = "Data Invalid: Marriage Date is behind Current Date";
				}
			}
			return res;
		}
		catch(Exception e){
			return "This family does not have marriage date information";
		}
	}
	
	public String checkDivorceDateBeforeCurrentForFam(Family famO){
		try{
			String res = "";
			Calendar cal = Calendar.getInstance();
			int currentDay, currentMonth, currentYear;
			currentDay = cal.get(Calendar.DATE);
			currentMonth = cal.get(Calendar.MONTH);
			currentYear = cal.get(Calendar.YEAR);
			if(!famO.getDivorceDate().isEmpty()){
				String Divor = famO.getDivorceDate();
				int divYear, divMon, divDay;
				String []divNextLine = Divor.split("\\s+") ;
				divDay = Integer.parseInt(divNextLine[0]);
				divMon = setMon(divNextLine[1]);
				divYear = Integer.parseInt(divNextLine[2]);			
				if(divYear < currentYear){
					res = "";
				}
				else if(divYear == currentYear){
					if(divMon < currentMonth){
						res = "";
					}
					else if(divMon == currentMonth){
						if(divDay <= currentDay){
							res = "";
						}
						else{
							res = "Data Invalid: Divorce Date is behind Current Date";
						}
					}
					else{
						res = "Data Invalid: Divorce Date is behind Current Date";
					}
				}
				else{
					res = "Data Invalid: Divorce Date is behind Current Date";
				}
			}
			return res;
		}
		catch(Exception e){
			return "";
		}
	}
	
	public String checkBirthBeforeDeath(Individual indiO){
		try{
			String res ="";
			if(!indiO.getBirthDate().isEmpty() && !indiO.getDeathDate().isEmpty()){
				
				String birth = indiO.getBirthDate();
				int birthYear,birthMon,birthDay;  
				String death = indiO.getDeathDate();
				int deathYear, deathMon, deathDay;
				String []birnextLine = (birth.split("\\s+"));
				String []deanextLine = (death.split("\\s+"));
				birthDay = Integer.parseInt(birnextLine[0]);
				deathDay = Integer.parseInt(deanextLine[0]);
				birthMon = setMon(birnextLine[1]);
				deathMon = setMon(deanextLine[1]);
				birthYear = Integer.parseInt(birnextLine[2]);
				deathYear = Integer.parseInt(deanextLine[2]);
				if(birthYear < deathYear){
					res = "";
				}
				else if(birthYear == deathYear){
					if(birthMon < deathMon){
						res = "";
					}
					else if(birthMon == deathMon){
						if(birthDay <= deathDay){
							res = "";
						}
						else{
							res = "Data Invalid: Birth Date is behind Death Date";
						}
					}
					else{
						res = "Data Invalid: Birth Date is behind Death Date";
					}
				}
				else{
					res = "Data Invalid: Birth Date is behind Death Date";
				}
			}
			else if(indiO.getBirthDate().isEmpty() && !indiO.getDeathDate().isEmpty()){
				res = "Data Invalid: Individual has a death date, no birth date";
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
}