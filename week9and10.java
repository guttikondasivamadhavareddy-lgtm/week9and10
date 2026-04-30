import java.util.Scanner;

public class week9and10 {

    static int findLength(String text) {
        int count = 0;

        try {
            while (true) {
                text.charAt(count); // keep accessing until exception
                count++;
            }
        } catch (Exception e) {
            // exception occurs when index is out of bounds
        }

        return count;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string: ");
        String text = sc.next();

        int len1 = findLength(text);
        int len2 = text.length();

        System.out.println("Length using charAt(): " + len1);
        System.out.println("Length using built-in: " + len2);
    }
}