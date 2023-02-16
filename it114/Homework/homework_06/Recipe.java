import java.util.Scanner;

public class Recipe {

    public static void main (String[] args){

        Scanner scan = new Scanner (System.in);

        // Information about recipe
        String title, instructions;

        // Variables to be used (and reused)
        // for each ingredient
        double amount;
        String ingredient;
        String units;

        // Each variable will be a string containing
        // the name, amount, and units for one of the
        // ingredients in the recipe.  You may need more
        // or less such variables, depending on how many
        // ingredients your recipe has.
        String ing1, ing2, ing3;

        int component = 0;

        // Get recipe title from user
        System.out.print("What is this recipe called? ");
        title = scan.next();

        // Note that the next 8 lines will repeat
        // a number of times, depending on how many
        // ingredients your recipe has.  The main thing
        // that will change each time is the seventh
        // line: ing1, ing2, ing 3, etc.
        System.out.print("Ingredient #" + ++component + ": ");
        ingredient = scan.next();
        System.out.print("How many? ");
        amount = scan.nextInt();
        System.out.print("What units? ");
        units = scan.next();
        ing1 = amount + " " + units + " of " + ingredient;
        System.out.println();

        // Second ingredient
        System.out.print("Ingredient #" + ++component + ": ");
        ingredient = scan.next();
        System.out.print("How many? ");
        amount = scan.nextInt();
        System.out.print("What units? ");
        units = scan.next();
        ing2 = amount + " " + units + " of " + ingredient;
        System.out.println();

        // Third ingredient
        System.out.print("Ingredient #" + ++component + ": ");
        ingredient = scan.next();
        System.out.print("How many? ");
        amount = scan.nextInt();
        System.out.print("What units? ");
        units = scan.next();
        ing3 = amount + " " + units + " of " + ingredient;
        System.out.println();

        // Add more code here to get fourth and fifth
        // ingredients, if needed.


        // Ask user for instructions.  When user types out
        // instructions and presses enter, you will get them in
        // a string and save it to the appropriate variable
        System.out.println("Please enter the instructions:");
        instructions = scan.next();
        System.out.println();

        System.out.println("###" + title + "###");
        System.out.println("Ingredients (" + component + " total): ");
        System.out.println("* " + ing1);
        System.out.println("* " + ing2);
        System.out.println("* " + ing3);
        System.out.println("Instructions: \n" + instructions);

    }

}
