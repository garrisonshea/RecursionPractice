//Given a string, compute recursively (no loops) the number of lowercase 'x' chars in the string.

public class CountX {
    public static int countX(String s) {
        if (s.length() == 0) return 0;
        int count = 0;
        if (s.substring(0, 1).toLowerCase().equals("x"))
            count++;
        return count + countX(s.substring(1, s.length()));
    }

    public static void main(String[] args) {
        StdOut.println(countX(args[0]));
    }
}
