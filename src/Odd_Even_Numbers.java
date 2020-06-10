import java.util.Scanner;

public class Odd_Even_Numbers {
    public static void main(String[] args)// main method
    {
        Scanner scanner = new Scanner(System.in);//importt inbuilt class Scanner
        System.out.print("Enter Number:-  ");//printing out for enter value
        int num = scanner.nextInt();//Define variable to store user input
        int num1=num%2;
        switch (num1){
            case (0):
                System.out.println("Even Number ");
                break;
            default:
                System.out.println("Odd Number  ");
        }
    }
}