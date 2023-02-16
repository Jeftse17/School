/*
 * Write an application that prints the verses 
 * to "The Twelve Days of Christmas".  

On the 12th day of Christmas, my true love sent to me:
Twelve Drummers Drumming
Eleve Pipers Piping
Ten Lords a Leaping
Nine Ladies Dancing
Eight Maids a Milking
Seven Swans a Swimming
Six Geese a Laying
Five Golden Rings
Four Calling Birds
Three French Hens
Two Turtle Doves
and a Partridge in a Pear Tree

 * A switch statement will be the best way to do 
 * this.  You will need to order your cases very 
 * carefully and avoid break statements in most, 
 * but not all, places.  You will also need another 
 * switch statement for "1st", "2nd", "3rd", etc., 
 * but this one will not require as many cases as 
 * the other if you can use string concatenation.
 * 
 */
import java.util.List;
import java.util.Scanner;

public class TwelveDays {
  
  public static void main(String[] args) throws Exception{
    
    // This section determines how many "days of Christmas"
    // to be printed
    int days; 
    Scanner scan = new Scanner(System.in);
    
    // Get the number of days from the user
    System.out.print("How many days should we do? (1 to 12): ");
    days = scan.nextInt();
    System.out.println();
    
    // This is here in case the user inputs a number
    // less than 1 or greater than 12
    if (days < 1)  days = 1;
    if (days > 12) days = 12;
    
    // This is a "for loop", and the code within will execute 
    // 1 to 12 times, depending on the value of the 
    // variable "days".  You do not need to worry about 
    // how the loop itself works.  Just focus on writing the 
    // code to execute a SINGLE verse of the song, based on
    // the value of the variable "i" AT THAT TIME
    for (int i = 1; i <= days; i++){
      String day = "";
      String[] gifts_1 = {
        "A Partridge in a Pear Tree",
        "Two Turtle Doves",
        "Three French Hens",
        "Four Calling Birds",
        "Five Gold Rings",
        "Six Geese a Laying",
        "Seven Swans a Swimming",
        "Eight Maids a Milking",
        "Nine Ladies Dancing",
        "Ten Lords a Leaping",
        "Eleven Pipers Piping",
        "Twelve Drummers Drumming"
    };
      String[] gifts_2 = {
        "And Partridge in a Pear Tree",
        "Two Turtle Doves",
        "Three French Hens",
        "Four Calling Birds",
        "Five Gold Rings",
        "Six Geese a Laying",
        "Seven Swans a Swimming",
        "Eight Maids a Milking",
        "Nine Ladies Dancing",
        "Ten Lords a Leaping",
        "Eleven Pipers Piping",
        "Twelve Drummers Drumming"
    };
      switch (i) {
          case 1:
              day = "1st";
              break;
          case 2:
              day = "2nd";
              break;
          case 3:
              day = "3rd";
              break;
          case 4:
              day = "4th";
              break;
          case 5:
              day = "5th";
              break;
          case 6:
              day = "6th";
              break;
          case 7:
              day = "7th";
              break;
          case 8:
              day = "8th";
              break;
          case 9:
              day = "9th";
              break;
          case 10:
              day = "10th";
              break;
          case 11:
              day = "11th";
              break;
          case 12:
              day = "12th";
              break;
      }
      if (days == 1)  {
        System.out.println("On the 1st day of Christmas, my true love gave to me:\nA Partridge in a Pear Tree");
      }
        else {
          System.out.println("On the " + day + " day of Christmas, my true love gave to me:");
    

      for (int j = i - 1; j >= 0; j--) {
        System.out.println(gifts_2[j]);
        }
        
      }

      


      
      System.out.println();
      pause(1000);
      
    }

    
    
  }
  
  private static void pause(int milliseconds) throws Exception{
    Thread.sleep(milliseconds);
  }
  
}
