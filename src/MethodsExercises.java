import java.util.Scanner;

public class MethodsExercises {



    public static void main(String[] args) {


//        1 basic arithmetic
        int num1 = 15;
        int num2 = 3;
        System.out.printf("%d + %d = " + add(num1, num2) + "%n", num1, num2);
        System.out.printf("%d - %d = " + subtract(num1, num2) + "%n", num1, num2);
        System.out.printf("%d * %d = " + multiply(num1, num2) + "%n", num1, num2);
        System.out.printf("%d / %d = " + divide(num1, num2) + "%n", num1, num2);


//      2
        int userInput;
        do {
            System.out.print("Enter a number between 1 and 10: ");
            userInput = getInteger(1, 10);
        } while (userInput == 0);


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


    // 2
    public static int getInteger(int min, int max){
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        int ret = 0;
        if (num >= min && num <= max){
            ret = num;
        }
        return ret;
    }







}
