/**
 * A program to carry on conversations with a human user.
 * This is the initial version that:
 * <ul><li>
 *       Uses indexOf to find strings
 * </li><li>
 * 		    Handles responding to simple words and phrases
 * </li></ul>
 * This version uses a nested if to handle default responses.
 * @author Laurie White
 * @version April 2012
 */
public class Magpie2 {
	/**
	 * Get a default greeting
	 * @return a greeting
	 */
	public String getGreeting() {
		return "Hello, let's talk.";
	}

	/**
	 * Gives a response to a user statement
	 *
	 * @param statement
	 *            the user statement
	 * @return a response based on the rules given
	 */
	public String getResponse(String statement) {
		String response = "";
		if (statement.indexOf("no") >= 0) { //index finds where a substring starts
			response = "Why so negative?";  //if the substring isn't there, then
		} else if (statement.indexOf("mother") >= 0 //it returns -1
				   || statement.indexOf("father") >= 0 //thus, these .indexOf() methods
				   || statement.indexOf("sister") >= 0 //say "if something is in the
				   || statement.indexOf("brother") >= 0) // phrase, do blank"
		{
			response = "Tell me more about your family.";
		} else if (statement.indexOf("cat") >=0
						|| statement.indexOf("dog") >=0
						|| statement.indexOf("fish") >=0)
						{
							response = "Tell me more about your pets.";
			} else if (statement.indexOf("Mr. Smith") >= 0)
					{
							response = "He sounds like a good teacher.";
			} else if (statement.indexOf("music") >= 0
								|| statement.indexOf("song") >= 0)
					{
							response = "Oh! You like music? My favorite song is All Star!";
			} else if (statement.indexOf("food") >= 0)
				{
					response = "stop i'm getting hungry :(";
			} else if (statement.indexOf("pizza") >= 0)
				{
					response = "lol I love pizza";
				}
			 else if (statement.trim().length() == 0)
				{
					response = "say something, please";
			} else {
			response = getRandomResponse();
			}
		return response;
	}

	/**
	 * Pick a default response to use if nothing else fits.
	 * @return a non-committal string
	 */
	private String getRandomResponse() {
		final int NUMBER_OF_RESPONSES = 6;
		double r = Math.random();
		int whichResponse = (int)(r * NUMBER_OF_RESPONSES);
		String response = "";

		if (whichResponse == 0) {
			response = "Interesting, tell me more.";
		} else if (whichResponse == 1) {
			response = "Hmmm.";
		} else if (whichResponse == 2) {
			response = "Do you really think so?";
		} else if (whichResponse == 3) {
			response = "You don't say.";
		} else if (whichResponse == 4) {
			response = "wow you're super cool";
		} else if (whichResponse == 5) {
			response = "huh that's pretty neat";
		}

		return response;
	}
}
