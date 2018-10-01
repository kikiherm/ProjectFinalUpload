package gcu.bootcamp.java.christina.herman.drwhotwo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import gcu.bootcamp.java.christina.herman.drwhotwo.Tardis;

public class TardisTest {
	int exectedResult;
	int actualRsult;
	
	Tardis tardis = new Tardis("Tardis");
	
	@Test
	public void testFindTheYear() {
		int doctorNum = 1; 
		exectedResult = 1963; 
		actualRsult = tardis.findTheYear(doctorNum);
		
		assertEquals(exectedResult, actualRsult);
		
	}

}
