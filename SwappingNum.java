package LabQuestins;

import java.util.Scanner;

//Define the NumberSwapper class
class Num_Swap {
// Method to swap two numbers without using a third variable
public void swapNumbers(int num1, int num2) {
   System.out.println("Before swapping:");
   System.out.println("First number: " + num1);
   System.out.println("Second number: " + num2);

   // Swap the numbers
   num1 = num1 + num2;
   num2 = num1 - num2;
   num1 = num1 - num2;

   System.out.println("After swapping:");
   System.out.println("First number: " + num1);
   System.out.println("Second number: " + num2);
}
}

public class Swap  {
public static void main(String[] args) {
   Scanner scanner = new Scanner(System.in);
   System.out.print("Enter the first number: ");
   int num1 = scanner.nextInt();
   System.out.print("Enter the second number: ");
   int num2 = scanner.nextInt();

   // Create an object of NumberSwapper class
   Num_Swap obj = new Num_Swap();

   // Swap the numbers
   obj.swapNumbers(num1, num2);
}
}