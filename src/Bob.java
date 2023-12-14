import java.util.Scanner;

public class Bob {

    public static void main(String[] args) {

        String question = "";
        Scanner scanner = new Scanner(System.in);

        // clear buffer
        scanner.nextLine();

        System.out.print("\nAsk a question or just <enter> to exit : ");
        question = scanner.nextLine();

        do {
            if (question.endsWith("?")) {
                System.out.println("Sure.");
            } else if (question.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (question.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever.");
            }
            System.out.print("\nAsk another question or just <enter> to exit : ");
            question = scanner.nextLine();
        } while (!question.isEmpty());
    }
}
