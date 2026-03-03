/**
 * UC2: OOPS Banner App
 * 
 * This program displays "OOPS" in a large banner using asterisks (*) and spaces.
 * 
 * Key Concepts:
 * - ASCII Art: Creating visual representations using characters
 * - String Manipulation: Building strings using concatenation
 * - Multiple Print Statements: Sequential println() calls for multi-line output
 * - Operator Overloading: Using + operator for string concatenation
 * 
 * Requirements:
 * - Use asterisks (*) and spaces to form each letter
 * - Print each line of the banner individually
 * - Each character in 7-line format and 9 characters width
 * - Use string concatenation + to add 2 strings for pattern creation
 */
public class UC2 {
    
    public static void main(String[] args) {
        // Display the OOPS banner using individual print statements
        System.out.println("=== OOPS Banner ===");
        
        // Using string concatenation to build each line pattern
        // Each letter is 9 characters wide, 7 lines tall
        
        // Line 1: O O P S - Top row
        String line1 = "*********" + " " + "*********" + " " + "*********" + " " + "*********";
        System.out.println(line1);
        
        // Line 2: O O P S - Second row
        String line2 = "*       *" + " " + "*       *" + " " + "*       *" + " " + "*      ";
        System.out.println(line2);
        
        // Line 3: O O P S - Third row  
        String line3 = "*       *" + " " + "*       *" + " " + "*       *" + " " + "*     ";
        System.out.println(line3);
        
        // Line 4: O O P S - Fourth row (P middle bar)
        String line4 = "*       *" + " " + "*       *" + " " + "*********" + " " + " ********";
        System.out.println(line4);
        
        // Line 5: O O P S - Fifth row (P right bar starts, S curve)
        String line5 = "*       *" + " " + "*       *" + " " + "*       " + " " + "        *";
        System.out.println(line5);
        
        // Line 6: O O P S - Sixth row (P stem, S curve)
        String line6 = "*       *" + " " + "*       *" + " " + "*       " + " " + "        *";
        System.out.println(line6);
        
        // Line 7: O O P S - Bottom row
        String line7 = "*********" + " " + "*********" + " " + "*       " + " " + "*********";
        System.out.println(line7);
    }
}

