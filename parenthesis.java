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
        if (length % 2 == 0) {
            if (bracket.equals("")) {
                return false;
            }

            String start = bracket.substring(0, 1);
            if (start.contains("}") || start.contains("]") || start.contains(")")) {
                return false;
            }

    ///fix from here below // need nested loop
            for (int count = 0; count < length; count++) {
                String find = bracket.substring(count, count + 1);
                if (find.contains("{")) {
                    find = "}";
                }
                else if (start.contains("[")) {
                    find = "]";
                }
                else if (start.contains("(")) {
                    find = ")";
                }
                
                for (int i = 3; i < length; i += 3) {
                if (find.equals(bracket.substring(i, i + 1))) {

                }
                else {
                    return false;
                }
            }
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
        else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(isValid("({}){}[]"));
    }
}