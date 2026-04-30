import java.util.Scanner;

public class week9and10 {

    static char[] getChars(String text) {
        char[] arr = new char[text.length()];

        for (int i = 0; i < text.length(); i++) {
            arr[i] = text.charAt(i);
        }
        return arr;
    }

    static boolean compareArrays(char[] a, char[] b) {
        if (a.length != b.length) return false;

        for (int i = 0; i < a.length; i++) {
            if (a[i] != b[i]) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        char[] arr1 = getChars(text);
        char[] arr2 = text.toCharArray();

        boolean result = compareArrays(arr1, arr2);

        System.out.println("Arrays are equal: " + result);
    }
}