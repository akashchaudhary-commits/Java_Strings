public class IterateOverStrings {
    public static void main(String[] args)
    {
        String a = "jbvbavbva";
        System.out.println(a.charAt(0));
//
        // Iterate using loop
        for(int i=0;i<a.length();i++)
        {
            System.out.print(a.charAt(i));
        }
        System.out.println();
        // Iterate using for-each loop
        for(char x: a.toCharArray())
        {
            System.out.print(x);
        }
    }
}
