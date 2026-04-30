import java.util.Scanner;

public class week9and10 {

    static int findLength(String text) {
        int count = 0;
        try {
            while (true) {
                text.charAt(count);
                count++;
            }
        } catch (Exception e) {}
        return count;
    }

    static int countWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        return count;
    }

    static String[] splitText(String text) {
        int words = countWords(text);
        String[] result = new String[words];

        int index = 0;
        String word = "";

        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) != ' ') {
                word += text.charAt(i);
            } else {
                result[index++] = word;
                word = "";
            }
        }
        result[index] = word;

        return result;
    }

    static String[][] wordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            result[i][0] = words[i];
            result[i][1] = String.valueOf(findLength(words[i]));
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] words = splitText(text);
        String[][] table = wordsWithLength(words);

        System.out.println("\nWord\tLength");

        for (int i = 0; i < table.length; i++) {
            int length = Integer.parseInt(table[i][1]);
            System.out.println(table[i][0] + "\t" + length);
        }
    }
}