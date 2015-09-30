package Project;

import static org.junit.Assert.*;

import org.junit.Test;

import Data.Individual;

public class Sprint1_ZhuTest {
	
	Sprint1_Zhu obj = new Sprint1_Zhu();
	Individual ind1 = new Individual();
	Individual ind2 = new Individual();
	Individual ind3 = new Individual();
	
	
	@Test
	public void testUniqueNaBir() {
		ind1.setBirthDate("16 SEP 1960");
		ind1.setName("Tom");
		ind1.setId("01");
		ind2.setBirthDate("13 JUN 1923");
		ind2.setName("Jim");
		ind2.setId("02");
		ind3.setBirthDate("16 SEP 1960");
		ind3.setName("Jim");
		ind3.setId("03");
		
		assertEquals("",obj.uniqueNaBir(ind1, ind2));
		assertEquals("Same individual Name" + ind2.getName() +
				"with ID: " + ind2.getId() + ind3.getId(),obj.uniqueNaBir(ind2, ind3));
		assertEquals("Same individual birth date" + ind1.getBirthDate() +
				"with Name: " + ind1.getName() + ind3.getGivenName(),obj.uniqueNaBir(ind1, ind3));	
	}
	
	@Test
	public void testlistCurrentAge() {
		ind1.setBirthDate("16 SEP 1960");
		ind1.setName("Tom");
		ind1.setId("01");
		ind2.setBirthDate("13 JUN 2000");
		ind2.setName("Jim");
		ind2.setId("02");
		ind3.setName("Tina");
		
		assertEquals("Age: " + 55, obj.listCurrentAge(ind1));
		assertEquals("Age: " + 15, obj.listCurrentAge(ind2));
		assertEquals("This individual does not have a birth date", obj.listCurrentAge(ind3));
	}
}
