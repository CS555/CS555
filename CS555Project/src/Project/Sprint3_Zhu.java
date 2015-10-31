package Project;

import Data.Family;
import Data.Individual;

public class Sprint3_Zhu {
	
	Helper help = new Helper();
	public String DivorBeforeDeath(Family fam, Individual ind, Individual ind1)
	{
		String s="";
		try {
			if(!fam.getDivorceDate().isEmpty()) {
				String divD = fam.getDivorceDate();
				int divyear,divmon,divday;
				String []divline = (divD.split("\\s+"));
				divyear = Integer.parseInt(divline[2]);
				divmon = help.transfMon(divline[1]);
				divday = Integer.parseInt(divline[0]);
				String indD = ind.getDeathDate();
				String ind1D = ind1.getDeathDate();
				if(indD!=null)
				{
					String []indline = (indD.split("\\s+"));
					int indyear,indmon,indday;
					indyear = Integer.parseInt(indline[2]);
					indmon = help.transfMon(indline[1]);
					indday = Integer.parseInt(indline[0]);
					if(divyear > indyear)
						s = "Data Invalid Report: Divorce should occur before death";
					else if(divyear == indyear)	{
						if(divmon > indmon)
							s = "Data Invalid Report: Divorce should occur before death";
						else if(divmon == indmon) {
							if(divday >= indday)
								s = "Data Invalid Report: Divorce should occur before death";
						}
					}
				}
				if(ind1D!=null)
				{
					String []ind1line = (ind1D.split("\\s+"));
					int ind1year,ind1mon,ind1day;		
					ind1year = Integer.parseInt(ind1line[2]);
					ind1mon = help.transfMon(ind1line[1]);
					ind1day = Integer.parseInt(ind1line[0]);
					if(divyear > ind1year)
						s = "Data Invalid Report: Divorce should occur before death";
					else if(divyear == ind1year)	{
						if(divmon > ind1mon)
							s = "Data Invalid Report: Divorce should occur before death";
						else if(divmon == ind1mon) {
							if(divday >= ind1day)
								s = "Data Invalid Report: Divorce should occur before death";
						}
					}
				}
			}
			return s;	
		}
		catch(Exception e){   //avoid no marriage and divorce data.
			return s;
		}		
	}
	
	public String CurrectGender(Family fam, Individual ind, Individual ind1)
	{
		String s="";
		if(ind.getSex()=='F')
			s = "Data Invalid Report: Husband(" + ind.getId() + ") in family " + fam.getId() + " is female";
		if(ind1.getSex()=='M')
		{
			if(s.length() == 0)
				s = "Data Invalid Report: Wife in family " + fam.getId() + " is male";
			else
			{
				String newLine = System.getProperty("line.separator"); 
				s = s + newLine + "Data Invalid Report: Wife(" + ind1.getId() + ") in family " + fam.getId() + " is male";
			}
		}
		return s;	
	}
}
