// We have bunnies standing in a line, numbered 1, 2, ...
// The odd bunnies (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say have 3 ears,
// because they each have a raised foot.
// Recursively return the number of "ears" in the bunny line 1, 2, ... n (without loops or multiplication).

public class Bunny {
    public static int earCount(int bunnies) {
        if (bunnies == 0)   return 0;
        return 3 - (bunnies % 2) + earCount(bunnies - 1);
    }

    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        StdOut.println(earCount(n));
    }
}
