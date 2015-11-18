package Project;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Data.Family;
import Data.Individual;


public class Sprint4_Zhu {
	Helper help = new Helper();
	
	//List upcoming anniversaries
	//this function We considerd the leap year and the different total days in each month
	public String ListUpAnniver(Family fam) {
		String s="";
		try {
			if(!fam.getWeddingDate().isEmpty()) {
				String marD = fam.getWeddingDate();
				int maryear,marmon,marday;
				String []marline = (marD.split("\\s+"));		
				maryear = Integer.parseInt(marline[2]);
				marmon = help.transfMon(marline[1]);
				marday = Integer.parseInt(marline[0]);
				
				Calendar cal=new GregorianCalendar();
				cal.add(Calendar.DATE, 30);
				int maxMon,maxDay;                             
				maxMon = cal.get(Calendar.MONTH)+1;
				maxDay=cal.get(Calendar.DATE);
				
				Calendar cal1 = Calendar.getInstance();
				int currentYear,currentMon,currentDay;                             
				currentYear = cal1.get(Calendar.YEAR);
				currentMon = cal1.get(Calendar.MONTH)+1;
				currentDay=cal1.get(Calendar.DATE); 		
				if(maryear < currentYear) {
					if(marmon == currentMon) {
						if(marday>currentDay)
							s = "Upcoming marriage anniversaries is: " + fam.getWeddingDate();
					}
					if(marmon == currentMon+1) {
						if(marday<= maxDay) {
							s = "Upcoming marriage anniversaries is: " + fam.getWeddingDate();
						}
					}
					if(marmon == maxMon && marmon==1&&currentMon==12) {
						if(marday<= maxDay) {
							s = "Upcoming marriage anniversaries is: " + fam.getWeddingDate();
						}
					}
				}
				else if(maryear == currentYear) {
					if(marmon == maxMon && marmon==1&&currentMon==12) {
						if(marday<= maxDay) {
							s = "Upcoming marriage anniversaries is: " + fam.getWeddingDate();
						}
					}
				}
			}
		}
		catch(Exception e){   //avoid no marriage data.
			return s;
		}		
		return s;
	}
	
	//List recent births
	//this function We considerd the leap year and the different total days in each month
	public String ListRecBir(Individual ind)
	{
		String s="";
		try {
			if(ind.getBirthDate()!=null) {
				String indD = ind.getBirthDate();
				int indYear,indMon,indDay;
				String []indline = (indD.split("\\s+"));		
				indYear = Integer.parseInt(indline[2]);
				indMon = help.transfMon(indline[1]);
				indDay = Integer.parseInt(indline[0]);
				
				Calendar cal=new GregorianCalendar();
				cal.add(Calendar.DATE, -30);
				int minMon,minDay;                             
				minMon = cal.get(Calendar.MONTH)+1;
				minDay=cal.get(Calendar.DATE);
				//minYear = cal.get(Calendar.YEAR);
				
				Calendar cal1 = Calendar.getInstance();
				int currentYear,currentMon,currentDay;                             
				currentYear = cal1.get(Calendar.YEAR);
				currentMon = cal1.get(Calendar.MONTH)+1;
				currentDay=cal1.get(Calendar.DATE); 	
				
				if(indYear == currentYear) {
					if(indMon == currentMon) {
						if(indDay<currentDay)
							s = ind.getName() + " was born in last 30 days";
					}
					if(indMon == currentMon-1) {
						if(indDay>= minDay) {
							s = ind.getName() + " was born in last 30 days";
						}
					}
				}
				else if(indYear == currentYear-1) {
					if(indMon == minMon && indMon==12&&currentMon==1) {
						if(indDay>= minDay) {
							s = ind.getName() + " was born in last 30 days";
						}
					}
				}
			}
		}
		catch(Exception e){   //avoid no birth data.
			return s;
		}		
		return s;
	}
}
