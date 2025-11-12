// Class author: Munkhsoyombo Munkhbat
// Date created: 11/07/2025
// General description:

public class parenthesis {
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

            int idx = Math.max(ind1, Math.max(ind2, ind3));
            if (idx == -1) {
                return false;
            }

            if (idx + 1 >= bracket.length()) {
                return false;
            }

            char open = bracket.charAt(idx);
            char close = bracket.charAt(idx + 1);
            boolean match =
                (open == '{' && close == '}') ||
                (open == '[' && close == ']') ||
                (open == '(' && close == ')');

            if (!match) return false;

            // remove the matched pair and continue
            bracket = bracket.substring(0, idx) + bracket.substring(idx + 2);
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(isValid(""));
    }
}