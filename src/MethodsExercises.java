public class MethodsExercises {

    public static void main(String[] args) {

        // basic arithmetic
        int num1 = 15;
        int num2 = 3;
        System.out.printf("%d + %d = " + add(num1,num2) + "%n", num1, num2);
        System.out.printf("%d - %d = " + subtract(num1,num2) + "%n", num1, num2);
        System.out.printf("%d * %d = " + multiply(num1,num2) + "%n", num1, num2);
        System.out.printf("%d / %d = " + divide(num1,num2) + "%n", num1, num2);



    }

    // basic arithmetic
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


    //



}
