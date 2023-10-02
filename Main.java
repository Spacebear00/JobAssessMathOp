public class MathOperations {
    public static String mathFunction(int number1, int number2, int number3) {
        if (number1 + number2 == number3) {
            return "+";
        } else if (number1 - number2 == number3) {
            return "-";
        } else if (number1 * number2 == number3) {
            return "*";
        } else if (number2 != 0 && number1 / number2 == number3) {
            return "/";
        } else {
            return "None";
        }
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(mathFunction(1, 2, 3));
        System.out.println(mathFunction(2, 2, 4));
    }
}
