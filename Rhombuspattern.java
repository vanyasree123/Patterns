import java.util.Scanner;

public class Rhombuspattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Ask for the size of the rhombus (half-width)
        System.out.print("Enter the size of the rhombus: ");
        int n = scanner.nextInt();
        
        // Print the top half of the rhombus
        for (int i = 1; i <= n; i++) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print the stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }

        // Print the bottom half of the rhombus
        for (int i = n - 1; i >= 1; i--) {
            // Print leading spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            
            // Print the stars
            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            
            System.out.println(); // Move to the next line
        }
        
        scanner.close();
    }
}

