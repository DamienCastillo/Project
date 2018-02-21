import java.util.ArrayList;

public class Database
	{
		static ArrayList<Card> history = new ArrayList<Card>();
		static ArrayList<Card> science = new ArrayList<Card>();
		static ArrayList<Card> sport = new ArrayList<Card>();

		public static void fred()
			{
				history();
				science();
				sports();
			}

		static void history()
			{
				history.add(new Card("When did World War I begin?" , "July 28, 1914"));
				history.add(new Card("When did World War I end?" , "November 11, 1918"));
				history.add(new Card("When did World War II begin?" , "September 1, 1939"));
				history.add(new Card("When did World War II end?" , "September 2, 1945"));
				history.add(new Card("What cities were nuked in Japan?" , "Hiroshima and Nagasaki"));
				history.add(new Card("Who invented the lightbulb?" , "answer"));
				history.add(new Card("When was slavery abolished in the United States?" , "December 6, 1865"));
				history.add(new Card("When did the American Civil War start?" , "April 12, 1865"));
				history.add(new Card("When did the American Civil War end?" , "May 13, 1865"));
				history.add(new Card("Who was the 33 president?" , "Harry S. Truman"));

			}

		static void science()
			{
				science.add(new Card("How many cells are produced in Mitosis?" , "2"));
				science.add(new Card("How many cells are produced in Meiosis?" , "4"));
				science.add(new Card("What does DNA mean?" , "Deoxyribonucleic Acid"));
				science.add(new Card("What does RNA mean?" , "Ribonucleic Acid"));
				science.add(new Card("What is the difference between a eukayotic and a prokaryotic cell? ", "Eukaaryotic cells have a nucleus"));
				science.add(new Card("Proteins are made of what?", "Amino acids"));
				science.add(new Card("What is diffusion?", "Going from an area of high to low concentration"));
				science.add(new Card("Carbohydrates are made of what? ", "Monosaccharide"));
				science.add(new Card("How many chromosomes do humans have all together?", "46"));
				science.add(new Card("Lipids are made of what?", "Fatty acids"));

			}

		static void sports()
			{
				sport.add(new Card("Who won Superbowl LII (52) ", "Eagles"));
				sport.add(new Card("What is the most watched sport? ", "Soccer"));
				sport.add(new Card("Who won the 2014 World Cup", "Germany"));
				sport.add(new Card("how many championships have Boston Celtics won? ", "17"));
				sport.add(new Card("What is the greatest regular season record in NBA history? ", "73-9"));
				sport.add(new Card("Who was the winner of the 2015 Cricket World Cup ", "Australia"));
				sport.add(new Card("What is the nickname for an American football?", "Pigskin"));
				sport.add(new Card("Who has won the most World Series titles in MLB history? ", "New York Yankees"));
				sport.add(new Card("Who has won the most Stanley Cup titles?", "Montreal Canadiens"));
				sport.add(new Card("Who has won the most medals in the Olympics?", "Micheal Phelps"));
			}
	}