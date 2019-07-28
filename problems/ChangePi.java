//Given a string, compute recursively (no loops) a new string where all appearances of "pi" have been replaced by "3.14".

public class ChangePi {
    public static String replacePI(String s) {
        if (!s.contains("pi")) return s;
        int start = s.indexOf("pi");
        return s.substring(0, start) + "3.14" + replacePI(s.substring(start + 2));
    }

    public static void main(String[] args) {
        StdOut.println(replacePI(args[0]));
    }
}
