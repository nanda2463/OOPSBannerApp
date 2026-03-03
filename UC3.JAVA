import java.util.HashMap;
import java.util.Map;

/**
 * UC3: OOPS Banner App - Final Implementation
 * 
 * This demonstrates the complete progression:
 * 1. Simple console display
 * 2. Banner Format using space and *
 * 3. Refactored using modular functions
 * 4. Using Class to store character patterns
 * 5. Using Map to store character patterns with functions
 */
public class UC3 {
    
    public static void main(String[] args) {
        System.out.println("=== OOPS Banner App - UC3 Final Implementation ===\n");
        
        // Stage 1: Simple console display
        System.out.println("Stage 1: Simple Console Display");
        displaySimple();
        System.out.println();
        
        // Stage 2: Banner Format using space and *
        System.out.println("Stage 2: Banner Format (Manual Pattern)");
        displayBannerManual();
        System.out.println();
        
        // Stage 3: Refactored using modular functions
        System.out.println("Stage 3: Modular Functions");
        displayBannerWithFunctions("OOPS");
        System.out.println();
        
        // Stage 4: Using Class to store character patterns
        System.out.println("Stage 4: Class with Pattern Storage");
        BannerGeneratorClass generator = new BannerGeneratorClass();
        generator.printBanner("OOPS");
        System.out.println();
        
        // Stage 5: Using Map for character patterns with functions
        System.out.println("Stage 5: Map-based Pattern Storage");
        BannerGeneratorMap mapGenerator = new BannerGeneratorMap();
        mapGenerator.printBanner("OOPS");
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
    
    // Stage 4: Class-based approach (without Map)
    static class BannerGeneratorClass {
        private final String[][] patterns;
        
        public BannerGeneratorClass() {
            patterns = new String[3][];
            initializePatterns();
        }
        
        private void initializePatterns() {
            patterns[0] = new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
            }; // O
            
            patterns[1] = new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
            }; // P
            
            patterns[2] = new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
            }; // S
        }
        
        public void printBanner(String text) {
            for (int row = 0; row < 5; row++) {
                for (char c : text.toCharArray()) {
                    System.out.print(getPatternForChar(c, row) + " ");
                }
                System.out.println();
            }
        }
        
        private String getPatternForChar(char c, int row) {
            if (c == 'O') return patterns[0][row];
            if (c == 'P') return patterns[1][row];
            if (c == 'S') return patterns[2][row];
            return "     ";
        }
    }
    
    // Stage 5: Class with Map for pattern storage (Final Approach)
    static class BannerGeneratorMap {
        private final Map<Character, String[]> patternMap;
        
        public BannerGeneratorMap() {
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
            
            // Additional characters
            patternMap.put('A', new String[]{
                " *** ",
                "*   *",
                "*****",
                "*   *",
                "*   *"
            });
        }
        
        // Function to display banner
        public void printBanner(String text) {
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
        
        // Function to add custom patterns
        public void addPattern(char c, String[] pattern) {
            if (pattern.length == 5) {
                patternMap.put(Character.toUpperCase(c), pattern);
            }
        }
        
        // Function to get pattern for a character
        public String[] getPattern(char c) {
            return patternMap.get(Character.toUpperCase(c));
        }
        
        // Function to display custom banner with added patterns
        public void displayCustomBanner(String text) {
            System.out.println("\nCustom Banner with Additional Characters:");
            printBanner(text);
        }
    }
}

