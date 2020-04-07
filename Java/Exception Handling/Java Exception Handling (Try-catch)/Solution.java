import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String xStr = scan.next();
        String yStr = scan.next();
        scan.close();
        try {
            int x = Integer.parseInt(xStr);
            int y = Integer.parseInt(yStr);
            System.out.println(x / y);
        } catch (NumberFormatException e) {
            System.out.println("java.util.InputMismatchException");
        } catch (ArithmeticException e) {
            System.out.println("java.lang.ArithmeticException: / by zero");
        }
    }
}