package guru.qa.hw;

public class MathOperators {
    public static int first = 666;
    public static int second = 777;
public static double third = 6.66;
    public static void main(String[] args) {
        System.out.println("_______________ math operators _______________");
        int addition = first + second;
        int subtraction = first - second;
        int multiplication = first * second;
        int divide = second / first;
        int remainderOfDivide = second % first;
        System.out.println("first + second = " + addition);
        System.out.println("first - second = " + subtraction);
        System.out.println("first * second = " + multiplication);
        System.out.println("second / first = " + divide); // без остатка так как тип int
        System.out.println("second % first = " + remainderOfDivide);
        int overflow = 666666666 * multiplication; // переполнение
        System.out.println("overflow = " + overflow);
        System.out.println("_______________ comparison operators _______________");
        System.out.println("First > second: " + (first > second));
        System.out.println("First < second: " + (first < second));
        System.out.println("First >= second: " + (first >= second));
        System.out.println("First <= second: " + (first <= second));
        System.out.println("First = second: " + (first == second));
        System.out.println("First is not equal second: " + (first != second));
        System.out.println("_______________ combinations _______________");
        System.out.println("int first * double third = " + (first*third));
        System.out.println("int first / double third = " + (first/third));
        System.out.println("int first + double third = " + (first+third));
    }

}
