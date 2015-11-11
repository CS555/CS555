package Project;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import Data.Family;
import Data.Individual;



//this function We considerd the leap year and the different total days in each month
public class Sprint4_Zhu {
	Helper help = new Helper();
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
	public String ListRecBir(Individual ind)
	{
		String s="";
		return s;
	}
}
