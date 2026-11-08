class Solution {
    public int hammingWeight(int n) {
        // Normal solution (optimal preferably n &= n-1)
        // Tell them about Real life solution to use built in Integer.bitCount(n)
        int count = 0;
        for (int i = 0; i < 32; i++) {
            if ((n & 1) == 1) count++;

            n >>>= 1;
        }

        return count;
    }
}
 