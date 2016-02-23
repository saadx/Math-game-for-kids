package proj3;
import javax.swing.JOptionPane;

/**
 * <p>Title: Math Game  </p>
 * <p>Description: Displays math question and accepts answers, check if the answers are correct
 * 					or incorrect, keeps record of no of correct and incorrect answers and percentage
 * 					 and displays report after the game ends. </p>
 * @author Saad Ahmad
 */

public class Project4App 
{
	public static void main (String args[])
	{
		int addRight = 0;
		int addWrong = 0;
		int subRight = 0;
		int subWrong = 0;

//		for (int i=0; i < 15; i++)
//		{
//			Question gameQues = new Question();
//			int stuAns = Integer.parseInt(JOptionPane.showInputDialog("What is the result\n" + gameQues.toString()));
//
//			if (gameQues.getOperator() == '+')
//			{
//				if (gameQues.determineAnswer() == stuAns)
//				{
//					addRight++;
//					JOptionPane.showMessageDialog(null,"Congratulations! You got it correct.");
//				}
//				else
//				{
//					addWrong++;
//					JOptionPane.showMessageDialog(null,"The correct answer for\n" + gameQues.toString() + "\nis\n" + gameQues.determineAnswer());
//				}
//			}
//			else 
//			{
//				if (gameQues.determineAnswer() == stuAns)
//				{
//					subRight++;
//					JOptionPane.showMessageDialog(null,"Congratulations! You got it correct.");
//				}
//				else
//				{
//					subWrong++;
//					JOptionPane.showMessageDialog(null,"The correct answer for\n" + gameQues.toString() + "\nis\n" + gameQues.determineAnswer());
//				}
//			}
//		}
//
//		JOptionPane.showMessageDialog(null,"Addition:\n" + "You got " + addRight + " correct and " + addWrong +
//				" incorrect.\n" + "Substraction:\n" + "You got " + subRight + " correct and " + subWrong + 
//				" incorrect.\n" + "The percent correct is " + (Math.round((((addRight+subRight)*100)/15.0)*100.0)/100.0));
		
		//variable to determine whether first 10 questions are answered correctly
		int correct10 = 0;
		//variable to stop the loop by making the condition false
		int stop =0;
		//loop variable; declared here because its value is used to calculate percentage outside the block
		int i;
		double percentage = 0;
		
		//main loop
		for (i=0; (i < 25) && (stop != 1); i++)
		{
			//asks atleast 10 questions
			if (i < 10)
			{
				Question gameQues = new Question();
				int stuAns = Integer.parseInt(JOptionPane.showInputDialog("What is the result\n" + gameQues.toString()));
				if (gameQues.getOperator() == '+')
				{
					if (gameQues.determineAnswer() == stuAns)
					{
						addRight++;
						JOptionPane.showMessageDialog(null,"Congratulations! You got it correct.");
						correct10++;
					}
					else
					{
						addWrong++;
						JOptionPane.showMessageDialog(null,"The correct answer for\n" + gameQues.toString() + "\nis\n" + gameQues.determineAnswer());
					}
				}
				else 
				{
					if (gameQues.determineAnswer() == stuAns)
					{
						subRight++;
						JOptionPane.showMessageDialog(null,"Congratulations! You got it correct.");
						correct10++;
					}
					else
					{
						subWrong++;
						JOptionPane.showMessageDialog(null,"The correct answer for\n" + gameQues.toString() + "\nis\n" + gameQues.determineAnswer());
					}
				}
				
				percentage = (((addRight+subRight)*100.0)/(i+1));
			}
			//checks if first 10 questions are correct and if they are loops is ended by making test condition false.
			else if (correct10 == 10)
			{
				JOptionPane.showMessageDialog(null,"Congratulations! You got first 10 questions correct. \nGame Ends");
				stop = 1;
			}
			//continues asking questions if percentage is less than 80% after first 10 questions
			else if (percentage < 80)
			{
				Question gameQues = new Question();
				int stuAns = Integer.parseInt(JOptionPane.showInputDialog("What is the result\n" + gameQues.toString()));
				if (gameQues.getOperator() == '+')
				{
					if (gameQues.determineAnswer() == stuAns)
					{
						addRight++;
						JOptionPane.showMessageDialog(null,"Congratulations! You got it correct.");
					}
					else
					{
						addWrong++;
						JOptionPane.showMessageDialog(null,"The correct answer for\n" + gameQues.toString() + "\nis\n" + gameQues.determineAnswer());
					}
				}
				else
				{
					if (gameQues.determineAnswer() == stuAns)
					{
						subRight++;
						JOptionPane.showMessageDialog(null,"Congratulations! You got it correct.");
					}
					else
					{
						subWrong++;
						JOptionPane.showMessageDialog(null,"The correct answer for\n" + gameQues.toString() + "\nis\n" + gameQues.determineAnswer());
					}
				}
				percentage = (((addRight+subRight)*100.0)/(i+1));
			}
			//if 10 questions are asked and first 10 are not correct and percentage is >80% then loop is ended by making test condition false.
			else
			{
				JOptionPane.showMessageDialog(null,"Congratulations! You got more than or equal to 80% of questions correct. \nGame Ends");	
				stop = 1;
			}
		}
		//final result
		JOptionPane.showMessageDialog(null,"Addition:\n" + "You got " + addRight + " correct and " + addWrong +
								" incorrect.\n" + "Substraction:\n" + "You got " + subRight + " correct and " + subWrong + 
								" incorrect.\n" + "The percent correct is " + (Math.round((((addRight+subRight)*100)/(i-1))*100.0)/100.0));
	}
}
