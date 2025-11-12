// Class author: Munkhsoyombo Munkhbat
// Date created: 11/07/2025
// General description: The user will input different combinations of paranthesis, and the program will check if they are valid or not.

public class parenthesis {
    // Pre-condition: bracket must be a string consisting of only the characters '(', ')', '{', '}', '[' and ']'.
    // Post-condition: returns true if the input string has valid parentheses, false otherwise.
    public static boolean isValid(String bracket) {
        int length = bracket.length();
        if (bracket == null || length == 0) {
            return false;
        }
        if (length % 2 != 0) {
            return false;
        }

        while (bracket.length() > 0) {
            int ind1 = bracket.lastIndexOf('{');
            int ind2 = bracket.lastIndexOf('[');
            int ind3 = bracket.lastIndexOf('(');

            int indMax = Math.max(ind1, Math.max(ind2, ind3));
            if (indMax == -1) {
                return false;
            }

            if (indMax + 1 >= bracket.length()) {
                return false;
            }

            char open = bracket.charAt(indMax);
            char close = bracket.charAt(indMax + 1);
            boolean match = (open == '{' && close == '}') || (open == '[' && close == ']') || (open == '(' && close == ')');
            if (!match) return false;

            bracket = bracket.substring(0, indMax) + bracket.substring(indMax + 2);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid("(){}[]")); //true
        System.out.println(isValid("(]")); //false
        System.out.println(isValid("([{({})}])")); //true
        System.out.println(isValid("(([]){})")); //true
        System.out.println(isValid("{}[())()(]")); //false
        System.out.println(isValid("(){}{")); //false
        System.out.println(isValid("([)]")); //false
        System.out.println(isValid("([{}([)])]")); //false
    }
}