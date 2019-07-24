//Given a non-negative int n, return the count of the occurrences of 7 as a digit

public class Count7 {
    public static int countSeven(int n) {
        if (n == 0) return 0;
        int lastDigit = n % 10;
        int count;
        if (lastDigit == 7)
            count = 1;
        else
            count = 0;
        return count + countSeven(n / 10);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(countSeven(n));
    }
}
