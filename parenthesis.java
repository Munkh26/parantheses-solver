// Class author: Munkhsoyombo Munkhbat
// Date created: 11/07/2025
// General description:

public class parenthesis {
    public static void valid(String bracket) {
        int length = bracket.length();

        for (int i = 0; i < length; i++) {
            String secondChar = bracket.substring(1, 2);
            String fourthChar = bracket.substring(3, 4);

            if (secondChar.contains("[({")) {
                if (bracket.substring(i, i + 1).equals(secondChar) || bracket.substring(i, i + 1).equals(fourthChar)) {

                }

            }
            else {
                System.out.println("false");;
                return;
            }
        }
    }
    
    public static void main(String[] args) {
        valid("}");
    }
}