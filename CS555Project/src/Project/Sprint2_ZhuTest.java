package Project;

import static org.junit.Assert.*;

import org.junit.Test;

import Data.Family;

public class Sprint2_ZhuTest {

	
	Sprint2_Zhu obj = new Sprint2_Zhu();
	Family fam1 = new Family();
	Family fam2 = new Family();
	Family fam3 = new Family();
	
	@Test
	public void testMariBeforDiv() {
		fam1.setWeddingDate("22 AUG 1986");
		fam1.setDivorceDate("22 AUG 1981");
		
		fam2.setWeddingDate("22 AUG 1986");
		fam2.setDivorceDate("12 AUG 1986");
		
		fam3.setWeddingDate("22 OCT 1986");
		fam3.setDivorceDate("22 SEP 1986");
		
		assertEquals("Error! marriage should occur before divorce",obj.MarrBeforeDivo(fam1));
		assertEquals("Error! marriage should occur before divorce",obj.MarrBeforeDivo(fam2));
		assertEquals("Error! marriage should occur before divorce",obj.MarrBeforeDivo(fam3));
	}

}
