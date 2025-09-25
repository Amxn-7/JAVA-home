package Patterns;
import java.util.Scanner;

public class Main {
    public static void print1(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print2(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print3(int n) {
        for (int i = 0; i <= n; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print4(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println();
        }
    }
    public static void print5(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print6(int n) {
        for (int i = 1; i <=n; i++) {
            for (int j = 1; j <= n-i+1; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    public static void print7(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j=0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print8(int n) {
        for (int i = n; i >=0; i--) {
            //space
            for (int j = 0; j <=n-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j=0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print9(int n) {
        for (int i = 0; i < n; i++) {
            //space
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j=0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
        for (int i = n-2; i >= 0; i--) {
            //space
            for (int j = 0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            //star
            for (int j = 0; j < 2*i+1; j++) {
                System.out.print("*");
            }
            //space
            for (int j=0; j <n-i-1; j++) {
                System.out.print(" ");
            }
            System.out.println();
        }
    }
    public static void print10(int n) {
        for (int i = n; i >= 0; i--) {
            //space
            for (int j = 0; j <n-i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            //space
            for (int j = i; j<n; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void print11(int n) {
        int num = 1;
        for(int i=1;i<=n;i++){
            for(int j =1;j<=i;j++){
                System.out.print(num);
                num = num+1;
            }
            System.out.println();
        }
    }// Main method
    public static void print12 (int n) {
        for(int i=0;i<=n;i++){
            for(char ch = 'A';ch<='A'+ i;ch++){
                System.out.print(ch + " ");
            }
            System.out.println();
        }
    }  
    public static void main(String[] args) {
        Scanner inn = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = inn.nextInt();

        // print1(n);   
        // print2(n);   
        // print3(n);
        // print4(n);
        // print5(n);
        // print6(n);
        // print7(n);
        // print8(n);
        // print9(n);
        // print10(n);
        // print11(n);
        print12(n);
        
        inn.close();
    }
}
