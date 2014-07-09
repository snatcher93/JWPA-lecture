package grade;

import static org.junit.Assert.*;

import org.junit.Test;

public class StudentTest {
	@Test
	public void grade() {
		Lecture lecture = new Lecture(80, 90, 75);
		
		String grade = lecture.grade();
		
		assertEquals("A:1 B:1 C:1 D:0 F:0 ", grade);
	}

}
