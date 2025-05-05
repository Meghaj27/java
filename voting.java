import java.util.Scanner;

public class VotingEligibility {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Accept age from the user
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();

        // Decision making
        if (age >= 18) {
            System.out.println("You are eligible to vote.");
        } else {
            System.out.println("You are NOT eligible to vote.");
        }

        scanner.close();
    }
}
