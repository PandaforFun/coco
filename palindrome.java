import java.util.Scanner;
public class Main
{
    static String n,n1 ="";
    public static void main(String[] args)
    {
        System.out.println("Enter the string: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextLine();
        int i = n.length();
        for (int p = (i - 1); p >=0; --p) {
            n1 = n1 + n.charAt(p);
        }

        if (n.toLowerCase().equals(n1.toLowerCase())) {
            System.out.println(n + " is a Palindrome String");
        }
        else {
            System.out.println(n + " is not a Palindrome String");
        }
    }
}
