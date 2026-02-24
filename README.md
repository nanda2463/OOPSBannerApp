# OOPSBannerApp
class Main {
    public static void main(String[] args) {
        // 1. Simple console display
        System.out.println("OOPS");
        System.out.println();
        // 2. Display in Banner Format using space and *
        displayBannerManual();
        System.out.println();
        // 3. Refactored using modular functions
        displayBannerModular("OOPS");
        System.out.println();
        // 4. Using Class and Map for character patterns
        BannerGenerator generator = new BannerGenerator();
        generator.printBanner("OOPS");
    }
    private static void displayBannerManual() {
        System.out.println(" ***   ***  ****   **** ");
        System.out.println("*   * *   * *   * *     ");
        System.out.println("*   * *   * ****   ***  ");
        System.out.println("*   * *   * *         * ");
        System.out.println(" ***   ***  *     ****  ");
    }
    private static void displayBannerModular(String text) {
        // Simple logic to iterate rows for a fixed set of characters
        for (int i = 0; i < 5; i++) {
            for (char c : text.toCharArray()) {
                System.out.print(getPatternRow(c, i) + " ");
            }
            System.out.println();
        }
    }
    private static String getPatternRow(char c, int row) {
        String[][] patterns = {
            {" *** ", "*   *", "*   *", "*   *", " *** "}, // O
            {"**** ", "*   *", "**** ", "*    ", "*    "}, // P
            {" ****", "*    ", " *** ", "    *", "**** "}  // S
        };
        if (c == 'O') return patterns[0][row];
        if (c == 'P') return patterns[1][row];
        if (c == 'S') return patterns[2][row];
        return "     ";
    }
    static class BannerGenerator {
        private final java.util.Map<Character, String[]> patternMap = new java.util.HashMap<>();
        public BannerGenerator() {
            patternMap.put('O', new String[]{" *** ", "*   *", "*   *", "*   *", " *** "});
            patternMap.put('P', new String[]{"**** ", "*   *", "**** ", "*    ", "*    "});
            patternMap.put('S', new String[]{" ****", "*    ", " *** ", "    *", "**** "});
        }
        public void printBanner(String text) {
            for (int i = 0; i < 5; i++) {
                for (char c : text.toCharArray()) {
                    System.out.print(patternMap.getOrDefault(c, new String[]{"     ", "     ", "     ", "     ", "     "})[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
