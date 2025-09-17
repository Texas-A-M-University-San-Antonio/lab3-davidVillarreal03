/**
 * Name: [David Villarreal]
 * Date: [9/16/25]
* Purpose: InClass 3 - 
* [User wants to be able to figure out the volume and surface area based of the length of the cube.]
* [This will solve the issue of the user having to figure it out themselves by doing the calculations for them.]
*/

// Don't forget to import and declare a Scanner for user input.
import java.util.Scanner;
public class InClass3_David_Villarreal
{
    public static void main(String[] args) 
    {
        Scanner input = new Scanner(System.in);
        int length;
        double volume;
        double surfaceArea;
        // In-Class 3 Example:
        // Step 1: Prompt the user to enter the length of the side of a cube.
        System.out.print("Please enter the length of the side of the cube: ");
        // Step 2: Read the user's input and store it in a variable.
        length = input.nextInt();
        // Step 3: Use an appropriate method to determine the volume of the cube.
        volume = Math.pow(length, 3);
        System.out.println("The volume of the cube is " + volume);
        // Step 4: Use an appropriate method to determine the surface area of the cube.
        surfaceArea = Math.pow(length, 2);
        System.out.println("The surface area of the cube is " + surfaceArea);
        // HINT: Steps 3 and 4 will use the Math.pow(a, b) method
        // Step 5: Print the volume and surface area in clear sentences.
    }
}