import java.util.Scanner;

public class StringExercise {

    public static void main(String[] args) {

//      1
        System.out.println("\nWe don't need no education");
        System.out.println("We don't need no thought control\n");

        System.out.println("Check \"this\" out!, \"s inside of \"s!\n");

        System.out.println("In windows, the main drive is usually C:\\");

        System.out.println("I can do backslashes \\, double backslashes \\\\,\n" +
                "and the amazing triple backslash \\\\\\!");

        Bob.main(args);
    }

    //  2
    public class Bob {
        public static void main(String[] args) {
//            StringBuilder question = new StringBuilder();
//            for (String arg : args) {
//                question.append(arg).append(" ");
//            }

            String question = "";
            if (args.length > 0) {
                question = args[0];
            }

            Scanner scanner = new Scanner(System.in);

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
}
