import java.util.Scanner;

public class Week_Name
{
    public static void main(String[] args)// main method
    {
        Scanner scanner =new Scanner(System.in);//improt inbuilt class Scanner
        System.out.print("Enter Number:-  ");//printing out for enter value
        byte num =scanner.nextByte();//Define variable to store user input
        String week; String week1;
        switch (num){
            case(1):
                System.out.println("Today is Sunday");
                break;
            case(2):
                System.out.println("Today is Monday");
                break;
            case(3):
                System.out.println("Today is Tuesday");
                break;
            case(4):
                System.out.println("Today is Wednesday");
                break;
            case(5):
                System.out.println("Today is Thursday");
                break;
            case(6):
                System.out.println("Today is Friday");
                break;
            case(7):
                System.out.println("Today is Saturday");
                break;
            default:
                System.out.println("Invalid Choice");
        }
    }
}

