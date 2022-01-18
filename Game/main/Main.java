package main;

/**
 * Main class to run the program
 * @author Xian Yao Ng
 */
public class Main {
	Story story = new Story(this);
	
	public Main() {
		story.introduction();
		story.body();
	}
	
    public static void main(String[] args) {
		new Main();
    }

}