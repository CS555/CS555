package Project;

import java.util.List;

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
	
	public String Spr3_Ding_US2(Individual individualObject){
		Sprint3_Ding s = new Sprint3_Ding();
		return s.checkBirthBeforeMarr(individualObject);
	}
	
	public String Spr3_Ding_US7(Individual individualObject){
		Sprint3_Ding s = new Sprint3_Ding();
		return s.currentAgeCheck(individualObject);
	}
	
	public String Spr4_Ding_US10(Individual individualObject){
		Sprint4_Ding s = new Sprint4_Ding();
		return s.checkMarriageAfter14(individualObject);
	}
	
	public List<String> Spr4_Ding_US38(Individual individualObject){
		Sprint4_Ding s = new Sprint4_Ding();
		return s.checkUpcomingBirthdays(individualObject);
	}
	
	public String Spr1_Zhu_U23(Individual ind1,Individual ind2) {

		Sprint1_Zhu s = new Sprint1_Zhu();
		return s.uniqueNaBir(ind1, ind2);
	}
	
	public String Spr1_Zhu_U27(Individual ind1) {
		Sprint1_Zhu s = new Sprint1_Zhu();
		return s.listCurrentAge(ind1);
	}
	
	public String Spr2_Zhu_U04(Family fam) {
		Sprint2_Zhu s = new Sprint2_Zhu();
		return s.MarrBeforeDivo(fam);
	}
	
	public String Spr2_Zhu_U05(Family fam, Individual ind1,Individual ind2) {
		Sprint2_Zhu s = new Sprint2_Zhu();
		return s.MarrBeforeDeath(fam,ind1,ind2);
	}
	public String Spr3_Zhu_U06(Family fam, Individual ind1,Individual ind2) {
		Sprint3_Zhu s = new Sprint3_Zhu();
		return s.DivorBeforeDeath(fam,ind1,ind2);
	}
	public String Spr3_Zhu_U21(Family fam, Individual ind1, Individual ind2) {
		Sprint3_Zhu s = new Sprint3_Zhu();
		return s.CurrectGender(fam,ind1,ind2);
	}
}