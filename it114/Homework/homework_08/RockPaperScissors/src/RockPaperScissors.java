import java.util.Scanner;
import java.util.Random;

public class RockPaperScissors {
  
  private static String[] choices = { "Rock", "Paper", "Scissors" };
  
  public static void main (String[] args){
    
    Scanner scan = new Scanner(System.in);
    Random rGen = new Random();
    
    String name;
    int playerChoiceNum;
    String playerChoice;
    
    int computerChoiceNum;
    String computerChoice;
    
    char tryAgain;
    String playerMessage;
    
    System.out.print("What is your name? ");
    name = scan.nextLine();
    System.out.println();
    
    System.out.print("1 = Rock\n2 = Paper\n3 = Scissors\nPlease choose 1, 2, or 3: ");
    playerChoiceNum = scan.nextInt(); scan.nextLine();
    playerChoice = choices[playerChoiceNum - 1];
    System.out.println();
    
    computerChoiceNum = Math.abs(rGen.nextInt()) % 3 + 1;
    computerChoice = choices[computerChoiceNum - 1];
    
    // If the player and computer are tied OR the 
    // computer is beating the player, then...
    //   Ask the user if he is sure about his choice, 
    //      as a yes/no
    //   Store the first character of the user's 
    //      response in the variable tryAgain
    //   If the answer is no, then...
    //      Repeat the lines of code that got the 
    //         user's choice the first time
    
    // YOUR CODE GOES HERE
    tryAgain = ' ';
    while (tryAgain != 'n') {
      // check if player and computer are tied or computer is beating player
      if (playerChoice == computerChoice) {
        System.out.print("Are you sure about your choice? (yes/no): ");
        String response = scan.nextLine();
        tryAgain = Character.toLowerCase(response.charAt(0));
        if (tryAgain == 'n') {
          // repeat the code to get user's choice
        }

        //havent finished yet 





    
    
    System.out.printf("%s, you chose %s.%n", name, playerChoice);
    System.out.printf("The computer chose %s.%n", computerChoice);
    System.out.println();
    
    // If the player and computer made the same choice, then...
    //    Announce that it's a tie.
    // Otherwise, based upon the player's and computer's 
    //    respective choices, announce what beats what and 
    //    and tell the player whether he wins or loses.

    // YOUR CODE GOES HERE

    
    
    if (playerChoice.equals(computerChoice)){
      System.out.println(name + ", you and the computer both chose " + playerChoice + ", so its a tie.");
    } else if (playerChoice.equals("Rock")){
      if (computerChoice.equals("Scissors")){
        System.out.println(playerChoice + " breaks " + computerChoice + "...you win!");
      } else {
        System.out.println(computerChoice + " covers " + playerChoice + "...you lose!");
      }
    } else if (playerChoice.equals("Paper")){
      if (computerChoice.equals("Rock")){
        System.out.println(playerChoice + " covers " + computerChoice + "...you win!");
      } else {
        System.out.println(computerChoice + " cuts " + playerChoice + "...you lose!");
      }
    } else if (playerChoice.equals("Scissors")){
      if (computerChoice.equals("Paper")){
        System.out.println(playerChoice + " cut " + computerChoice + "...you win!");
      } else {
        System.out.println(computerChoice + " breaks " + playerChoice + "...you lose!");
      }
    } else {
      System.out.println("Please choose 1, 2, or 3.");
    }
  }
}
  }
    
  
}