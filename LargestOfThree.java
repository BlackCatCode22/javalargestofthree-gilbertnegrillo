/* LargestOfThree.java
*
* dH 2/15/23
* Approved solution for Java programming class
* References:
*   https://www.w3schools.com/java/java_user_input.asp
*   https://www.w3schools.com/java/java_conditions.asp
*   https://www.w3schools.com/java/java_variables.asp
*   https://www.javatpoint.com/java-program-to-find-largest-of-three-numbers
*
* input: three ints from user
* processing: find the largest of the three ints with decision structures
* output: the largest of three ints, the sum of three ints
 */

import java.util.Scanner;

public class LargestOfThree
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        // Get three integers from user
        System.out.print("Enter first integer: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second integer: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter third integer: ");
        int num3 = scanner.nextInt();
        // Determine largest integer
        int largest = num1;
        if (num2 > largest && num2 > num3)
        {
            largest = num2;
        }
        else if (num3 > largest && num3 > num2)
        {
            largest = num3;
        }
        else
        {
            System.out.println("All the integers are the same");
        }
        // Calculate sum of integers
        int sum = num1 + num2 + num3;
        // Output results
        System.out.println("The largest of " + num1 + " and " + num2 + " and " + num3 + " is: " + largest);
        System.out.println("The sum of " + num1 + " " + num2 + " " + num3 + " is: " + sum);
    }
}