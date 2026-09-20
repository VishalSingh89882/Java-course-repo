package Strings;

public class TextProcessor {

    public static void main(String[] args) {
        contWords("I love Java and Python");
        reverseString("Elephant");
    }

    public static void contWords(String text)
    {
        String[] words = text.split(" ");
        int totalWords = words.length;
        String message = String.format("your text contain %d  words ", totalWords);
        System.out.println(message);

        for (int i=0; i<totalWords; i++)
        {
            System.out.println(words[i]);
        }
    }

    public static void reverseString(String text)
    {
        for (int i = text.length() - 1; i>=0; i--)
        {
            System.out.print(text.charAt(i));
        }
    }
}
