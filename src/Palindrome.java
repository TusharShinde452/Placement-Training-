import java.util.Scanner;
import java.util.Stack;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a string to check palindrome or not :");
        String string=sc.nextLine();
        Stack<Character>stack=new Stack<>();
        String temString = "";
        for (int i=string.length()-1;i>=0;i--){
            temString=temString+string.charAt(i);
        }
        if (temString.equals(string)){
            System.out.println("your string is palindrome");
        }
        else {
            System.out.println("your string is not palindrome");
        }
        sc.close();
    }
}
