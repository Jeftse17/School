public class BooleansAndConditionals {
  
    public static void main(String[] args) {
      
      // Creates a special type of object that 
      // generates random values of various types
      java.util.Random rGen = new java.util.Random();
      
      final boolean b1 = rGen.nextBoolean();
      final boolean b2 = rGen.nextBoolean();
      
      // Notice the variable names: _a, _b, _c, etc.
      // NOT a, b, c, etc.
      final int _a = rGen.nextInt() / 3;
      final int _b = rGen.nextInt() / 3;
      final int _c = rGen.nextInt() / 3;
      final int _d = rGen.nextInt() / 3;
      final int _e = rGen.nextInt() / 3;
      
      System.out.println("b1 is " + b1);
      System.out.println("b2 is " + b2);
      System.out.println("_a is " + _a);
      System.out.println("_b is " + _b);
      System.out.println("_c is " + _c);
      System.out.println("_d is " + _d);
      System.out.println("_e is " + _e);
      System.out.println();
      
      /////////////////////////////////////////////
      //
      // PART 1: BOOLEAN EXPRESSION PRACTICE
      // Place your line of code UNDERNEATH the 
      // instruction comment.  Follow the format I
      // provide for you here, with the expression 
      // as part of the String literal and in parentheses
      // after the plus sign for concatenation
      //
      /////////////////////////////////////////////
      
      // EXAMPLE
      // Write an expression that is true if 
      // b1 and b2 are BOTH true
      if(b1 && b2)
        System.out.println("b1 && b2 are both " + (b1 && b2));
      
  
      // Write an expression that is true if 
      // EITHER b1 OR b2 (or both) is true
      if((b1 || b2) && (b1 && b2))
        System.out.println("EITHER b1 OR b2 (or both) is true");
      
  
      // Write an expression that is true if
      // b1 and b2 are BOTH false
      if(!b1 && !b2)
        System.out.println("b1 && b2 are both " + (b1 && b2));
      
  
      // Write an expression that is true if _a 
      // is GREATER THAN _b
      if(_a > _b)
        System.out.println("_a is GREATER THAN _b");
      
  
      // Write an expression that is true if _c 
      // and _e are NOT EQUAL
      if(_c!= _e)
        System.out.println("_c and _e are NOT EQUAL");
  
      
      // Write an expression that is true if _d is GREATER THAN 
      // OR EQUAL TO the sum of _a and _c
      if(_d >= (_a + _c))
        System.out.println("_d is GREATER THAN OR EQUAL TO the sum of _a and _c");
  
      
      // Write an expression that is true if the following conditions
      // BOTH apply:
      //      _c and _e are NOT EQUAL
      //      _d is GREATER THAN OR EQUAL TO the sum of _a and _c
      if(_c!= _e && _d >= (_a + _c))
      {
        System.out.println("The following conditions apply:");
        System.out.println("_c and _e are NOT EQUAL");
        System.out.println("_d is GREATER THAN OR EQUAL TO the sum of _a and _c");
      }
  
      
      System.out.println();
      
      /////////////////////////////////////////////
      //
      // PART 2: BASIC IF/ELSE STATEMENTS
      //
      // 
      //
      /////////////////////////////////////////////
      
      // EXAMPLE
      // if b1 is true, print out: b1 is true!
      if (b1) 
        System.out.println("b1 is true!");
      
      // if b2 is true, print out: b2 is true!
      if (b1) 
        System.out.println("b1 is true!");
  
      
      // if b1 and b2 are true, print out: 
      //      b1 and b2 are BOTH true!
      if (b1 && b2) 
        System.out.println("b1 and b2 are both true!");
  
  
  
      
      // if at least one of b1 and b2 is true, print out: 
      //      At least one, b1 or b2, is true!
      // Otherwise, print out: b1 and b2 are BOTH false!
  
  
  
  
      
      System.out.println();
      
      /////////////////////////////////////////////
      //
      // PART 3: NESTED IF/ELSE STATEMENTS
      // See example code below
      //
      /////////////////////////////////////////////
      
      // if _a is less than _b, print out: 
      //     _a is less than _b
      // if _a is less than _c as well, also print out: 
      //     _a is less than _c, too!
      // Otherwise, print out: 
      //     _a may be less than _b, but it is greater than or equal to _c
      //
      // However, if _a is NOT less than _b, print out:
      //     _a is greater than or equal to _b, but we don't know its relation to c
      // In addition, if _a is less than _d, print out:
      //     _a is less than _d
  
      // YOUR CODE GOES HERE
      
      if (_a < _b) {
        System.out.println("_a is less than _b");
        if (_a < _c) {
          System.out.println("_a is less than _c, too!");
        }
      } else {
        System.out.println("_a may be less than _b, but it is greater than or equal to _c");
        if (_a >= _b) {
          System.out.println("_a is greater than or equal to _b, but we don't know its relation to c");
          if (_a < _d) {
            System.out.println("_a is less than _d");
          }
        }
      }
    }
      
}
  