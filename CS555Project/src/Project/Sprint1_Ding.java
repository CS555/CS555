package Project;

import Data.Family;
import Data.Individual;



public class Sprint1_Ding {
		
	public String uniqueId(Individual indiO1,Individual indiO2) {
		
		if(indiO1.getId().equals(indiO2.getId())) {
			return "Error Report: Same individual ID @" + indiO1.getId() +
					"with name: " + indiO1.getName() + indiO2.getName();
		}	
		return "";
	}
	
	public String uniqueId_Spouse(Family famO1,Family famO2) {
		if(famO1.getId().equals(famO2.getId())) {
			return "Error Report: Same family ID @" + famO1.getId()+ "@";
		}	
		if(famO1.getWife().equals(famO2.getWife()))	{
			return "Error Report: One wife(@" + famO1.getWife() + "@) two husband";
		}	

		if(famO1.getHusband().equals(famO2.getHusband())) {
			return "Error Report: One husband(@" + famO1.getHusband() + "@) two wife";
		}

		if(famO1.getWeddingDate().equals(famO2.getWeddingDate())) {
		    return "Error Report: Same marriage date" + famO1.getWeddingDate();
		}
		return "";
	}
}
