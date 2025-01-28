import java.util.Scanner;

public class CharacterReplacer {

   
    public static String replaceCharacter(String inputString, char oldChar, char newChar) {
        
        return inputString.replace(oldChar, newChar);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      
        System.out.print("Enter the string: ");
        String inputString = scanner.nextLine();

        
        System.out.print("Enter the character to replace: ");
        char oldChar = scanner.next().charAt(0); 

        System.out.print("Enter the new character: ");
        char newChar = scanner.next().charAt(0); 

   
        String result = replaceCharacter(inputString, oldChar, newChar);
        System.out.println("String after replacement: " + result);

        scanner.close();
    }
}
