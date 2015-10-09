package Project;

import Data.Family;

public class Sprint2_Zhu {
	
	public String MarrBeforeDivo(Family fam)
	{
		String s="";
		
		try {
			if(!fam.getWeddingDate().isEmpty()) {
				String marD = fam.getWeddingDate();
				if(!fam.getDivorceDate().isEmpty()) {
					String divD = fam.getDivorceDate();
					int maryear,marmon,marday;
					int divyear,divmon,divday;
					String []marline = (marD.split("\\s+"));	
					String []divline = (divD.split("\\s+"));	
					maryear = Integer.parseInt(marline[2]);
					marmon = transfMon(marline[1]);
					marday = Integer.parseInt(marline[0]);
					divyear = Integer.parseInt(divline[2]);
					divmon = transfMon(divline[1]);
					divday = Integer.parseInt(divline[0]);
					if(maryear > divyear)
						s = "Error! marriage should occur before divorce";
					else if(maryear == divyear)	{
						if(marmon > divmon)
							s = "Error! marriage should occur before divorce";
						else if(marmon == divmon) {
							if(marday >= divday)
								s = "Error! marriage should occur before divorce";
						}
					}
				}
			}
			return s;	
		}
		catch(Exception e){
			return s;
		}
	}
	
	public int transfMon(String mon) {
		if(mon.equals("JAN"))
			return 1;
		else if(mon.equals("FEB"))
			return 2;
		else if(mon.equals("MAR"))
			return 3;
		else if(mon.equals("APR"))
			return 4;
		else if(mon.equals("MAY"))
			return 5;
		else if(mon.equals("JUN"))
			return 6;
		else if(mon.equals("JUL"))
			return 7;
		else if(mon.equals("AUG"))
			return 8;
		else if(mon.equals("SEP"))
			return 9;
		else if(mon.equals("OCT"))
			return 10;
		else if(mon.equals("NOV"))
			return 11;
		else
			return 12;
	}
	
}
