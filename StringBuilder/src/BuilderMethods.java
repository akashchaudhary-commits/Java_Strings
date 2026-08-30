public class BuilderMethods {
    public static void main(String[] args)
    {
        // SetLength()  - get to change the length of the string
        StringBuilder sb = new StringBuilder("Hello world");
        System.out.println(sb.length());
        sb.setLength(6);// remove the values to match the length
        System.out.println(sb);
        sb.setLength(16); // adds null values to the string
        System.out.println(sb);
        sb.append("Akash Chaudhary");
        System.out.println(sb);
        sb.delete(6, 16);
        System.out.println(sb);

        // Substring - gets you the desired part of the string
        // doesn't changes the original String unlike delete().

        System.out.println(sb.substring(6));
        System.out.println(sb.substring(6, 11));

        // trimToSize() - Reduce the capacity so it is closer to the current length.
        // Doesn't remove the characters.
        StringBuilder sb2 = new StringBuilder(100);

        sb2.append("Hello");

        System.out.println("Before:");
        System.out.println("Length = " + sb2.length());
        System.out.println("Capacity = " + sb2.capacity());

        sb2.trimToSize();

        System.out.println("After:");
        System.out.println("Length = " + sb2.length());
        System.out.println("Capacity = " + sb2.capacity());

        
    }
}
