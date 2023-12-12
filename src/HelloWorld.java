import java.util.Locale;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        int myFavotiteNumber = 1;
        System.out.println(myFavotiteNumber);

        String myString = "Coffee, please!";
        System.out.println(myString);

        float myNumber = 3.14F;
        System.out.println(myNumber);

        int x = 5;
        System.out.println(++x);
        System.out.println(x);

        String theNumberThree = "three";
        Object o = theNumberThree;
//        int three = (int) o;
//        int three = (int) "three";

//        int x = 4;
//        x += 5;

//        int x = 3;
//        int y = 4;
//        y *= x;

//        int x = 10;
//        int y = 2;
//        x /= y;
//        y -= x;

        System.out.println(Byte.MAX_VALUE);
        System.out.println(Short.MAX_VALUE);
        System.out.println(Integer.MAX_VALUE);
        System.out.println(Long.MAX_VALUE);
        System.out.println(Float.MAX_VALUE);
        System.out.println(Double.MAX_VALUE);

    }
}
