public class PatternPrinter {
    public static void main(String[] args) {
        int rows = 3;

        for (int i = 1; i <= rows; i++) {
            // Print alphabets: A to current row
            char ch = 'A';
            for (int j = 1; j <= i; j++) {
                System.out.print(ch + " ");
                ch++;
            }

            // Print spaces
            int spaceCount = (rows - i) * 2;
            for (int s = 1; s <= spaceCount; s++) {
                System.out.print(" ");
            }

            // Print hashes
            for (int j = i; j <= rows; j++) {
                System.out.print("# ");
            }

            System.out.println();
        }
    }
}
