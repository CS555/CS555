package Project;

import Data.Family;
import Data.Individual;

public class Sprint2_Zhu {
	
	Helper help = new Helper();
	
	//check Marriage before divorce
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
					marmon = help.transfMon(marline[1]);
					marday = Integer.parseInt(marline[0]);
					divyear = Integer.parseInt(divline[2]);
					divmon = help.transfMon(divline[1]);
					divday = Integer.parseInt(divline[0]);
					if(maryear > divyear)
						s = "Data Invalid Report: Marriage should occur before divorce";
					else if(maryear == divyear)	{
						if(marmon > divmon)
							s = "Data Invalid Report: Marriage should occur before divorce";
						else if(marmon == divmon) {
							if(marday >= divday)
								s = "Data Invalid Report: Marriage should occur before divorce";
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
	
	//check Marriage before death
	public String MarrBeforeDeath(Family fam, Individual ind, Individual ind1)
	{
		String s="";
		try {
			if(!fam.getWeddingDate().isEmpty()) {
				String marD = fam.getWeddingDate();
				int maryear,marmon,marday;
				String []marline = (marD.split("\\s+"));
				maryear = Integer.parseInt(marline[2]);
				marmon = help.transfMon(marline[1]);
				marday = Integer.parseInt(marline[0]);
				String indD = ind.getDeathDate();
				String ind1D = ind1.getDeathDate();
				if(indD!=null)
				{
					String []indline = (indD.split("\\s+"));
					int indyear,indmon,indday;
					indyear = Integer.parseInt(indline[2]);
					indmon = help.transfMon(indline[1]);
					indday = Integer.parseInt(indline[0]);
					if(maryear > indyear)
						s = "Data Invalid Report: Marriage should occur before death";
					else if(maryear == indyear)	{
						if(marmon > indmon)
							s = "Data Invalid Report: Marriage should occur before death";
						else if(marmon == indmon) {
							if(marday >= indday)
								s = "Data Invalid Report: Marriage should occur before death";
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
					if(maryear > ind1year)
						s = "Data Invalid Report: Marriage should occur before death";
					else if(maryear == ind1year)	{
						if(marmon > ind1mon)
							s = "Data Invalid Report: Marriage should occur before death";
						else if(marmon == ind1mon) {
							if(marday >= ind1day)
								s = "Data Invalid Report: Marriage should occur before death";
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
}
