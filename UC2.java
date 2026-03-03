import java.util.HashMap;
import java.util.Map;

/**
 * UC2: OOPS Banner App - Complete Implementation
 * 
 * This demonstrates the progression:
 * 1. Simple console display
 * 2. Banner Format using space and *
 * 3. Refactored using modular functions
 * 4. Using Class and Map for character patterns
 */
public class UC2 {
    
    public static void main(String[] args) {
        System.out.println("=== OOPS Banner App - Complete Implementation ===\n");
        
        // Stage 1: Simple console display
        System.out.println("Stage 1: Simple Console Display");
        displaySimple();
        System.out.println();
        
        // Stage 2: Banner Format using space and *
        System.out.println("Stage 2: Banner Format (Manual)");
        displayBannerManual();
        System.out.println();
        
        // Stage 3: Refactored using modular functions
        System.out.println("Stage 3: Modular Functions");
        displayBannerWithFunctions("OOPS");
        System.out.println();
        
        // Stage 4: Using Class and Map for character patterns
        System.out.println("Stage 4: Class with Map Pattern Storage");
        BannerGenerator generator = new BannerGenerator();
        generator.printBanner("OOPS");
    }
    
    // Stage 1: Simple console display
    private static void displaySimple() {
        System.out.println("OOPS");
    }
    
    // Stage 2: Manual banner display
    private static void displayBannerManual() {
        System.out.println(" ***   ***  ****   **** ");
        System.out.println("*   * *   * *   * *     ");
        System.out.println("*   * *   * ****   ***  ");
        System.out.println("*   * *   * *         * ");
        System.out.println(" ***   ***  *     ****  ");
    }
    
    // Stage 3: Modular functions approach
    private static void displayBannerWithFunctions(String text) {
        for (int row = 0; row < 5; row++) {
            for (char c : text.toCharArray()) {
                System.out.print(getPatternRow(c, row) + " ");
            }
            System.out.println();
        }
    }
    
    private static String getPatternRow(char c, int row) {
        // Pattern definitions for O, P, S
        String[][] patterns = {
            // O
            {" *** ", "*   *", "*   *", "*   *", " *** "},
            // P
            {"**** ", "*   *", "**** ", "*    ", "*    "},
            // S
            {" ****", "*    ", " *** ", "    *", "**** "}
        };
        
        if (c == 'O') return patterns[0][row];
        if (c == 'P') return patterns[1][row];
        if (c == 'S') return patterns[2][row];
        return "     ";
    }
    
    // Stage 4: Class-based approach with Map storage
    static class BannerGenerator {
        private final Map<Character, String[]> patternMap;
        
        public BannerGenerator() {
            patternMap = new HashMap<>();
            initializePatterns();
        }
        
        private void initializePatterns() {
            // O pattern
            patternMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            });
            
            // P pattern
            patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            });
            
            // S pattern
            patternMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            });
            
            // Add more characters
            patternMap.put('A', new String[]{
                " *** ",
                "*   *",
                "*****",
                "*   *",
                "*   *"
            });
            
            patternMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            });
        }
        
        public void printBanner(String text) {
            // Validate input
            if (text == null || text.isEmpty()) {
                System.out.println("Please provide text to display");
                return;
            }
            
            for (int row = 0; row < 5; row++) {
                for (char c : text.toUpperCase().toCharArray()) {
                    String[] pattern = patternMap.get(c);
                    if (pattern != null) {
                        System.out.print(pattern[row] + " ");
                    } else {
                        System.out.print("     ");
                    }
                }
                System.out.println();
            }
        }
        
        // Method to add custom patterns
        public void addPattern(char c, String[] pattern) {
            if (pattern.length == 5) {
                patternMap.put(Character.toUpperCase(c), pattern);
            }
        }
    }
}

