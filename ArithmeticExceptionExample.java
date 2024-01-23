public class ArithmeticExceptionExample {

    public static void main(String[] args) {
        try {
            int result = divideByZero();
            System.out.println("Hasil pembagian: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Terjadi ArithmeticException: " + e.getMessage());
        }
    }

    private static int divideByZero() {
        return 5 / 0;
    }
}