import java.util.Scanner;
public class DecimalToBinaryConverter
{
    public static void main(String[] args) 
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Input a number (an integer between 0 and 255) to convert to binary: ");
        int integerusr = keyboard.nextInt();
        
        int remainder1 = integerusr % 2;
        int quotient1= integerusr / 2;
        int remainder2 = quotient1 % 2;
        int quotient2= quotient1 / 2;
        int remainder3 = quotient2 % 2;
        int quotient3= quotient2 / 2;
        int remainder4 = quotient3 % 2;
        int quotient4= quotient3 / 2;
        int remainder5 = quotient4 % 2;
        int quotient5= quotient4 / 2;
        int remainder6 = quotient5 % 2;
        int quotient6= quotient5 / 2;
        int remainder7 = quotient6 % 2;
        int quotient7= quotient6 / 2;
        int remainder8 = quotient7 % 2;
        int quotient8= quotient7 / 2;
        
        System.out.print("Binary number equivalent of " + integerusr + " is: ");
        System.out.print(remainder8);
        System.out.print(remainder7);
        System.out.print(remainder6);
        System.out.print(remainder5);
        System.out.print(remainder4);
        System.out.print(remainder3);
        System.out.print(remainder2);
        System.out.print(remainder1);
    }
}
