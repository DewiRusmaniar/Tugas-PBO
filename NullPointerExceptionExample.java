public class NullPointerExceptionExample {

    public static void main(String[] args) {
        try {
            String str = null;
            int length = str.length();
            System.out.println("Panjang string: " + length);
        } catch (NullPointerException e) {
            System.out.println("Terjadi NullPointerException: " + e.getMessage());
        }
    }
}