package CodingChallengePractice;

import java.util.Scanner;

public class MicrowaveHeatingTime 
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of atoms to be heated:");
        int numAtoms = scanner.nextInt();
        double recommendedHeatingTime = calculateHeatingTime(numAtoms);
        if (recommendedHeatingTime == -1) 
        {
            System.out.println("Heating more than three atoms at once is not recommended.");
        } else {
            System.out.println("Recommended heating time: " + recommendedHeatingTime + " seconds");
        }
        scanner.close();
    }
    private static double calculateHeatingTime(int numAtoms) {
        if (numAtoms == 1) {
            return getRegularHeatingTime();
        } else if (numAtoms == 2) {
            return getRegularHeatingTime() * 1.5;
        } else if (numAtoms == 3) {
            return getRegularHeatingTime() * 2;
        } else {
            // Heating more than three atoms is not recommended
            return -1;
        }
    }

    private static double getRegularHeatingTime() {
        // You can replace this with the actual regular heating time in seconds.
        // For example:
        // return 30.0; // If the regular heating time is 30 seconds
        return 30.0; // Default value for demonstration purposes
    }
}

