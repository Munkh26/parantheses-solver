// Class author: Munkhsoyombo Munkhbat
// Date created: 11/07/2025
// General description:

public class parenthesis {
    public static void valid(String bracket) {
        int length = bracket.length();
        int ind1 = bracket.lastIndexOf("{");
        int ind2 = bracket.lastIndexOf("[");
        int ind3 = bracket.lastIndexOf("(");
        System.out.println(ind1);
        System.out.println(ind2);
        System.out.println(ind3);

        if (ind1 > ind2 && ind1 > ind3) {
            if (ind1 + 2 > length) {
                System.out.println("false");
                return;
            }
            if (bracket.substring(ind1 + 1, ind1 + 2).equals("}")) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else if (ind2 > ind3 && ind2 > ind1) {
            if (ind2 + 2 > length) {
                System.out.println("false");
                return;
            }
            if (bracket.substring(ind2 + 1, ind2 + 2).equals("]")) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
        else if (ind3 > ind2 && ind3 > ind1) {
            if (ind3 + 2 > length) {
                System.out.println("false");
                return;
            }
            if (bracket.substring(ind3 + 1, ind3 + 2).equals(")")) {
                System.out.println("true");
            }
            else {
                System.out.println("false");
            }
        }
    }
            //find last opening bracket
            //look one to right

    
    public static void main(String[] args) {
        valid("([{}([)])]");
    }
}