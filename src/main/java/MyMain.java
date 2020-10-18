import java.util.Scanner;

public class MyMain {

    // Changes a capital letter to a lowercase letter
    // If the char is not an uppercase letter, 
    // it is returned unchanged. 
    public static char toLower(char ch) {
        if ((ch >= 'A') && (ch <= 'Z')) {
            return (char) (ch+32);
        }
        else {
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now lowercase
    public static String myToLowerCase(String str) {
        char lower = ' ';
        String output = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {
                lower = (char) (str.charAt(i) + 32);
            }
            else {
                lower = (char) (str.charAt(i));
            }
            output += lower;
        }
        return output;
    }

    // Changes a lowercase letter to an uppercase letter
    // If the char is not an lowercase letter, 
    // it is returned unchanged. 
    public static char toUpper(char ch) {
        if ((ch >= 'a') && (ch <= 'z')) {
            return (char) (ch-32);
        }
        else {
            return ch;
        }
    }

    // Returns a copy of a String, where all letters 
    // are now uppercase
    public static String myToUpperCase(String str) {
        char upper = ' ';
        String out_put = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {
                upper = (char) (str.charAt(i) - 32);
            }
            else {
                upper = (char) (str.charAt(i));
            }
            out_put += upper;
        }
        return out_put;
    }


    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a string.");
        String input = scan.nextLine();
        System.out.println("Which method do you want to use? Convert to lower or to upper?");
        String method = scan.nextLine();
        
        if (method.equals("lower")) {
            System.out.println("Here's your string in lowercase: " + myToLowerCase(input));
        }
        else {
            System.out.println("Here's your string in uppercase: " + myToUpperCase(input));
        }
    }
}
