import java.util.Scanner;
public class ReverseString// main method
{
    public static String ReverseString(String str)//static method
    {
        return new StringBuilder(str)//
                .reverse()
                .toString();
    }
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);//import inbuilt class Scanner
        System.out.print("Enter Any String :-  ");//printing out for enter value
        String str = scanner.nextLine();//Define variable to store user input
        System.out.println("Reverse String  :-  "+ ReverseString(str));
    }
}
