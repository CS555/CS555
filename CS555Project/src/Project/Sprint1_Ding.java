package Project;

import Data.Family;
import Data.Individual;



public class Sprint1_Ding {
		
	public String uniqueId(Individual individualObject1,Individual individualObject2) {
		
		if(individualObject1.getId().equals(individualObject2.getId())) {
			return "Error Report: Same individual ID @" + individualObject1.getId() +
					"with name: " + individualObject1.getName() + individualObject2.getName();
		}	
		return "";
	}
	
	public String uniqueId_Spouse(Family familyObject1,Family familyObject2) {
		if(familyObject1.getId().equals(familyObject2.getId())) {
			return "Error Report: Same family ID @" + familyObject1.getId()+ "@";
		}	
		if(familyObject1.getWife().equals(familyObject2.getWife()))	{
			return "Error Report: One wife(@" + familyObject1.getWife() + "@) two husband";
		}	

		if(familyObject1.getHusband().equals(familyObject2.getHusband())) {
			return "Error Report: One husband(@" + familyObject1.getHusband() + "@) two wife";
		}

		if(familyObject1.getWeddingDate().equals(familyObject2.getWeddingDate())) {
		    return "Error Report: Same marriage date" + familyObject1.getWeddingDate();
		}
		return "";
	}
}
