class Solution {
    public int reverseBits(int n) {
        StringBuilder s1 = new StringBuilder(Integer.toBinaryString(n));
        int l = 32 - s1.length();
        StringBuilder s2 = new StringBuilder("0".repeat(l));
        s2.append(s1);
        s2.reverse();
        return Integer.parseUnsignedInt(s2.toString(), 2);
    }
}
