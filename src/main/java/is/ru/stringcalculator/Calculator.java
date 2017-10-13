package is.ru.stringcalculator;

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
		for(String number : numbers)
		{
				total  += toInt(number);
		}
		return total;
	}

	private static String [] splitWords (String number)
	{
		String newLine = ",|\n";
		return number.split(newLine);
	}
}