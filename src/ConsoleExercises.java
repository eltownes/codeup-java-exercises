import java.util.Scanner;

public class ConsoleExercises {

    public static void main(String[] args) {

//      format output
        double pi = 3.14159;
        System.out.printf("The value of pi is approximately " + "%.2f.%n", pi );

//      scanner class
        Scanner scanner = new Scanner(System.in);

//      test input
        System.out.print("Enter an integer: ");
        int userInput = scanner.nextInt();
        System.out.println(" You entered: " + userInput);

//      test input 2
        System.out.println("Enter 3 numbers - 1 line separated by a <space>: ");
        int [] userInputArr = new int[3];
        for (int i = 0; i < userInputArr.length; i++) {
            userInputArr[i] = scanner.nextInt();
        }
        int j = 0;
        System.out.println("You entered: ");
        do {
            System.out.println(userInputArr[j]);
            j++;
        } while (j < userInputArr.length);

//      let's set different delimiter
        Object currentDelimiter = scanner.delimiter();
        System.out.println("currentDelimeter: " + currentDelimiter);

        scanner.useDelimiter("\n");

        System.out.println("Enter a sentence: ");
        String userSentence = scanner.next();
        System.out.println("You entered: " + userSentence);

//      reset delimiter
        scanner.useDelimiter(currentDelimiter.toString());
        System.out.println(scanner.delimiter());

//      Math: perimeter and area
//      clear buffer
        scanner.nextLine();

        System.out.println("Enter length: ");
        String lenS = scanner.nextLine();
        System.out.println("Enter width: ");
        String widS = scanner.nextLine();
        System.out.println("Enter height: ");
        String heiS = scanner.nextLine();

        float lenF = Float.parseFloat(lenS);
        float widF = Float.parseFloat(widS);
        float heiF = Float.parseFloat(heiS);

        float area = lenF * widF;
        float perim = 2*lenF + 2*widF;
        float vol = lenF * widF * heiF;

        System.out.println("A room that's " + lenS + " by " + widS + " has: ");
        System.out.printf("area is      : %.5f%n", area);
        System.out.printf("perimeter is : %.5f%n", perim);
        System.out.printf("volume is    : %.5f%n", vol);
    }
}
