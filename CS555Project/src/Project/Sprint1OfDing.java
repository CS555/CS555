package Project;

import Data.Family;



public class Sprint1OfDing {
		
	public void uniqueId(Family familyObject1,Family familyObject2) {
		
		if(familyObject1.getId().equals(familyObject2.getId())) {
			System.out.println("US22 error,same family ID @" + familyObject1.getId()+ "@");
		}	
	}
	
	public void uniqueSpouse(Family familyObject1,Family familyObject2) {
		if(familyObject1.getWife().equals(familyObject2.getWife()))	{
			System.out.println("US24 error, one wife(@" + familyObject1.getWife() + "@) two husband");
		}	

		if(familyObject1.getHusband().equals(familyObject2.getHusband())) {
			System.out.println("US24 error, one husband(@" + familyObject1.getHusband() + "@) two wife");
		}

		if(familyObject1.getWeddingDate().equals(familyObject2.getWeddingDate())) {
			System.out.println("US24 error, same marriage date" + familyObject1.getWeddingDate() );
		}
	}
	
}
