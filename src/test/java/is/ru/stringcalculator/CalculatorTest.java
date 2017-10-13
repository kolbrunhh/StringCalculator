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

	@Test
	public void testAnotherNewLineBetweenNumbers()
	{
		assertEquals(6, Calculator.add("1,2,3\n"));
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestForExpectedExceptionWithNegativity()
	{
		Calculator.add("1,-2,3,4");
	}

	@Test(expected = IllegalArgumentException.class)
	public void TestForAnotherExpectedExceptionWithNegativity()
	{
		Calculator.add("-10,6,100");
	}

	@Test
	public void testNumbersLessThan1000()
	{
		assertEquals(5, Calculator.add("2000,1001,2,3"));
	}

	@Test
	public void testDifferentDelimiter()
	{
		assertEquals(3, Calculator.add("//;\n1;2"));
	}

	@Test
	public void testAnotherDifferentDelimiter()
	{
		assertEquals(5, Calculator.add("//!\n1!2!2"));
	}
}