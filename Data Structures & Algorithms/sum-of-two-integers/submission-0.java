class Solution {
    public int getSum(int a, int b) {
        int carry = 0;
        int sum = 0;

        for (int i = 0; i < 32; i++) {
            int aBit = (a >>> i) & 1;
            int bBit = (b >>> i) & 1;
            int newBit = aBit ^ bBit ^ carry;
            sum |= newBit << i;
            carry = ((aBit & bBit) == 1 || (aBit & carry) == 1 || (bBit & carry) == 1) ? 1 : 0;
        }  

        return sum;

        // 1. How to iterate through bits given int?
    }
}
