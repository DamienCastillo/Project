import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Quizzer extends JFrame
	{
		private static final long serialVersionUID = 1L;
		static String name;
		static String answer;
		static int subject;
		static JFrame frame = new JFrame();

		public static void main(String[] args)
			{
				Database.fred();
				int questionsCorrect = 0;
				int questionsWrong = 0;
				// takes input
				name = JOptionPane.showInputDialog("What is your name?");

				// responds to input above
				JOptionPane.showMessageDialog(frame, "Hi, " + name);

				// buttons
				Object[] options =
					{ "History", "Science", "Sports" };
				subject = JOptionPane.showOptionDialog(frame, "What subject do you want to study?", "Study Set",
						JOptionPane.YES_NO_CANCEL_OPTION, JOptionPane.QUESTION_MESSAGE, null, options, options[2]);
				for (int i = 0; i < 10; i++)
					{
						if (subject == 0)
							{
								Database.history();
								answer = JOptionPane.showInputDialog(Database.history.get(i).getQuestions());
							} else if (subject == 1)
							{
								Database.science();
								answer = JOptionPane.showInputDialog(Database.science.get(i).getQuestions());
							} else if (subject == 2)
							{
								Database.sports();
								answer = JOptionPane.showInputDialog(Database.sport.get(i).getQuestions());
							}

						if (answer.equals(Database.sport.get(i).getAnswers())
								|| answer.equals(Database.history.get(i).getAnswers())
								|| answer.equals(Database.science.get(i).getAnswers()))
							{
								JOptionPane.showMessageDialog(frame, "Correct!");
								questionsCorrect++;
							} else
							{
								JOptionPane.showMessageDialog(frame, "Wrong Answer!");
								questionsWrong++;
							}
					}
					//final results
				if (questionsCorrect == 10)
					{
						JOptionPane.showMessageDialog(frame, "Perfect Score!");
					} 
				else if (questionsCorrect >= 7 && questionsCorrect < 10)
					{
						JOptionPane.showMessageDialog(frame,
								"You got " + questionsCorrect + " questions correct, and " + questionsWrong + " wrong. You did pretty good.");
					}
				else if (questionsCorrect >= 5 && questionsCorrect < 7)
					{
						JOptionPane.showMessageDialog(frame,
								"You got " + questionsCorrect + " questions correct, and " + questionsWrong + " wrong. You should study some more.");
					}
				else if (questionsCorrect >= 1 && questionsCorrect < 5)
					{
						JOptionPane.showMessageDialog(frame, 
								"You got " + questionsCorrect + " questions correct, and " + questionsWrong + " wrong. You really need to study.");
					}
				else if (questionsCorrect == 0 )
					{
						JOptionPane.showMessageDialog(frame,
								"You got " + questionsCorrect + " questions correct, and " + questionsWrong + " wrong. If you dont study you will fail.");
					}

			}
	}