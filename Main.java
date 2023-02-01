class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("нужен только 1 аргумент");
        }
        System.out.println(calc(args[0]));
    }

    public static String calc(String input) {
        String errorMessage = "Выражение может состоять только из 2-x чисел от 1 до 10 включительно и символов: +, -, *, /";
        if (input == null) {
            throw new RuntimeException("Вероятно вы передали в качестве выражения null. " + errorMessage);
        }

        if (new Validator().validate(input)) {
            String[] arr = input.split("\\s?(\\+|-|\\*|\\/)\\s?");
            String symbol = input.replaceAll("[0-9]|\\s?", "");
            int num0 = Integer.parseInt(arr[0]);
            int num1 = Integer.parseInt(arr[1]);
            return new Calculator().calculator(num0, num1, symbol);

        } else {
            throw new RuntimeException("Невалидное выражение. " + errorMessage);
        }
    }
}
