import java.util.Scanner;

public class ReverseWordsInSentences {

    public static String reverseWords(String sentence) {
        String[] words = sentence.split(" "); // Split sentence into words
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            StringBuilder sb = new StringBuilder(words[i]);
            result.append(sb.reverse()); // Reverse each word
            if (i != words.length - 1) {
                result.append(" "); // Add space between words
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String sentence = sc.nextLine();

        String reversedSentence = reverseWords(sentence);
        System.out.println("Reversed words sentence:");
        System.out.println(reversedSentence);
    }
}

