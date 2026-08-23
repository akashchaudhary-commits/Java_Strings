public class String5 {

    public static void main(String[] args) {

        String message = "Welcome to Java";

        // 1. Length
        System.out.println("Length = " + message.length());

        // 2. Characters
        System.out.println("First character = " + message.charAt(0));
        System.out.println("Last character = " +
                message.charAt(message.length() - 1));

        // 3. Loop through String
        for(int i = 0; i < message.length(); i++) {
            System.out.println(message.charAt(i));
        }

        // 4. concat()
        String s1 = "Hello";
        String s2 = "World";

        String s3 = s1.concat(" ").concat(s2);

        System.out.println(s3);

        // 5. + operator
        String s4 = s1 + " " + s2;

        System.out.println(s4);

        // 6. String + number
        int age = 20;

        System.out.println("Age = " + age);

        // 7. Obtaining Substring
        String message1 = "Hello my name is XYZ".substring(0, 17) + "Akash";
        System.out.println(message1);

    }
}