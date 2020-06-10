import java.util.Scanner;

public class Greatest_Number {
    public static void main(String[] args) {// Main method

        Scanner scanner = new Scanner(System.in);//improt inbuilt class Scanner
        System.out.print("Enter Three Distinct Value:-  ");//printing out for enter value
        int a = scanner.nextInt();//Define variable to store user input
        int b = scanner.nextInt();//Define variable to store user input
        int c = scanner.nextInt();//Define variable to store user input
        //int x=(a>b)?(a>c?a:c):(b>c?b:c);//Ternary operators
        //System.out.println("Greater No. is "+" = "+x);
        if (a>b && a>c){
          System.out.println("Greater No. is "+" = "+a);

        }else  if (b>a && b>c){
            System.out.println("Greater No. is "+" = "+b);
        }else{
            System.out.println("Greater No. is "+" = "+c);
        }
    }
}