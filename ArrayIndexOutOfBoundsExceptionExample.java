public class ArrayIndexOutOfBoundsExceptionExample {

    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            int value = numbers[5];
            System.out.println("Nilai pada indeks 5: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Terjadi ArrayIndexOutOfBoundsException: " + e.getMessage());
        }
    }
}