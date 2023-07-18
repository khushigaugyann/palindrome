import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int n;
        int r = 0, rem = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter any no. ");
        n = sc.nextInt();
        while (n != 0) {
            rem = n % 10;
            r = r * 10 + rem;
            r = r / 10;
        }
        System.out.println("Reverse is " + r);
        if (n == r) {
            System.out.println(n + " is a palindrome no ");
        } else {
            System.out.println(n + " is not a palindrome no");
        }
        sc.close();
    }
}
