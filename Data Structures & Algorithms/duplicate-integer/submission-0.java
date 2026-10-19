class Solution {
    public boolean hasDuplicate(int[] nums) {
        List<Integer> prev = new ArrayList<>();

        for (int n : nums) {
            if (prev.contains(n)) {
                return true;
            } else {
                prev.add(n);
            }
        }

        return false;
    }
}