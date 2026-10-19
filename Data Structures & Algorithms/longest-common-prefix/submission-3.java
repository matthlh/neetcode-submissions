class Solution {
    public String longestCommonPrefix(String[] strs) {
        String ans = "";
        int maxLength = strs[0].length();

        for (String s : strs) {
            maxLength = Math.min(maxLength, s.length());
        }

        for (int i = 0; i < maxLength; i++) {
            for (int j = 1; j < strs.length; j++) {
                if (strs[0].charAt(i) != strs[j].charAt(i)) {
                    return ans;
                }
            }

            ans += strs[0].charAt(i);
        }

        return ans;
    }
}