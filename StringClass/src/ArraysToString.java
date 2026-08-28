import java.util.Arrays;
public class ArraysToString {
    public static void main(String[] args)
    {
        // Convert char[] to strings
        char[] c = {'q','w','e','r','t','y'};
        String str1 = new String(c);
        // or
        String st = String.valueOf(c);
        String st2 = "Akash";
        // only works with char[]
        // works with just single values
        System.out.println(str1);
        System.out.println(st);
        System.out.println(Arrays.toString(c));

        // int[] to strings
        int[] arr = {1,2,3,4,5};
        //String st3 = new String(arr);
        String str2 = Arrays.toString(arr);
        System.out.println(str2);
        //
        String str3 = String.valueOf(arr);
        System.out.println(str3);

        // String[] to String
        String[] s = {"AKash", "bcuvv", "ubqc"};
        System.out.println(Arrays.toString(s));

        //


    }
}
