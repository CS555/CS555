package Project;

import Data.Family;
import Data.Individual;

public class UserStories {
	
	public String Spr1_D(Family fam1, Family fam2) {
		Sprint1_Ding s = new Sprint1_Ding();
		return s.uniqueId_Spouse(fam1, fam2);
	}
	
	public String Spr1_D(Individual ind1,Individual ind2) {
		Sprint1_Ding s = new Sprint1_Ding();
		return s.uniqueId(ind1,ind2);
	}
	
	public String Spr2_D_B(Individual individualObject){
		Sprint2_Ding s = new Sprint2_Ding();
		return s.checkBirthDateBeforeCurrentForIndi(individualObject);
	}
	
	public String Spr2_D_D(Individual individualObject){
		Sprint2_Ding s = new Sprint2_Ding();
		return s.checkDeathDateBeforeCurrentForIndi(individualObject);
	}
	
	public String Spr2_D_M(Family familyObject){
		Sprint2_Ding s = new Sprint2_Ding();
		return s.checkMarriageDateBeforeCurrentForFam(familyObject);
	}
	
	public String Spr2_D_D(Family familyObject){
		Sprint2_Ding s = new Sprint2_Ding();
		return s.checkDivorceDateBeforeCurrentForFam(familyObject);
	}
		
	public String Spr2_D_US3(Individual individualObject){
		Sprint2_Ding s = new Sprint2_Ding();
		return s.checkBirthBeforeDeath(individualObject);
	}
	
	public String Spr1_Zhu(Individual ind1,Individual ind2) {

		Sprint1_Zhu s = new Sprint1_Zhu();
		return s.uniqueNaBir(ind1, ind2);
	}
	
	public String Spr1_Zhu(Individual ind1) {
		Sprint1_Zhu s = new Sprint1_Zhu();
		return s.listCurrentAge(ind1);
	}
	
	/*
	public String Spr2_Zhu(Family fam1, Family fam2) {
		Sprint2_Zhu s = new Sprint2_Zhu();
		return s.MarrBeforeDivo(fam1, fam2);
	}
	*/
}