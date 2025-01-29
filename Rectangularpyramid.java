import java.util.Scanner;

public class Rectangularpyramid {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get the height and base width of the pyramid
        System.out.print("Enter the height of the pyramid: ");
        int height = scanner.nextInt();
        System.out.print("Enter the base width of the pyramid: ");
        int width = scanner.nextInt();

        // Loop for each level of the pyramid
        for (int i = 0; i < height; i++) {
            // Print spaces before the stars
            for (int j = 0; j < height - i - 1; j++) {
                System.out.print(" ");
            }

            // Print the stars for the current row
            for (int k = 0; k < width + 2 * i; k++) {
                System.out.print("*");
            }

            // Move to the next line after printing one row
            System.out.println();
        }
        
        scanner.close();
    }
}

