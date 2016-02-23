package proj3;
import java.util.Random;

/**
 * <p>Title: Math questions generator   </p>
 * <p>Description: Generates two random numbers, determines which operation to perform,
 * 					performs the operation on the generated numbers and returns result. </p>
 * @author Saad Ahmad
 */

public class Question 
{
	private int num1;
	private int num2;
	private char operator;

	/**
	 * default constructor
	 * generates a random question
	 */
	public Question()
	{
		Random generator = new Random();
		int whichOperator = generator.nextInt(2);
		{
			if (whichOperator == 0)
			{
				operator = '+';
				num1 = generator.nextInt(13);
				num2 = generator.nextInt(13);
			}
			else
			{
				operator = '-';
				num1 = generator.nextInt(7)+6;
				num2 = generator.nextInt(num1+1);
			}
		}


	}

	/**
	 * toString method
	 * creates & returns a String with the generated question
	 * @return the state of the object
	 */
	public String toString()
	{
		String str = new String(num1 + " " + operator + " " + num2 + " =");
		return str;
	}

	/**
	 * determineAnswer method
	 * calculates the answer of the generated question
	 * @return result of the calculation
	 */
	public int determineAnswer()
	{
		int ans;
		if (operator == '+')
			ans = num1 + num2;
		else 
			ans = num1 - num2;
		return ans;
	}

	/**
	 * getOperator method
	 * @return the operator stored in the instance variable named operator 
	 */
	public char getOperator()
	{
		return operator;
	}
}
