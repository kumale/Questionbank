package Practiceque;

import java.util.Scanner;

public class EvenorOdd {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        
        System.out.println("Enter your array size");

        // Accepting array size from user
        
        int arrsize = sc.nextInt();
        int num[] = new int[arrsize];
        
        

        // Count variables for even and odd numbers
        int evencount = 0, oddcount = 0;

        System.out.println("Enter your array of " + arrsize + " numbers");
        
        

        // Accepting array numbers from user and counting even/odd numbers
        for (int i = 0; i < num.length; i++) {
            num[i] = sc.nextInt();
            if (num[i] % 2 == 0) {
                evencount++;
                
                
            } else {
            	
            	
                oddcount++;
            }
            
            
        }

        
        
        // Creating arrays with exact sizes
        int[] evenArray = new int[evencount];
        
        
        
        int[] oddArray = new int[oddcount];

        
        
        evencount = 0;
        oddcount = 0;

        // Separating even and odd numbers into respective arrays
        for (int i = 0; i < num.length; i++) {
            if (num[i] % 2 == 0) {
                evenArray[evencount++] = num[i];
            } else {
                oddArray[oddcount++] = num[i];
            }
        }

        // Printing even numbers
        System.out.println("Even numbers:");
        for (int even : evenArray) {
            System.out.println(even);
        }

        // Printing odd numbers
        System.out.println("Odd numbers:");
        for (int odd : oddArray) {
            System.out.println(odd);
        }

        sc.close();
    }
}
