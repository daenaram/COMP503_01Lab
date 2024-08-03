import java.util.Scanner;

public class GreetingApplication {
public static void main(String[] args)
{
	Scanner Name = new Scanner(System.in);
	System.out.println("What is your name?");
	String greetName = Name.nextLine();
	System.out.println("Hello " + greetName);
	
}
}
