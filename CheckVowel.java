public class CheckVowel {
    public static void main(String[] args) {
        String str = "Hariharan";
        boolean containsVowel = containsVowel(str);
        if(containsVowel(str)) {
            System.out.println("Contains Vowel");
        }
        else {
            System.out.println("vowel not present");
        }
    }

    public static boolean containsVowel(String str) {
        String vowels = "aeiouAEIOU";
        char[] checkVowel = str.toCharArray();

        for(char ch : checkVowel) {
            if(vowels.indexOf(ch) != -1) {
                return true;
            }
        }
        return false;
    }
}
