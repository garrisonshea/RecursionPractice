//Count recursively the total number of "abc" and "aba" substrings that appear in the given string.

public class CountAbc {
    public static int count(String s) {
        if (s.indexOf("abc") == -1 && s.indexOf("aba") == -1) {
            return 0;
        }
        int index = s.indexOf("abc");
        if (index < 0)
            index = s.indexOf("aba");
        return 1 + count(s.substring(0, index) + s.substring(index + 3));
    }

    public static void main(String[] args) {
        StdOut.println(count(args[0]));
    }
}
