
/**program to display N even numbers 
 * since 27th june 2023 (day 3)
 * 
 */package techzenure;
import java.util.Scanner;
public class NEvenNumbers {

	public static void main(String[] args) {
		 // Declare objects and variables.
        Scanner scan = new Scanner(System.in);
        int low, high;

        // Ask user for input, and initialize variables.
        System.out.println("Enter an integer:");
        low = scan.nextInt();
        System.out.println("Enter last integer:");
        high = scan.nextInt();

        //Checks which is high or low, and swaps if low is bigger than high using a temporary variable.
        if (low > high){
            int temp = low;
            low = high;
            high = temp;
        }

        System.out.println("\nEVEN numbers between 2 inputs:");
        // For-i loop from low to high finding even numbers to print, i is your counter.
        for (int i = low ; i <= high ; i++) {
            
            // Check's if i is divisible by 2 using the modular operator, any that are true are even.
            if (i % 2 == 0){
                System.out.print(i + " ");
            }
        }
    }


	}


