package is.ru.stringcalculator;

import java.util.ArrayList;
import java.util.List;

public class Calculator
{
	public static int add(String text)
	{
		if(text.equals(""))
		{
			return 0;
		}
		else
		{
			if(text.contains(","))
			{
				return sum(splitWords(text));
			}
			return 1;
		}
	}

	private static int toInt(String number)
	{
		return Integer.parseInt(number);
	}

	private static int sum(String [] numbers)
	{
		int total = 0;
		List<Integer> negativity = new ArrayList<Integer>();
		for(String number : numbers)
		{
			int i = toInt(number);
			if(0 > i)
			{
				negativity.add(i);
			}
			else
			{
				total  += i;
			}
		}

		if(negativity.size() > 0)
		{
			throw new IllegalArgumentException("Negatives not allowed: " + negativity);
		}

		return total;
	}

	private static String [] splitWords (String number)
	{
		String newLine = ",|\n";
		return number.split(newLine);
	}
}