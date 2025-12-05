package Strings.Substrings;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner idd = new Scanner(System.in);
        String email = idd.nextLine();
        String Username;
        String Domain;
        Username = email.substring(0, email.indexOf("@"));
        Domain = email.substring(email.indexOf("@")+1);
        System.out.println("Username: " + Username);
        System.out.println("Domain: " + Domain);

        idd.close();
    }
}
