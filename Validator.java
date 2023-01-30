import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Validator {
    boolean validate(String expression) {
        String expressionRegex = "^([1-9]|10)\\s?(\\+|-|\\*|\\/)\\s?([1-9]|10)$";

        Pattern pattern = Pattern.compile(expressionRegex);
        Matcher matcher = pattern.matcher(expression);
        return matcher.find();
    }
}
