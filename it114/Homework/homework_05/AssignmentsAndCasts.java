import java.lang.Math;
public class AssignmentsAndCasts {

    public static void main (String[] args){

        int a = 3;
        int b = 5;
        int c = 7;
        int d = 9;

        // Replace the ? with +, -, *, /, or %
        // and replace N with an appropriate
        // int literal to produce the correct result
        // in the subsequent println statement

        a *= 9;
        System.out.println("a is now " + a);
        b += 7;
        System.out.println("b is now " + b);
        c -= 3;
        System.out.println("c is now " + c);
        d -= 5;
        System.out.println("d is now " + d);
        a /= 3;
        System.out.println("a is now " + a);
        b *= 3;
        System.out.println("b is now " + b);
        System.out.println();

        // Add decrement or increment operators (prefix or postfix)
        // to the variables to produce the correct results

        System.out.println("c is now " + ++c);
        System.out.println("d is now " + d);
        System.out.println("d is now " + --d);
        System.out.println("a is now " + --a);
        System.out.println("b is now " + b);
        System.out.println();

        // Add casts (and sometimes parentheses)
        // to produce the correct results.  Do not change
        // the operators or numbers themselves.

        System.out.println((9 / 7d));
        System.out.println(Math.floor(9 / 7));
        System.out.println(Math.round(24.0 / 6.3)/1.0);
        System.out.println((int)((5 * 4)+.5));
        System.out.println();

        // Replace the ??? with the appropriate expression
        // (NOT a literal) to produce the correct results
        //
        // Each expression will likely involve some char
        // arithmetic and casting

        char ch = 'a';
        System.out.println("ch is now " + ch);
        ch += 10;
        System.out.println("ch is now " + ch);
        ch += 11;
        System.out.println("ch is now " + ch);
        ch -= 15;
        System.out.println("ch is now " + ch);
    }

}