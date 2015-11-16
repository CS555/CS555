package Project;

import Data.Family;
import Data.Individual;
import java.util.Calendar;

public class Sprint2_Ding {
	
	//read string file from GEDCOM where months were described in abbreviation
	//use helper class to process the month from the GEDCOM file
	Helper helper = new Helper();
	
	
	//sprint 2
	//check birth date before current date
	// only invalid data will be output
	public String checkBirthDateBeforeCurrentForIndi(Individual indiO){
		try{
			String res = "";
			Calendar cal = Calendar.getInstance();
			int currentDay, currentMonth, currentYear;
			currentDay = cal.get(Calendar.DATE);
			currentMonth = cal.get(Calendar.MONTH)+1;
			currentYear = cal.get(Calendar.YEAR);
			if(indiO.getBirthDate()!= null){
				String birth = indiO.getBirthDate();
				int birthYear, birthMon, birthDay;
				String []birthNextLine = birth.split("\\s+") ;
				birthDay = Integer.parseInt(birthNextLine[0]);
				birthMon = helper.transfMon(birthNextLine[1]);
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
							res = "Data Invalid Report: Birth Date is behind Current Date";
						}
					}
					else{
						res = "Data Invalid Report: Birth Date is behind Current Date";
					}
				}
				else{
					res = "Data Invalid Report: Birth Date is behind Current Date";
				}
			}
			return res;
		}
		catch(Exception e){
			return "This individual does not have birth date information you need";
		}
	}
	
	//check death date before current date
	// only invalid data will be output
	public String checkDeathDateBeforeCurrentForIndi(Individual indiO){
		try{
			String res = "";
			Calendar cal = Calendar.getInstance();
			int currentDay, currentMonth, currentYear;
			currentDay = cal.get(Calendar.DATE);
			currentMonth = cal.get(Calendar.MONTH)+1;
			currentYear = cal.get(Calendar.YEAR);
			if(indiO.getDeathDate() != null){
				String death = indiO.getDeathDate();
				int deathYear, deathMon, deathDay;
				String []deathNextLine = death.split("\\s+") ;
				deathDay = Integer.parseInt(deathNextLine[0]);
				deathMon = helper.transfMon(deathNextLine[1]);
				deathYear = Integer.parseInt(deathNextLine[2]);			
				if(deathYear < currentYear){
					res = "";
				}
				else if(deathYear == currentYear){
					if(deathMon < currentMonth){
						res = "";
					}
					else if(deathMon == currentMonth){
						if(deathDay <= currentDay){
							res = "";
						}
						else{
							res = "Data Invalid Report: Death Date is behind Current Date";
						}
					}
					else{
						res = "Data Invalid Report: Death Date is behind Current Date";
					}
				}
				else{
					res = "Data Invalid Report: Death Date is behind Current Date";
				}
			}
			return res;
		}
		catch(Exception e){
			return "";
		}
	}
	
	// check marriage date before current date
	// only invalid data will be output
	public String checkMarriageDateBeforeCurrentForFam(Family famO){
		try{
			String res = "";
			Calendar cal = Calendar.getInstance();
			int currentDay, currentMonth, currentYear;
			currentDay = cal.get(Calendar.DATE);
			currentMonth = cal.get(Calendar.MONTH)+1;
			currentYear = cal.get(Calendar.YEAR);
			if(famO.getWeddingDate() != null){
				String Wedd = famO.getWeddingDate();
				int weddYear, weddMon, weddDay;
				String []weddNextLine = Wedd.split("\\s+") ;
				weddDay = Integer.parseInt(weddNextLine[0]);
				weddMon = helper.transfMon(weddNextLine[1]);
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
							res = "Data Invalid Report: Marriage Date is behind Current Date";
						}
					}
					else{
						res = "Data Invalid Report: Marriage Date is behind Current Date";
					}
				}
				else{
					res = "Data Invalid Report: Marriage Date is behind Current Date";
				}
			}
			return res;
		}
		catch(Exception e){
			return "This family does not have marriage date information";
		}
	}
	
	// check divorce date before current date
	// only invalid data will be output
	public String checkDivorceDateBeforeCurrentForFam(Family famO){
		try{
			String res = "";
			Calendar cal = Calendar.getInstance();
			int currentDay, currentMonth, currentYear;
			currentDay = cal.get(Calendar.DATE);
			currentMonth = cal.get(Calendar.MONTH)+1;
			currentYear = cal.get(Calendar.YEAR);
			if(famO.getDivorceDate() != null){
				String Divor = famO.getDivorceDate();
				int divYear, divMon, divDay;
				String []divNextLine = Divor.split("\\s+") ;
				divDay = Integer.parseInt(divNextLine[0]);
				divMon = helper.transfMon(divNextLine[1]);
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
							res = "Data Invalid Report: Divorce Date is behind Current Date";
						}
					}
					else{
						res = "Data Invalid Report: Divorce Date is behind Current Date";
					}
				}
				else{
					res = "Data Invalid Report: Divorce Date is behind Current Date";
				}
			}
			return res;
		}
		catch(Exception e){
			return "";
		}
	}
	
	// check birth date before death date
	// only invalid data will be output
	public String checkBirthBeforeDeath(Individual indiO){
		try{
			String res ="";
			if(indiO.getBirthDate() != null && indiO.getDeathDate() != null){
				
				String birth = indiO.getBirthDate();
				int birthYear,birthMon,birthDay;  
				String death = indiO.getDeathDate();
				int deathYear, deathMon, deathDay;
				String []birnextLine = (birth.split("\\s+"));
				String []deanextLine = (death.split("\\s+"));
				birthDay = Integer.parseInt(birnextLine[0]);
				deathDay = Integer.parseInt(deanextLine[0]);
				birthMon = helper.transfMon(birnextLine[1]);
				deathMon = helper.transfMon(deanextLine[1]);
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
							res = "Data Invalid Report: Birth Date is behind Death Date";
						}
					}
					else{
						res = "Data Invalid Report: Birth Date is behind Death Date";
					}
				}
				else{
					res = "Data Invalid Report: Birth Date is behind Death Date";
				}
			}
			else if(indiO.getBirthDate() == null && indiO.getDeathDate() != null){
				res = "Data Invalid Report: Individual has a death date, no birth date";
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