public class String7 {

    public static void main(String[] args) {

//
        // 1. matches() - EXACT STRING MATCHING
        System.out.println("1. matches()");
        String str1 = "Java";
        System.out.println(str1.matches("Java"));

        System.out.println(str1.matches("Python"));

        // 2. matches() with REGULAR EXPRESSIONS
        System.out.println("\n2. matches() with Regex");

        String str2 = "Java is powerful";
        System.out.println(str2.matches("Java.*"));

        /*
         * Explanation:
         *
         * Java  -> String must start with Java
         * .     -> any single character
         * *     -> zero or more occurrences
         *
         * Therefore:
         *
         * Java
         * Java is
         * Java is powerful
         *
         * can match Java.*
         */

        // 3. . (DOT) - ANY SINGLE CHARACTER

        System.out.println("\n3. Dot (.)");

        System.out.println("cat".matches("c.t"));

        System.out.println("cut".matches("c.t"));

        System.out.println("cot".matches("c.t"));

        System.out.println("cart".matches("c.t"));

        /*
         * c.t means:
         *
         * c -> must be c
         * . -> any ONE character
         * t -> must be t
         *
         * cat  -> c + a + t -> true
         * cut  -> c + u + t -> true
         * cot  -> c + o + t -> true
         * cart -> has TWO characters between c and t -> false
         */

        // 4. * - ZERO OR MORE OCCURRENCES

        System.out.println("\n4. Asterisk (*)");

        System.out.println("a".matches("a*"));

        System.out.println("aaaa".matches("a*"));

        System.out.println("".matches("a*"));

        System.out.println("b".matches("a*"));

        /*
         * a* means:
         *
         * Zero or more 'a's.
         *
         * ""
         * "a"
         * "aa"
         * "aaa"
         * "aaaa"
         *
         * are all valid.
         */

        // 5. + - ONE OR MORE OCCURRENCES

        System.out.println("\n5. Plus (+) ");

        System.out.println("a".matches("a+"));

        System.out.println("aaaa".matches("a+"));

        System.out.println("".matches("a+"));

        /*
         * a+ means:
         *
         * One or more 'a's.
         *
         * "a"       -> true
         * "aa"      -> true
         * "aaaa"    -> true
         * ""        -> false
         */

        // 6. ? - ZERO OR ONE OCCURRENCE

        System.out.println("\n6. Question Mark (?)");

        System.out.println("color".matches("colou?r"));

        System.out.println("colour".matches("colou?r"));

        /*
         * u? means:
         *
         * u can appear ZERO or ONE time.
         *
         * color  -> true
         * colour -> true
         *
         * This is useful when something is optional.
         */

        // 7. \d - DIGIT

        System.out.println("\n7. Digit (\\d)");

        System.out.println("5".matches("\\d"));

        System.out.println("9".matches("\\d"));

        System.out.println("a".matches("\\d"));

        /*
         * IMPORTANT:
         *
         * In Java:
         *
         * \d
         *
         * must be written as:
         *
         * "\\d"
         *
         * because Java itself uses \ as an escape character.
         */

        // 8. \d{3} - EXACTLY 3 DIGITS
        System.out.println("\n8. Exactly 3 digits");

        System.out.println("123".matches("\\d{3}"));

        System.out.println("456".matches("\\d{3}"));

        System.out.println("12".matches("\\d{3}"));

        System.out.println("1234".matches("\\d{3}"));

        // 9. PHONE NUMBER VALIDATION
        System.out.println("\n9. Phone Number Validation");

        String phone = "9876543210";

        System.out.println(phone.matches("\\d{10}"));

        /*
         * \d{10}
         *
         * means:
         * Exactly 10 digits.
         *
         * Useful when validating:
         * - Mobile numbers
         * - PIN codes
         * - OTPs
         * - Numeric IDs
         */

        // 11. DATE FORMAT VALIDATION
        System.out.println("\n11. Date Validation");

        String date = "25-08-2026";

        System.out.println(date.matches("\\d{2}-\\d{2}-\\d{4}"));
        /*
         * \d{2} -> 2 digits
         * -     -> hyphen
         * \d{2} -> 2 digits
         * -     -> hyphen
         * \d{4} -> 4 digits
         *
         * Format:
         *
         * DD-MM-YYYY
         */

        // 12. CHARACTER CLASS [ ]
        System.out.println("\n===== 12. Character Class =====");

        System.out.println("a".matches("[abc]"));

        System.out.println("b".matches("[abc]"));

        System.out.println("c".matches("[abc]"));

        System.out.println("d".matches("[abc]"));
        /*
         * [abc] means:
         *
         * Match ONE character that is:
         *
         * a OR b OR c
         */


        // ============================================================
        // 13. REPLACEALL()
        // ============================================================

        System.out.println("\n===== 13. replaceAll() =====");

        String text = "Java is easy";

        String result = text.replaceAll("easy", "powerful");

        System.out.println(result);

        /*
         * Original:
         *
         * Java is easy
         *
         * After replaceAll():
         *
         * Java is powerful
         *
         * Use replaceAll() when you want to:
         *
         * - Replace text
         * - Remove unwanted characters
         * - Clean data
         * - Replace multiple matching characters
         */


        // ============================================================
        // 14. replaceAll() WITH REGEX
        // ============================================================

        System.out.println("\n===== 14. replaceAll() with Regex =====");

        String data = "abc123xyz456";

        String numbersRemoved = data.replaceAll("\\d", "");

        System.out.println(numbersRemoved);

        /*
         * \d -> any digit
         *
         * Therefore all digits are replaced with ""
         *
         * abc123xyz456
         *
         * becomes:
         *
         * abcxyz
         */


        // ============================================================
        // 15. REMOVE ALL NON-DIGITS
        // ============================================================

        System.out.println("\n===== 15. Keep Only Digits =====");

        String mixed = "Phone: 987-654-3210";

        String onlyDigits = mixed.replaceAll("\\D", "");

        System.out.println(onlyDigits);

        /*
         * \D means NOT a digit.
         *
         * So all characters that are NOT digits
         * are replaced with "".
         *
         * Phone: 987-654-3210
         *
         * becomes:
         *
         * 9876543210
         */


        // ============================================================
        // 16. REPLACE SPECIAL CHARACTERS
        // ============================================================

        System.out.println("\n===== 16. Replace Special Characters =====");

        String special = "Java@2026#Programming$Language";

        String cleaned = special.replaceAll("[@#$]", " ");

        System.out.println(cleaned);

        /*
         * [@#$]
         *
         * means:
         *
         * Match @ OR # OR $
         *
         * Each one is replaced by a space.
         */


        // ============================================================
        // 17. split()
        // ============================================================

        System.out.println("\n===== 17. split() =====");

        String languages = "Java,Python,C++";

        String[] arr = languages.split(",");

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        /*
         * Output:
         *
         * Java
         * Python
         * C++
         *
         * split() divides a String into an array.
         */


        // ============================================================
        // 18. split() WITH MULTIPLE DELIMITERS
        // ============================================================

        System.out.println("\n===== 18. split() with Multiple Delimiters =====");

        String subjects = "Java,C++?Python;SQL";

        String[] subjectsArray = subjects.split("[,?;]");

        for (int i = 0; i < subjectsArray.length; i++) {
            System.out.println(subjectsArray[i]);
        }

        /*
         * [,?;]
         *
         * means:
         *
         * Split at:
         *
         * ,
         * ?
         * ;
         */


        // ============================================================
        // 19. PRACTICAL EXAMPLE - CLEANING A PHONE NUMBER
        // ============================================================

        System.out.println("\n===== 19. Practical Example =====");

        String phoneNumber = "+91-987-654-3210";

        String cleanPhone = phoneNumber.replaceAll("\\D", "");

        System.out.println("Original: " + phoneNumber);
        System.out.println("Cleaned : " + cleanPhone);

        /*
         * Original:
         *
         * +91-987-654-3210
         *
         * After removing non-digits:
         *
         * 919876543210
         */


        // ============================================================
        // 20. PRACTICAL EXAMPLE - VALIDATE EMAIL
        // ============================================================

        System.out.println("\n===== 20. Email Validation =====");

        String email = "student@gmail.com";

        boolean validEmail =
                email.matches("[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}");

        System.out.println("Valid Email: " + validEmail);


        // ============================================================
        // 21. PRACTICAL EXAMPLE - VALIDATE PASSWORD
        // ============================================================

        System.out.println("\n===== 21. Password Validation =====");

        String password = "Java123";

        boolean validPassword =
                password.matches("[A-Za-z0-9]{6,}");

        System.out.println("Valid Password: " + validPassword);

        /*
         * [A-Za-z0-9]
         *
         * means:
         * Uppercase letters A-Z
         * Lowercase letters a-z
         * Digits 0-9
         *
         * {6,}
         *
         * means:
         * At least 6 characters.
         */


        // ============================================================
        // 22. PRACTICAL EXAMPLE - EXTRACT WORDS
        // ============================================================

        System.out.println("\n===== 22. Split Sentence =====");

        String sentence = "Java is easy to learn";

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }


        // ============================================================
        // END
        // ============================================================

        System.out.println("\n===== Program Finished =====");
    }
}