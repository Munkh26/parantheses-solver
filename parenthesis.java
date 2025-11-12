// Class author: Munkhsoyombo Munkhbat
// Date created: 11/07/2025
// General description:

public class parenthesis {
    public static boolean isValid(String bracket) {
        int length = bracket.length();
        int ind1 = bracket.lastIndexOf("{");
        int ind2 = bracket.lastIndexOf("[");
        int ind3 = bracket.lastIndexOf("(");
        System.out.println(ind1);
        System.out.println(ind2);
        System.out.println(ind3);
        if (bracket.equals("")) {
            return false;
        }

        String start = bracket.substring(0, 1);
        if (start.contains("}") || start.contains("]") || start.contains(")")) {
            return false;
        }
///fix from here below
        for (int i = 0; i < length; i += 2) {
            
        }

//Fix from here above
        if (ind1 > ind2 && ind1 > ind3) {
            if (ind1 + 2 > length) {
                return false;
            }
            if (bracket.substring(ind1 + 1, ind1 + 2).equals("}")) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (ind2 > ind3 && ind2 > ind1) {
            if (ind2 + 2 > length) {
                return false;
            }
            if (bracket.substring(ind2 + 1, ind2 + 2).equals("]")) {
                return true;
            }
            else {
                return false;
            }
        }
        else if (ind3 > ind2 && ind3 > ind1) {
            if (ind3 + 2 > length) {
                return false;
            }
            if (bracket.substring(ind3 + 1, ind3 + 2).equals(")")) {
                return true;
            }
            else {
                return false;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(isValid("({)}[]"));
    }
}