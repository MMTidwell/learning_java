import java.util.Date;
// we are importing the package because it is in another package
import com.teamtreehouse.Treet;


public class Example {
	// first method ran
	public static void main(String[] args) {
		// creating new Treet obj and passing in params
		Treet treet = new Treet("Craig", 
				"Want to be famous? Simply tweet about Java and use the hashtag #treet."
				+ " I'll use your tweet int he new @treehouse course about data "
				+ "structures.",
				new Date(1421871332000L));
		System.out.printf("This is a new Treet: %s\n", treet);
	}
}
