
public class Card
	{
		String questions;
		String answers;
		
		public Card(String q, String a){
			questions = q;
			answers = a;
			}
		public String getQuestions()
			{
				return questions;
			}

		public void setQuestions(String questions)
			{
				this.questions = questions;
			}

		public String getAnswers()
			{
				return answers;
			}

		public void setAnswers(String answers)
			{
				this.answers = answers;
			}
	}
