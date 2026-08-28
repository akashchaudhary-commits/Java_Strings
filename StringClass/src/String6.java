public class String6 {

    public static void main(String[] args) {

        // ---------------------------------------
        // 1. toLowerCase()
        // ---------------------------------------

        String str1 = "Hello WORLD";

        String lower = str1.toLowerCase();

        System.out.println("Original String: " + str1);
        System.out.println("Lowercase: " + lower);


        // ---------------------------------------
        // 2. toUpperCase()
        // ---------------------------------------

        String str2 = "Hello World";

        String upper = str2.toUpperCase();

        System.out.println("\nOriginal String: " + str2);
        System.out.println("Uppercase: " + upper);


        // ---------------------------------------
        // 3. trim()
        // ---------------------------------------

        String str3 = "     Hello World     ";

        String trimmed = str3.trim();

        System.out.println("\nBefore trim: [" + str3 + "]");
        System.out.println("After trim:  [" + trimmed + "]");


        // ---------------------------------------
        // 4. replace(char, char)
        // ---------------------------------------

        String str4 = "banana";

        String replacedChar = str4.replace('a', 'o');

        System.out.println("\nOriginal String: " + str4);
        System.out.println("After replacing a with o: " + replacedChar);


        // ---------------------------------------
        // 5. replace(String, String)
        // ---------------------------------------

        String str5 = "I like Java";

        String replacedString = str5.replace("Java", "Python");

        System.out.println("\nOriginal String: " + str5);
        System.out.println("After replacement: " + replacedString);


        // ---------------------------------------
        // 6. replaceFirst()
        // ---------------------------------------

        String str6 = "Java Java Java";

        String first = str6.replaceFirst("Java", "Python");

        System.out.println("\nOriginal String: " + str6);
        System.out.println("After replaceFirst(): " + first);


        // ---------------------------------------
        // 7. replaceAll()
        // ---------------------------------------

        String str7 = "Java Java Java";

        String all = str7.replaceAll("Java", "Python");

        System.out.println("\nOriginal String: " + str7);
        System.out.println("After replaceAll(): " + all);


        // ---------------------------------------
        // 8. replaceAll() using regex
        // ---------------------------------------

        String str8 = "Java123Programming456";

        String numbersRemoved = str8.replaceAll("[0-9]", "");

        System.out.println("\nOriginal String: " + str8);
        System.out.println("After removing numbers: " + numbersRemoved);


        // ---------------------------------------
        // 9. split()
        // ---------------------------------------

        String str9 = "Java HTML Perl";

        String[] words = str9.split(" ");

        System.out.println("\nAfter split():");

        for (int i = 0; i < words.length; i++) {
            System.out.println(words[i]);
        }


        // ---------------------------------------
        // 10. split() using comma
        // ---------------------------------------
//
        String str10 = "Apple,Banana,Mango,Orange";

        String[] fruits = str10.split(",");

        System.out.println("\nFruits:");

        for (int i = 0; i < fruits.length; i++) {
            System.out.println(fruits[i]);
        }
    }
}