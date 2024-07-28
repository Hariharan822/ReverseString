//Java program to check if a vowel is present in a string

import java.util.Locale;

public class CheckVowel {
    public static void main(String[] args) {
        String word = "Hariharan";
        boolean isPresent = isPresent(word);
        if(isPresent) {
            System.out.println("contains vowel");
        }
        else {
            System.out.println("vowel not present");
        }
    }

    public static boolean isPresent(String word) {
        char[] wordArray = word.toCharArray();
        String vowels = "aeiouAEIOU";

        for(char ch : wordArray) {
            if(vowels.indexOf(ch) != -1) {
                return true;
            }
            }
        return false;
        } 
} 
