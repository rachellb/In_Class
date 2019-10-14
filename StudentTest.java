import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StudentTest {

	
	@Before
	public void setup() throws Exception {
	}
	@Test
	public void testStudent() {
		Student s;
		try {
			s = new Student();
		
		Integer rating = s.getRating();
		Integer expected = 5;
		assertEquals(expected, rating);
		} catch (NameException e) {
			fail("Not yet implemented");
		}
		
	}

	@Test
	public void testCompareTo() {
		fail("Not yet implemented");
	}

}
