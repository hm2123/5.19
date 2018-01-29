import java.util.Scanner;

/*
Creator: Hamid Majeed
purpose: to print/display numbers in a pyramid pattern
date:01/26/18

 */

public class Pyramid {

    public static void main(String[] args) {

        System.out.print("Enter the number of lines:");
        Scanner input = new Scanner(System.in);

        // uses user input to determine number of rows for the pyramid
        int n = input.nextInt();

        for (int i = 1; i <= n; i++) {
            // printing spaces, 4 at a time from j=0 to j= n-i
            for (int j = 1; j <= (n - i); j++) {
                System.out.print("    ");
            }

            // this prints out ascending numbers
            for (int j = 0; j < i; j++) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }

            // this prints out descending numbers
            for (int j = i - 2; j >= 0; j--) {
                System.out.printf("%4d", (int) Math.pow(2, j));
            }
            System.out.println();

        }

    }

}