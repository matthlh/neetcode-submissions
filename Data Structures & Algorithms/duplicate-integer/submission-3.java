class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set<Integer> prev = new HashSet<>();

        for (int num : nums) {
            if (prev.contains(num)) return true;
            prev.add(num);
        }

        return false;
    }
}