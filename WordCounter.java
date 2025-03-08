import java.util.Scanner;

public class WordsCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String sentence = getSentenceInput(input);
        int wordsCount = countWords(sentence);
        System.out.println("The Sentence has " + wordsCount + " words.");

    }

    public static String getSentenceInput(Scanner scanner) {
        System.out.print("Enter a sentence: ");
        String sentence = scanner.nextLine();
        return sentence;

    }

    public static int countWords(String sentence) {
        String words[] = sentence.split("\\s+");
        return words.length;
    }
} 
