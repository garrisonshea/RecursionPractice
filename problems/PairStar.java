public class PairStar {
    public static String star(String s) {
        if (s.length() == 1 || s.length() == 0) return s;
        String[] letters = s.split("");
        if (letters[0].equals(letters[1])) {
            String ret = letters[0] + "*";
            letters[0] = "";
            return ret + star(String.join("", letters));
        } else {
            return letters[0] + star(s.substring(1));
        }
    }

    public static void main(String[] args) {
        StdOut.print(star(args[0]));
    }
}
