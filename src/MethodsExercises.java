import javax.swing.plaf.TableHeaderUI;
import java.util.Scanner;

public class MethodsExercises {



    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

//      1 basic arithmetic
        int num1 = 15;
        int num2 = 3;
        System.out.printf("%d + %d = " + add(num1, num2) + "%n", num1, num2);
        System.out.printf("%d - %d = " + subtract(num1, num2) + "%n", num1, num2);
        System.out.printf("%d * %d = " + multiply(num1, num2) + "%n", num1, num2);
        System.out.printf("%d / %d = " + divide(num1, num2) + "%n", num1, num2);


//      2 verify input
        int userInput;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            userInput = getInteger(1, 10);
        } while (userInput == 0);


//      3 factorial
        System.out.print("Factorial, enter a number from 1 and 10: ");
        int numFact = sc.nextInt();
        boolean verifyNum = numFact >= 1 && numFact <= 10;
        System.out.println("The number is: " + numFact + " and the verification is..." + verifyNum + ".");

        System.out.print("Do you want to continue [y/N]");
        if (sc.next().equalsIgnoreCase("y")){
            System.out.println("here");
            long fact = calcFactorial(numFact);
            System.out.println("The factorial of numFact is: " + fact);
        }





    }

    // 1 basic arithmetic
    public static int add (int num1, int num2){
        return num1 + num2;
    }
    public static int subtract (int num1, int num2){
        return num1 - num2;
    }
    public static int multiply (int num1, int num2){
        return num1 * num2;
    }
    public static int divide (int num1, int num2){
        return num1 / num2;
    }


    // 2 verify
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ret = 0;
        if (num >= min && num <= max){
            ret = num;
        }
        return ret;
    }


//    3 factorial
    public static long calcFactorial(long num){
        // base case
        if (num == 1) {
            return num;
        }
        num = num * calcFactorial(num-1);
        return num;
    }





}
