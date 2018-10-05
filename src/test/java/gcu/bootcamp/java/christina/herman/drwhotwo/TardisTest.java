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
		DrWho doctor = tardis.buildDoctor(doctorNum);
		
		actualRsult = doctor.getYear();
		
		assertEquals(exectedResult, actualRsult);
		
	}	
	@Test
	public void testDoctorsAge() {
		int doctorNum = 3; 
		exectedResult = 1353; 
		DrWho doctor = tardis.buildDoctor(doctorNum);
		
		actualRsult = doctor.getAge();
		
		assertEquals(exectedResult, actualRsult);
		
	}
	
	
	
	

}
