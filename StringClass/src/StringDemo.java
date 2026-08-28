// String  - Sequence of Characters
//In other Languages - String treated as Array of objects,
//In Java  - String treated as objects
//        1. String Class  = Uses methods to manipulate strings

public class StringDemo {
    public static void main(String[] args) {
        String str = "Java";
        String str2 = str;
//        System.out.println(s2.charAt(0));
        String str3 = new String("Hello");
//        char[] s4 = {'a','b','c'};
//        String s5 = new String(s4);
//        System.out.println(s4);
//        System.out.println(s5);
//        //System.out.println(s4.toUpperCase());
//        System.out.println(s5.toUpperCase());
//        System.out.println(s1);
//        System.out.println(s2);
//        System.out.println(s3);
        if(str == str2)
            System.out.println("True");
        else
            System.out.println("False");
        if(str2 == str3)
            System.out.println("True");
        else
            System.out.println("False");
        if(str.equals(str2))
            System.out.println("true");
        else{
            System.out.println("False");
        }
        if(str2.equals(str3))
            System.out.println("true");
        else
            System.out.println("false");


//        String asd = "hviaeubeia";
//        String hbx = "kjvbbvekbeb";
//
//
//
//
        // Strings are immutable
        char[] arr = {'q','w','e','r'};
        System.out.println(arr);
        arr[0] = 't';
        System.out.println(arr);

        String a = "Akash";
        a = "Dkash";
        System.out.println(a);
    }
}
