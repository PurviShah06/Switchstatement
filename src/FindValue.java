import java.util.Scanner;

public class FindValue //class name
{
    public static void main(String[] args)// main method
    { Scanner scanner =new Scanner(System.in);//import inbuilt class Scanner
        System.out.print("Enter Number:-  ");//printing out for enter value
        int num =scanner.nextInt();//Define variable to store user input
        switch (num){
            case (0):
            case (1):
            case (2):
            case (3):
            case (4):
            case (5):
            case (6): case (7):
            case (8):
            case (9):
                System.out.print("Your Enter  "+ num);
                break;
            default:
                System.out.println("Not Allowed");
        }
    }

}

