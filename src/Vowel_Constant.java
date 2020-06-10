import java.util.Scanner;

public class Vowel_Constant
{
    public static void main(String[] args)
    {   Scanner scanner =new Scanner(System.in);//improt inbuilt class Scanner
        System.out.print("Enter Your Alphabet:-  ");//printing out for enter value
        char val1 =scanner.next().charAt(0);//Define variable to store user input
       switch (val1){
           case('a'): case ('e'): case('i'): case('o'): case('u'):
           case('A'): case ('E'): case('I'): case('O'): case('U'):
               System.out.println("Your Alphabet is Vowel");
            break;
           default:
               System.out.println("Your Alphabet is Constant");
        }
    }
}
