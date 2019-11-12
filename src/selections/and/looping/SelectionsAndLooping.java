//Ibrahim Mohamed

package selections.and.looping;

import java.util.Scanner;

/*  This program inputs an ending number and displays all numbers between
 1 and the ending number that are evenly divisible by 3.
 */
public class SelectionsAndLooping
{

    public static void main(String[] args)
    {
        int n, i, count, num;
        Scanner input = new Scanner(System.in);

        // input the ending number
        System.out.println("Enter the ending number: ");
        n = input.nextInt();

        System.out.println("What would you like your divisor to be?");

        count = input.nextInt();

        num = count;
        
        System.out.println("\nBelow are all the numbers that are evenly "
                + "divisible by " + num + " from 1 up to " + n);

        while (count <= n)
        {
            System.out.print(count + "  ");

            for (i = 0; i < num; ++i)
            {
                ++count;
            }
        }
        System.out.println();
    }
}
