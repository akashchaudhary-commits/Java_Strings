public class ConvertingToString {
    public static void main(String[] args)
    {
        // Converting Character and Numeric values to String

        int i = 53;
        float f = 5.87f;
        double d = 67.67452;
        char c = 'c';
        char[] c1 = {'a','b','c'};
        long l = 71854624;
        boolean b = true;

        String str= String.valueOf(i);
        System.out.println(str);
        String str1= String.valueOf(f);
        System.out.println(str1);
        String str2= String.valueOf(d);
        System.out.println(str2);
        String str3= String.valueOf(c);
        System.out.println(str3);
        String str4= String.valueOf(c1);
        System.out.println(str4);
        String str5= String.valueOf(l);
        System.out.println(str5);
        String str6= String.valueOf(b);
        System.out.println(str6);
        System.out.println(str5.length());
        System.out.println("--------------");

        int i1 = Integer.parseInt(str);
        System.out.println(i1);

        long i2 = Long.parseLong(str);
        System.out.println(i1);

        // Checking the datatype:
        System.out.println(str.getClass());

        //or using instance of
        if(str instanceof String)
        {
            System.out.println("String");
        }

    }
}
