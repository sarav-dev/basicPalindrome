import java.util.*;

public class basicPalindrome { 
    public static void main(String[] args) {
        System.out.println("Enter any word: ");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine().toLowerCase();
        boolean check = true;
        
        for (int i=0; i<word.length()/2; i++) {
            if (word.charAt(i) != word.charAt(word.length()-1-i)) {
                check = false;
                break;
            }
        }
        
        if(check) {
            System.out.println("Given word is a palindrome");
        }
        else {
            System.out.println("Given word is not a palindrome");            
        }
        sc.close();
    }
}