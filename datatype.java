import java.util.Scanner;

public class DataTypeDemo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Integer (int) Input
        System.out.print("Enter an integer number: ");
        int intValue = scanner.nextInt();

        // Double (double) Input
        System.out.print("Enter a decimal number: ");
        double doubleValue = scanner.nextDouble();

        // Character (char) Input
        System.out.print("Enter a single character: ");
        char charValue = scanner.next().charAt(0);

        // Boolean (boolean) Input
        System.out.print("Enter true or false: ");
        boolean boolValue = scanner.nextBoolean();

        // Displaying the values
        System.out.println("\nYou entered:");
        System.out.println("Integer: " + intValue);
        System.out.println("Double: " + doubleValue);
        System.out.println("Character: " + charValue);
        System.out.println("Boolean: " + boolValue);

        scanner.close();
    }
}
