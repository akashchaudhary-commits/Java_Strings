public class Builder3 {

    public static void main(String[] args) {
        // 1. append(char[]) can also do the same with insert()

        char[] letters = {'J', 'a', 'v', 'a'};

        StringBuilder sb = new StringBuilder();

        sb.append(letters);

        System.out.println("After append(char[]): " + sb);

        // 2. append(char[], offset, length)

        char[] word = {'A', 'B', 'C', 'D', 'E'};

        sb.append(" ");

        sb.append(word, 1, 3);

        System.out.println("After partial append: " + sb);

        // insert(offset, char[], start, length)
        char[] letters2 = {'A', 'B', 'C', 'D', 'E'};

        StringBuilder sb2 = new StringBuilder("Hello");

        sb.insert(5, letters2, 1, 3);

        System.out.println(sb2);

        // 4. toString()

        String result = sb.toString();

        System.out.println("String: " + result);
    }
}