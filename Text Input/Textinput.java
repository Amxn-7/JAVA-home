
import java.util.Scanner;
public class Textinput{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Hello, "+ name);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.println("Your age: " + age);
        double gpa = scanner.nextDouble();
        System.out.println("Your cgpa: " + gpa);
        scanner.close();
    }
}