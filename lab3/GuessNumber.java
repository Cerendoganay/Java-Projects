import java.io.IOException;
import java.util.Random;
import java.util.Scanner;

public class GuessNumber {

	public static void main(String[] args) throws IOException {
        Scanner reader = new Scanner(System.in); //Creates an object to read user input
        Random rand = new Random(); //Creates an object from Random class
        int number = rand.nextInt(100); //generates a number between 0 and 99
		int attemps = 0;

		System.out.println("Hi! I'm thinking of a number between 0 and 99.");
		System.out.print("Can you guess it: ");


        int guess;
        do {

            guess = reader.nextInt();
			int attepmes = 0;
			attepmes += 1;

            if (guess == -1) {
                System.out.println("Sorry, the number was " + number);
				break;
            } else if (guess == number) {
                System.out.println("Congratulations! you won after " + attemps + " attemps");
                break;
            } else {
				System.out.println("Sorry!");
				if(guess > number){
					System.out.println("Mine is less than yours");
				} else{
					System.out.println("Mine is greater than yours");
				}
			}
			System.out.println("Type -1 to quit or guess another");
            
        } while (guess != number);


        reader.close(); //Close the resource before exiting
    }
	
	
}