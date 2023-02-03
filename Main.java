import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        System.out.println("Введите выражение:");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println(calc(input));
    }

    public static String calc(String input) {
        String errorMessage = "Выражение может состоять только из 2-x чисел от 1 до 10 включительно и символов: +, -, *, /. Формат: 1 + 1";

        if (new Validator().validate(input)) {
            String[] arr = input.split("\\s(\\+|-|\\*|\\/)\\s");
            String symbol = input.replaceAll("[0-9]|\\s?", "");
            int num0 = Integer.parseInt(arr[0]);
            int num1 = Integer.parseInt(arr[1]);
            return new Calculator().calculator(num0, num1, symbol);

        } else {
            throw new RuntimeException("Невалидное выражение. " + errorMessage);
        }
    }
}
