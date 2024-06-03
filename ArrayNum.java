package LabQuestins;
import java.util.Scanner;
public class ArrayPgm {

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);
     int[] numbers = new int[5];

     // Ask the user to input five integers and store them in an array
     System.out.println("Enter five integers:");

     for (int i = 0; i < 5; i++) {
         System.out.print("Enter number " + (i + 1) + ": ");
         numbers[i] = scanner.nextInt();
     }

     // Find the smallest and largest values in the array
     int smallest = numbers[0];
     int largest = numbers[0];

     for (int i = 1; i < numbers.length; i++) {
         if (numbers[i] < smallest) {
             smallest = numbers[i];
         }
         if (numbers[i] > largest) {
             largest = numbers[i];
         }
     }

     // Print the smallest and largest values
     System.out.println("Smallest number: " + smallest);
     System.out.println("Largest number: " + largest);


	}

}
