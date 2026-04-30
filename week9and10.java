public class week9and10 {

    // Method to generate exception
    static void generateException() {
        String text = null;
        System.out.println(text.length()); // ❌ NullPointerException
    }

    // Method to handle exception
    static void handleException() {
        try {
            String text = null;
            System.out.println(text.length());
        } catch (NullPointerException e) {
            System.out.println("Exception handled: " + e);
        }
    }

    public static void main(String[] args) {

        // Uncomment this to see exception crash
        // generateException();

        // Correct way (handled)
        handleException();
    }
}