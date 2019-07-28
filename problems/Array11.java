public class Array11 {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4};
        int elevenCount = getElevenCount(a);
        StdOut.println(elevenCount);
    }

    private static int getElevenCount(int[] a) {
        return getElevenCount(a, 0);
    }

    private static int getElevenCount(int[] a, int i) {
        if (i == a.length) {
            return 0;
        }
        int count = (a[i] == 11) ? 1 : 0;
        return count + getElevenCount(a, i + 1);
    }
}
