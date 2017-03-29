import java.util.Scanner;

public class Prompter {
	private Game game;

	public Prompter(Game game){
		this.game = game;
	}

	public boolean prompterForGuess(){
		Scanner scanner = new Scanner(System.in);
        boolean isHit = false;
        boolean isAcceptable = false;


        //start do/while loop
        do{
		    System.out.println("Enter a letter:");
		    String guessInput = scanner.nextLine();
		    char guess = guessInput.charAt(0);
        

        //sstart try/catch loop		
		    try {

			    isHit = game.applyGuess(guess);
		    } catch(IllegalArgumentException iae) {
			    System.out.printf("%s,please try again %n", iae.getMessage());
		     } //end try/catch
        

        } while (!isAcceptable);
   		return isHit;
	    
    }
	
}


