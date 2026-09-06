// StringTokenizer belongs to the java.util package
// and is used to break a string into smaller parts called tokens.
// Based on Specified Delimeters.

// There are three ways to use StringTokeinzers
import java.util.StringTokenizer;
public class TokenizerMethods {
    public static void main(String[] args)
    {
        // 1. Using only String as an argument
        // Syntax -
        String str = "Java is an Object Oriented Language";
        StringTokenizer st = new StringTokenizer(str);

        // It hasn't specified the delimeter so we use default delimeter
        // Default Delimeters are - space, tab, newline, carriage return
        // and form feed

        System.out.println("Original String: " + str);
        while (st.hasMoreTokens()) {
        // nextToken() returns the next available token
            String token = st.nextToken();
            System.out.println(token);
        }

        // 2. Using String and delimeter as an argument
        String str2 = "Java,Python,C++,JavaScript";
        // Comma is specified as the delimiter
        StringTokenizer st2 =
                new StringTokenizer(str2, ",");
        System.out.println("Original String: " + str2);
        while (st2.hasMoreTokens()) {
            System.out.println(st2.nextToken());
        }

        // 3. Using String, delimeter and returnDelimeter as an argument
        String str3 = "Java,Python,C++";
        // true means delimiter will also be returned as a token
        StringTokenizer st3 =
                new StringTokenizer(str3, ",", true);
        System.out.println("Original String: " + str3);
        while (st3.hasMoreTokens()) {
            System.out.println(st3.nextToken());
        }

        // Methods of String Tokenizer

        // 1. .countTokens() - count no. of tokens
        System.out.println("\ncountToken - example");
        String str4 = "Java is easy to learn";
        StringTokenizer st4 =
                new StringTokenizer(str4);
        System.out.println("Number of tokens: "
                + st4.countTokens());

        // 2. .hasMoreTokens() - check the availabilty of tokens before proceeding
        System.out.println("\nhasMoreToken - example");
        String str5 = "Java Python C++";
        StringTokenizer st5 =
                new StringTokenizer(str5);
        while (st5.hasMoreTokens()) {
            System.out.println("Token available: "
                    + st5.nextToken());
        }

        // 3. nextToken()
        System.out.println("\nnextToken() - example");
                String str6 = "Welcome to Java";
        StringTokenizer st6 =
                new StringTokenizer(str6);
        System.out.println(st6.nextToken());
        System.out.println(st6.nextToken());
        System.out.println(st6.nextToken());

        // 4. nextToken(String delimeter)
        System.out.println("\nnextToken(String delimeter) - example");
        String str7 = "Java,Python;C++";

        StringTokenizer st7 =
                new StringTokenizer(str7, ",");

        System.out.println(st7.nextToken());
        System.out.println(st7.nextToken(";"));
        System.out.println(st7.nextToken());

        // 5. hasMoreElements()
        System.out.println("\n hasMoreElements example ---");
        String str8 = "One Two Three";
        StringTokenizer st8 =
                new StringTokenizer(str8);
        while (st8.hasMoreElements()) {
            System.out.println(st8.nextElement());
        }

        // 6. nextElement()
        System.out.println("\n nextElements example ---");
        String str9 = "Apple Mango Orange";
        StringTokenizer st9 =
                new StringTokenizer(str9);
        while (st9.hasMoreElements()) {
            Object element = st9.nextElement();
            System.out.println(element);
        }

        // Difference between (nextToken() , hasMoreToken()) and
        // nextElement() and hasMoreElement()
        // ->nextToken() returns the next token as a String,
        // whereas nextElement() returns the next token as an Object.





    }
}
