import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    // int[] input1 = { 3 };
    // assertArrayEquals(new int[]{ 3 }, input1);

    int[] input2 = {1,2,3 };
    ArrayExamples.reverseInPlace(input2);
    assertArrayEquals(new int[]{ 3,2,1 }, input2);
	}


  @Test
  public void testReversed() {
    int[] input1 = {1,2,3,4,5 };
    assertArrayEquals(new int[]{5,4,3,2,1 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testaveragewol() {
    double[] input1 = {1.0,1.0,2.0,3.0,4.0,5.0 };
    double awol = ArrayExamples.averageWithoutLowest(input1);
    double expected = 15.0/5.0;
    assertEquals(expected,awol,0.001);

  }

}
