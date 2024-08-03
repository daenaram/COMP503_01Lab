import java.util.Scanner;

public class WhichGen {
public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        // Print the "What is your birth year?" message to the console
        System.out.println("What is your birth year?");
        int birthYear = scanner.nextInt();
        
        if (birthYear >= 1928 && birthYear <= 1945) {
        	System.out.println("Silent Generation");
        }
        
        else if (birthYear >= 1945 && birthYear <= 1964) {
        	System.out.println("Baby Boomers");
        }
        else if (birthYear >= 1965  && birthYear <= 1980) {
        	System.out.println("Generation X");
        }
        else if (birthYear >= 1981 && birthYear <= 1996) {
        	System.out.println("Millennials (Generation Y)");
        }
        else if (birthYear >= 1997 && birthYear <= 2015) {
        	System.out.println("Generation Z");
        }
        

        // Close the Scanner to prevent resource leaks
        scanner.close();
    }
}
