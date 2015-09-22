package Project;

import Data.Family;
import Data.Individual;

public class UserStories {
	
	public void Spr1_D(Family familyObject1, Family familyObject2) {
		Sprint1_Ding s = new Sprint1_Ding();
		s.uniqueId(familyObject1,familyObject2);
		s.uniqueSpouse(familyObject1, familyObject2);
	}
	
	public void Spr1_D(Individual individualObject1,Individual individualObject2) {
		Sprint1_Ding s = new Sprint1_Ding();
		s.uniqueId(individualObject1,individualObject2);
	}
}
