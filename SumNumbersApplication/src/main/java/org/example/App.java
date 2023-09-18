package org.example;
import java.util.Scanner;

public class App 
{
    public static void main( String[] args )
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("_______________CALCULATOR_______________");
        System.out.println("Enter the first digit: ");
        int fN = scanner.nextInt();
        System.out.println("Enter the second digit: ");
        int sN = scanner.nextInt();
        int numb = SumNumbers(fN, sN);
        System.out.println( "The result is: " + numb );
    }

    public static int SumNumbers(int fN, int sN) {
        int sum;
        sum = fN + sN;
        return sum;
    }
}
