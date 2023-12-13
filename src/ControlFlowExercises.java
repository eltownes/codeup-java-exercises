import java.util.Scanner;

public class ControlFlowExercises {

    public static void main(String[] args) {

//      *** loops

//      while loop
        int i = 5;
        while (i <= 15) {
            System.out.println(i);
            i++;
        }

//      do while
        int j = 0;
        do {
            System.out.println(j);
            j += 2;
        } while (j <= 100);

        int k = 100;
        do {
            System.out.println(k);
            k -= 5;
        } while (k >= -10);

        double a = 2;
        do {
            System.out.println((int)a);
            a = Math.pow(a,2);
        } while (a < 1e6);

//      for loop
//      ...


//      *** fizzbuzz
        for (int z = 0; z <= 100; z++) {
            if (z % 3 == 0 && z % 5 == 0) {
                System.out.println(z + " - FizzBuzz");
            } else if (z % 3 == 0) {
                System.out.println(z + " - Fizz");
            } else if (z % 5 == 0) {
                System.out.println(z + " - Buzz");
            }
        }

//      *** table
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.print("What number would you like to go up to? ");
            int num = scanner.nextInt();

            System.out.println("\nHere is your table!\n");
            System.out.println("number | squared | cubed");
            System.out.println("------ | ------- | -----");
            for (int b = 0; b <= num; b++) {
                System.out.printf("%-6d | %-7d | %-6d%n", b, b*b, b*b*b);
            }

            System.out.print("\nContinue? [y/n] : ");
        } while(scanner.next().equalsIgnoreCase("y"));

//      *** letter grade
        Scanner scanner2 = new Scanner(System.in);
        do {
            System.out.print("Enter a numerical grade 0-100 : ");
            int num = scanner2.nextInt();

            // default value
            char grade = 'F';
            if (num >= 88) {
                grade = 'A';
            } else if (num >= 80) {
                grade = 'B';
            } else if (num >= 67) {
                grade = 'C';
            } else if (num >= 60) {
                grade = 'D';
            }

            System.out.println("The letter grade is: " + grade);

            System.out.print("\nContinue? [y/n] : ");
        } while(scanner2.next().equalsIgnoreCase("y"));
    }
}
