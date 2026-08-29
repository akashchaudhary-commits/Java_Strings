public class BuilderDemo {
    public static void main(String[] args)
    {
        // Creating an Empty StringBuilder
        StringBuilder sb = new StringBuilder();
        System.out.println(sb);

        sb.append("Hello");
        System.out.println(sb);

        sb.append("Name: ");
        sb.append("Akash");

        sb.append(", Age: ");
        sb.append(21);

        sb.append(", Percentage: ");
        sb.append(85.5);

        sb.append(", Passed: ");
        sb.append(true);

        System.out.println(sb);

        // Creating using Specifying capacity
        StringBuilder sb2 = new StringBuilder(50);
        System.out.println(sb2.length() + "\n" + sb2.capacity());

        // Creating from a String
        StringBuilder sb3 = new StringBuilder("Hello");
        sb3.append("Java");
        System.out.println(sb3);

        // append() means add something at the end.
        StringBuilder stringBuilder = new StringBuilder();

        stringBuilder.append("Welcome");
        stringBuilder.append(' ');
        stringBuilder.append("to");
        stringBuilder.append(' ');
        stringBuilder.append("Java")
        .append(" Appended");
        System.out.println(stringBuilder);

        // insert() add something at a particular position.
        StringBuilder sb4 = new StringBuilder("Hello Java");
        sb4.insert(6, "World ");  // 6 not included
        System.out.println(sb4);

        // delete() remove any character
        sb4.delete(5, 11); // start is included, end is excluded
        System.out.println(sb4);

        // delete using deletecharAt()
        // delete only one character

        // replace() - replacing part of the text.
        sb4.replace(6,10, "world");
        System.out.println(sb4);

        // reverse() - reverse the string
        sb4.reverse();
        System.out.println(sb4);

        // Example of reverse
        StringBuilder sb5 = new StringBuilder("madam");
        String reversed = sb5.reverse().toString();
        System.out.println(reversed);

        // charAt() to access single characters
        // setcharAt() to change a particular character
    }
}
