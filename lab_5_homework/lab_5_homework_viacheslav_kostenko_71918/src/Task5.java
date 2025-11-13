import java.util.Scanner;

void main() {
    Scanner userInput = new Scanner(System.in);
    System.out.println("Enter word: ");

    String userInputValue = userInput.nextLine().toLowerCase();

    String rev = "";
    for (int i = userInputValue.length() - 1; i >= 0; i--) {
        rev = rev + userInputValue.charAt(i);
    }

    boolean palindrome = userInputValue.equals(rev);

    if(palindrome){
        System.out.println("Your word is palindrome");
    }else{
        System.out.println("Your word is not palindrome");
    }
}