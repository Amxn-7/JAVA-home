package Typecasting;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // typecasting
        int sum = (int)(69.34f);
        System.out.println(sum);
        // automatic type promotion in expressions
        int a = 257;
        byte b = (byte)(a); //257%256=1
        System.out.println(b);
    }
}
