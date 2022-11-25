import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char userInput;
        int i;
        for (i=0; i<10; i++)
        {
            System.out.print("Enter a character : ");
            userInput= input.nextLine().charAt(0);
            if (userInput=='a' || userInput=='e' || userInput=='i' || userInput=='o' || userInput=='u')
            {
                System.out.println("It's a vowel.");
            }
            else if (userInput=='b' || userInput=='z')
            {
                System.out.println("Critical error.");
                break;
            }
            else 
            {
                continue;
            }
        }
    }
}
