package is.ru.stringcalculator;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest 
{
	@Test
	public void testEmptyString()
	{
		assertEquals(0, Calculator.add(""));
	}

	@Test
	public void testOneNumber()
	{
		assertEquals(1, Calculator.add("1"));
	}

	@Test
	public void testTwoNumbers()
	{
		assertEquals(3, Calculator.add("1,2"));
	}

	@Test
	public void testThreeNumbers()
	{
		assertEquals(6, Calculator.add("1,2,3"));
	}

	@Test
	public void testTenNumbers()
	{
		assertEquals(100, Calculator.add("10,5,2,3,20,15,6,4,25,10"));
	}

	@Test
	public void testNewLineBetweenNumbers()
	{
		assertEquals(6, Calculator.add("1\n2,3"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestForExpectedExceptionWithNegativity()
	{
		Calculator.add("1,-2,3,4");
	}
}