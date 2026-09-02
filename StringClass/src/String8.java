public class String8 {

    public static void main(String[] args) {

        String str = "Welcome to Java";

        System.out.println("String: " + str);

        // 1. indexOf(char)

        System.out.println("\nindexOf(char):");

        System.out.println("Index of W: " + str.indexOf('W'));

        System.out.println("Index of o: " + str.indexOf('o'));


        // 2. indexOf(char, fromIndex)

        System.out.println("\nindexOf(char, fromIndex):");

        System.out.println(
                "Index of m starting from index 5: "
                        + str.indexOf('a', 13)
        );


        // 3. indexOf(String)

        System.out.println("\nindexOf(String):");

        System.out.println(
                "Index of Java: "
                        + str.indexOf("Java")
        );

        System.out.println(
                "Index of come: "
                        + str.indexOf("come")
        );

        // 4. indexOf(String, fromIndex)

        System.out.println("\nindexOf(String, fromIndex):");

        System.out.println(
                "Index of Java starting from index 5: "
                        + str.indexOf("to", 10)
        );

        // 5. lastIndexOf(char)

        System.out.println("\nlastIndexOf(char):");

        System.out.println(
                "Last index of o: "
                        + str.lastIndexOf('o')
        );

        System.out.println(
                "Last index of W: "
                        + str.lastIndexOf('W')
        );

        // 6. lastIndexOf(char, fromIndex)

        System.out.println("\nlastIndexOf(char, fromIndex):");

        System.out.println(
                "Last index of o before index 5: "
                        + str.lastIndexOf('o', 5)
        );

        // 7. lastIndexOf(String)

        System.out.println("\nlastIndexOf(String):");

        System.out.println(
                "Last index of Java: "
                        + str.lastIndexOf("Java")
        );

        System.out.println(
                "Last index of come: "
                        + str.lastIndexOf("come")
        );

        // 8. lastIndexOf(String, fromIndex)

        System.out.println("\nlastIndexOf(String, fromIndex):");

        System.out.println(
                "Last index of Java before index 13: "
                        + str.lastIndexOf("Java", 13)
        );

        // 9. Searching for something
        //    that doesn't exist

        System.out.println("\nSearching for java:");

        System.out.println(
                "Index of java: "
                        + str.indexOf("java")
        );
    }
}