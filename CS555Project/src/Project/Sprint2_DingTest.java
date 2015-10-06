package Project;

import static org.junit.Assert.*;

import java.util.*;

import org.junit.Test;

import Data.Individual;
import Data.Family;

public class Sprint2_DingTest {
	
	Individual indi1= new Individual();
	Individual indi2= new Individual();
	Family fam1 = new Family();
	Family fam2 = new Family();
	Sprint2_Ding obj = new Sprint2_Ding();
	
	@Test
	public void testCheckBirthDatesBeforeCurrentForIndi() {
		indi1.setBirthDate("20 SEP 1993");
		assertEquals("Data Valid", obj.checkBirthDateBeforeCurrentForIndi(indi1));
		indi2.setBirthDate("29 OCT 2015");
		assertEquals("Data Invalid: Birth Date is behind Current Date", obj.checkBirthDateBeforeCurrentForIndi(indi2));
	}

	@Test
	public void testCheckDeathDateBeforeCurrentForIndi() {
		indi1.setDeathDate("20 SEP 1993");
		assertEquals("Data Valid", obj.checkDeathDateBeforeCurrentForIndi(indi1));
		indi2.setDeathDate("29 OCT 2015");
		assertEquals("Data Invalid: Death Date is behind Current Date", obj.checkDeathDateBeforeCurrentForIndi(indi2));
	}

	@Test
	public void testCheckMarriageDateBeforeCurrentForFam() {
		fam1.setWeddingDate("15 OCT 2014");
		assertEquals("Data Valid", obj.checkMarriageDateBeforeCurrentForFam(fam1));
		fam2.setWeddingDate("7 NOV 2015");
		assertEquals("Data Invalid: Marriage Date is behind Current Date", obj.checkMarriageDateBeforeCurrentForFam(fam2));
	}

	@Test
	public void testCheckDivorceDateBeforeCurrentForFam() {
		fam1.setDivorceDate("15 OCT 2004");
		assertEquals("Data Valid", obj.checkDivorceDateBeforeCurrentForFam(fam1));
		fam2.setDivorceDate("7 NOV 2016");
		assertEquals("Data Invalid: Divorce Date is behind Current Date", obj.checkDivorceDateBeforeCurrentForFam(fam2));
	}

	@Test
	public void testCheckBirthBeforeDeath() {
		indi1.setBirthDate("20 SEP 1993");
		indi1.setDeathDate("1 Jan 2093");
		assertEquals("Data Valid", obj.checkBirthBeforeDeath(indi1));
		indi2.setBirthDate("29 OCT 2015");
		indi2.setDeathDate("10 OCT 2005");
		assertEquals("Data Invalid: Birth Date is behind Death Date", obj.checkBirthBeforeDeath(indi2));
	}
}
