package Project;

import Data.Family;

public class Sprint2_Zhu {
	
	public String MarrBeforeDivo(Family fam)
	{
		try {
		String s="";
		if(!fam.getWeddingDate().isEmpty()) {
			String marD = fam.getWeddingDate();
			if(!fam.getDivorceDate().isEmpty()) {
				String divD = fam.getDivorceDate();
				int maryear,marmon,marday;
				int divyear,divmon,divday;
				String []marline = (marD.split("\\s+"));	
				String []divLine = (divD.split("\\s+"));	
				maryear = Integer.parseInt(s);
				
			}
			
			}
			return s;	
		}
		catch(Exception e){
			return "This family does not have marriage date information";
		}
	}
	
}
