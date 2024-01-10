public class StringOps {
    ////////////////////////////////////////////////////////////
    ////// ///////
    ////// Reminder: ///////
    ////// allowed methods ///////
    ////// ///////
    ////// 1.charAt(int index) ///////
    ////// 2.length() ///////
    ////// 3.substring(int start) ///////
    ////// 4.substring(int start,int ends) ///////
    ////// 5.indexOf(String str) ///////
    ////// ///////
    ////// The rest are not allowed ! ///////
    ////// if you want to use a different ///////
    ////// method, and you can implement ///////
    ////// it using material from the course ///////
    ////// you need to implement a version of ///////
    ////// the function by yourself. ///////
    ////// ///////
    ////// see example for substring ///////
    ////// in Recitation 3 question 5 ///////
    ////// ///////
    ////////////////////////////////////////////////////////////
    public static void main(String[] args) {
        // String capVowelsLowRest = "F";
        // System.out.println(capVowelsLowRest(capVowelsLowRest));

        //String camelCase = " Intro to coMPUter sCIEncE ";
        //System.out.println(camelCase(camelCase));

    }

    public static String capVowelsLowRest(String string) {
        String result = "";
        for (int i = 0; i < string.length(); i++) {
            // checks if the char is a,e,i,o,u
            if (string.charAt(i) == 'a' || string.charAt(i) == 'e' || string.charAt(i) == 'i' || string.charAt(i) == 'o'
                    || string.charAt(i) == 'u') {
                result = result + (char) (string.charAt(i) - 32);
            }
            // checks if the char is uppercase
            else if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') {
                result = result + (char) (string.charAt(i) + 32);
            } else {
                result = result + (char) (string.charAt(i));
            }
        }
        return result;
    }

    public static String camelCase(String string) {
        String result = "";

        for (int i = 0; i < string.length(); i++) {
            // changes to lowercase
            if ((string.charAt(i) != 32) && (string.charAt(i) >= 'A') && (string.charAt(i) <= 'Z')) {
                result = result + (char) (string.charAt(i) + 32);
            // checks if the char is space
            } else if (string.charAt(i) == 32) {
                // checks if the space is in the beggining of the input
                if (result.length() == 0) {
                    if (string.charAt(i + 1) >= 'A' && string.charAt(i + 1) <= 'Z') {
                        result = result + (char) (string.charAt(i + 1) + 32);
                        i++;
                    } else if (string.charAt(i + 1) >= 'a' && string.charAt(i + 1) <= 'z') {
                        result = result + (char) (string.charAt(i + 1));
                        i++;
                    }
                }
                // checks if the space is in the middle of the input but not the last char
                else if ((i + 1) < string.length() && string.charAt(i + 1) >= 'a' && string.charAt(i) <= 'z') {
                    result = result + (char) (string.charAt(i + 1) - 32);
                    i++;
                } else if ((i + 1) < string.length()) {
                    result = result + (char) (string.charAt(i + 1));
                    i++;
                }
            } else {
                result = result + (char) (string.charAt(i));
            }
        }
        return result;
    }

    public static int[] allIndexOf(String string, char chr) {
        // Write your code here:
        return new int[1];
    }
}
