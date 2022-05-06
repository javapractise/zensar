import java.util.*;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;
import org.junit.Test;
import com.mavenpractise.Program;

public class ProjectTest {
	
	

	
	@Test
	public void testTwoStrings() {
		assertEquals("Equal", Program.twoString("abcd", "abcd"));
	}
	
	@Test
	public void testLessThan20() {
		assertTrue("Element in array is less than 20", Program.LessThan20(new int[]{21, 60, 44, 37, 58}));
	}
	
	@Test
	public void testTwoStringBuffer() {
		assertTrue("Strings are not equal", Program.twoStringBuffer(new StringBuffer("Hello"), new StringBuffer("Hello")));
	}
	
	@Test
	public void testFindMaximunInArray() {
		assertEquals(10, Program.findMaximunInArray(new int[] {1, 3, 5, 6, 9, 10, 2}));
	}

}