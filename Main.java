class Main {
    public static void main(String[] args) {
        if (args.length != 1) {
            throw new RuntimeException("нужен только 1 аргумент");
        }
        System.out.println(calc(args[0]));
    }

    public static String calc(String expression) {
        String errorMessage = "Выражение может состоять только из 2-x чисел от 1 до 10 включительно и символов: +, -, *, /";
        if (expression == null) {
            throw new RuntimeException("Вероятно вы передали в качестве выражения null. " + errorMessage);
        }

        if (new Validator().validate(expression)) {
            String[] arr = expression.split("\\s?(\\+|-|\\*|\\/)\\s?");
            String symbol = expression.replaceAll("[0-9]|\\s?", "");
            int num0 = Integer.parseInt(arr[0]);
            int num1 = Integer.parseInt(arr[1]);
            return new Calculator().calculator(num0, num1, symbol);

        } else {
            throw new RuntimeException("Невалидное выражение. " + errorMessage);
        }
    }
}
