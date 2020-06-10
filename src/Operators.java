import java.sql.SQLOutput;
import java.util.Scanner;

public class Operators//Class name
{
    public static void main(String[] args)// Main method
    {
        Scanner scanner =new Scanner(System.in);//improt inbuilt class Scanner
        System.out.print("Enter First Value:-  ");//printing out for enter value
        int val1 =scanner.nextInt();//Define variable to store user input
        System.out.print("Enter First Value:-  ");//printing out for enter value
        int val2 =scanner.nextInt();//Define variable to store user input
        System.out.print("Enter Any Operators:-  ");//printing out for enter value
        char ch =scanner.next().charAt(0);//Define variable to store user input
    switch(ch){ //Switch statement
        case '+':
            System.out.println("Addition of "+ val1+" & "+val2 +" = "+(val1+val2));
            break;
        case '-':
            System.out.println("Subtraction of "+ val1+" & "+val2 +" = "+(val1-val2));
            break;
        case '*':
            System.out.println("Multiplication of "+ val1+" & "+val2 +" = "+(val1*val2));
            break;
        case '/':
            System.out.println("Division  of  "+ val1+" & "+val2 +" = "+(val1/val2));
            break;
        default:
            System.out.println("Enter Operator Only!!!");
        }
    }
}
