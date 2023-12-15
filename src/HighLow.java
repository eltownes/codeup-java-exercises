import java.util.Scanner;

public class HighLow {

    static int generateRandomNum(int min, int max) {
        return (int) (Math.random() * ((max - min) + 1)) + min;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int guesses = 0;
        boolean cont = true;

        int pickedNum = generateRandomNum(1, 100);
        System.out.print("I have a number from 1-100; guess it... ");

        do {
            int guessNum = sc.nextInt();
            guesses++;

            if (guessNum < pickedNum) {
                System.out.print("HIGHER - guess again: ");
            } else if (guessNum > pickedNum) {
                System.out.print("LOWER - guess again: ");
            } else {
                System.out.printf("GOOD GUESS! That took %d tries.", guesses);
                cont = false;
            }

        } while (cont);
    }
}
