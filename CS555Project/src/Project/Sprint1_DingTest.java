package Project;

import static org.junit.Assert.*;

import org.junit.Test;
import Data.Family;
import Data.Individual;

public class Sprint1_DingTest {

	Sprint1_Ding obj = new Sprint1_Ding();
	Individual ind1 = new Individual();
	Individual ind2 = new Individual();
	Individual ind3 = new Individual();
	Family fam1 = new Family();
	Family fam2 = new Family();
	Family fam3 = new Family();
	Family fam4 = new Family();
	Family fam5 = new Family();
	Family fam6 = new Family();
	
	@Test
	public void testUniqueId() {
		ind1.setId("12");
		ind1.setName("Joe");
		ind2.setId("14");
		ind2.setName("John");
		ind3.setId("12");
		ind3.setName("Jason");
		assertEquals("",obj.uniqueId(ind1, ind2));
		assertEquals("US22 error,same individual ID @" + ind1.getId() + "with name: " 
		+ ind1.getName() + ind3.getName(), obj.uniqueId(ind1, ind3));
	}
	
	@Test
	public void testUniqueId_Spouse() {
		fam1.setId("1");
		fam1.setWife("Emily");
		fam1.setHusband("Jason");
		fam1.setWeddingDate("98-09-01");
		
		fam2.setId("2");
		fam2.setWife("Emily");
		fam2.setHusband("John");
		fam2.setWeddingDate("99-01-02");
		
		fam3.setId("3");
		fam3.setWife("Danielle");
		fam3.setHusband("Jason");
		fam3.setWeddingDate("00-01-02");
		
		fam4.setId("4");
		fam4.setWife("Danielle");
		fam4.setHusband("John");
		fam4.setWeddingDate("98-09-01");
		
		fam5.setId("1");
		fam5.setWife("Danielle");
		fam5.setHusband("John");
		fam5.setWeddingDate("98-09-30");
		
		fam6.setId("5");
		fam6.setWife("Dee");
		fam6.setHusband("John");
		fam6.setWeddingDate("99-09-01");
		
		assertEquals("US24 error, one wife(@" + fam1.getWife() + "@) two husband", obj.uniqueId_Spouse(fam1, fam2));
		assertEquals("US24 error, one husband(@" + fam1.getHusband() + "@) two wife", obj.uniqueId_Spouse(fam1, fam3));
		assertEquals("US24 error, same marriage date" + fam1.getWeddingDate(), obj.uniqueId_Spouse(fam1, fam4));
		assertEquals("US22 error,same family ID @" + fam1.getId()+ "@", obj.uniqueId_Spouse(fam1, fam5));
		assertEquals("", obj.uniqueId_Spouse(fam1, fam6));
		
		
	}

}