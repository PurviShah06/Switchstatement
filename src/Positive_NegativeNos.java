import java.util.Scanner;

public class Positive_NegativeNos
{
    public static void main(String[] args)// main method
    {
        Scanner scanner = new Scanner(System.in);//improt inbuilt class Scanner
        System.out.print("Enter Number:-  ");//printing out for enter value
        int num = scanner.nextInt();//Define variable to store user input
        String num1 =(num>0?"true":"false");
        String num2 =(num<0?"true":"false");
        String num3 =(num==0?"true":"false");
        switch (num1)
        {
            case ("true"):
                System.out.println("Your Value is Positive   ");
                break;
            case ("false"):
                switch (num2) {
                    case ("true"):
                        System.out.println("Your Value is Negative  ");
                        break;
                    case ("false"):
                        switch (num3) {
                            case ("true"):
                                System.out.println("Your Value is Zero");
                            case ("false"):
                                break;
                        }
                }
            default:
                break;
        }
    }
}

