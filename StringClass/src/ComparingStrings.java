public class ComparingStrings {
    public static void main(String[] args)
    {
        String str1 = "Java";
        String str2 = "Hello";
        String str3 = new String("Java");
        if(str1 == str2)
            System.out.println("true");
        else
            System.out.println("False");
        if(str1.equals(str2))
            System.out.println("true");
        else
            System.out.println("False");

        System.out.println();
        if(str1 == str2)
            System.out.println("true");
        else
            System.out.println("False");
        if(str1.equals(str3))
            System.out.println("true");
        else
            System.out.println("False");
        System.out.println();

        String s1 = "Java";
        String s2 = "java";

        // 1. equals()
        System.out.println(s1.equals(s2));

        // 2. equalsIgnoreCase()
        System.out.println(s1.equalsIgnoreCase(s2));


        // 3. compareTo()
        System.out.println("Apple".compareTo("Banana"));
        System.out.println("Banana".compareTo("Apple"));
        System.out.println("Apple".compareTo("Apple"));
        System.out.println();


        // 4. compareToIgnoreCase()
        System.out.println("apple".compareToIgnoreCase("APPLE"));
        System.out.println();


        // 5. regionMatches()
        String s3 = "HelloWorld";
        String s4 = "World";

        System.out.println(
                s3.regionMatches(5, s4, 0, 5));
        System.out.println();
        //

        // 6. regionMatches() ignoring case
        System.out.println(
                "HelloWorld".regionMatches(true, 5, "world", 0, 5)
        );
        System.out.println();

        // 7. startsWith()
        System.out.println("Java Programming".startsWith("Java"));
        System.out.println();

        // 8. endsWith()
        System.out.println("program.java".endsWith(".java"));
        System.out.println();

        //9. Startwith(string, index)
        System.out.println("program java".startsWith("java", 8));
        System.out.println();
    }
}
