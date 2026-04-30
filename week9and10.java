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

    // Count words
    static int countWords(String text) {
        int count = 1;
        for (int i = 0; i < findLength(text); i++) {
            if (text.charAt(i) == ' ') count++;
        }
        return count;
    }

    // Split manually
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

    static boolean compareArrays(String[] a, String[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (!a[i].equals(b[i])) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter text: ");
        String text = sc.nextLine();

        String[] arr1 = splitText(text);
        String[] arr2 = text.split(" ");

        boolean result = compareArrays(arr1, arr2);

        System.out.println("Both methods give same result: " + result);
    }
}