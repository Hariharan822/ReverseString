public class ReverseString {
    public static void main(String[] args) {
        String word = "Hariharan";
        String reversed = reverseString(word);
        System.out.println("ReversedString is" + reversed );
    }

    public static String reverseString(String word) {
        if (word == null || word.isEmpty()) {
            return word;
        }
        char[] text = word.toCharArray();
        char[] result = new char[text.length];

        for (int i = 0; i < text.length; i++) {
            result[i] = text[text.length - 1 - i];
        }
        return new String(result);
    }
}
