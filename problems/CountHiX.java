public class CountHiX {
    public static int count(String s) {
        if (s.length() == 0) {
            return 0;
        }
        int index = s.indexOf("hi");
        boolean foundX = false;
        if (index > 0) {
            if (s.charAt(index - 1) == 'x') {
                foundX = true;
            }
        }
        int count = 0;
        if (!foundX)
            count++;
        return count + count(s.substring(index + 2));
    }

    public static void main(String[] args) {
        StdOut.println(count(args[0]));
    }
}
