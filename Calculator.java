class Calculator {
    String calculator(int num0, int num1, String symbol) throws Exception {
        return switch (symbol) {
            case "+" -> String.valueOf(num0 + num1);
            case "-" -> String.valueOf(num0 - num1);
            case "*" -> String.valueOf(num0 * num1);
            case "/" -> String.valueOf(num0 / num1);
            default -> throw new Exception("Невалидный символ");
        };
    }
}
