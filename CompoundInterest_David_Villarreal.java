/**
 * Name: [David Villarreal]
 * Date: [9/16/25]
* Purpose: Lab 3 - 
* [User wants to know the value of the house from initial value to final value after interest rate and elapsed years.]
* [This code will make it easier for the user to know final value by inputing certain values.]
 */
import java.util.Scanner;
public class CompoundInterest_David_Villarreal
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        // Initializing variables to store user input.
        double initialHouse, interestRate, finalHouse;
        int elapsedYears;

        // Asking user to enter the home's initial value.
        System.out.print("Please enter the initial value of the home: ");
        initialHouse = input.nextDouble(); // Stores it into initialHouse
        // Asking user to enter the number of elapsed years.
        System.out.print("Please enter the number of elapsed years: ");
        elapsedYears = input.nextInt(); // Stores it into the variable.
        // Asking for the interest rate.
        System.out.print("Please enter the interest rate: ");
        interestRate = input.nextDouble(); // Storing the value into the variable.
        // InterestRate needs to be converted into a decimal so divide by 100.
        interestRate = interestRate / 100;
        // finaleHouse has an equation of A = P * (1 + r)^t
        // To get the equation to work properly must put interest rate + 1 in parenthesis
        // Math.pow will get (1 + r)^elapsedYears 
        // Finally initialHouse * Math.pow((1 + interestRate), elapsedYears)
        finalHouse = initialHouse * Math.pow((1 + interestRate), elapsedYears);
        
        // Show the calculated value to the user in a proper sentence.
        System.out.println("The final value of the home is: " + finalHouse);

    }
}