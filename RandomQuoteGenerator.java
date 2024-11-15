package Fun_Code;

import java.util.Random;

public class RandomQuoteGenerator {

	public static void main(String[] args) {
		String[] quotes= {
				"The only limit to our realization of tomorrow is our doubts of today. — Franklin D. Roosevelt",
				"Believe you can and you're halfway there. — Theodore Roosevelt",
				"Don’t watch the clock; do what it does. Keep going. — Sam Levenson",
				"The future belongs to those who believe in the beauty of their dreams. — Eleanor Roosevelt",
				"You are never too old to set another goal or to dream a new dream. — C.S. Lewis"
		};
		Random random=new Random();
		int index=random.nextInt(quotes.length);
		System.out.println("Random Motivitional Quotes: "+quotes[index]);
	}

}
