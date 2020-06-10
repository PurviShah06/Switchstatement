import java.util.Scanner;

public class City_Name // main method
{
    public static void main(String[] args)// main method
    { Scanner scanner =new Scanner(System.in);//improt inbuilt class Scanner
        System.out.print("Enter Alphabet:-  ");//printing out for enter value
        char chr =scanner.next().charAt(0);//Define variable to store user input
        int a=(int) chr;//convert chr to integer
        switch (chr){//Switch statement
            case (65&97):
                System.out.println("Ahmedabad");
                break;
            case (66&98):
                System.out.println("Baroda");
                break;
            case (67&99):
                System.out.println("Chennai");
                break;
            case (68&100):
                System.out.println("Delhi");
                break;
            case (69&101):
                System.out.println("Edinburgh");
                break;
            case (70&102):
                System.out.println("Farozabad");
                break;
            default:
                System.out.println("Invalid Entry");
        }
    }

}


