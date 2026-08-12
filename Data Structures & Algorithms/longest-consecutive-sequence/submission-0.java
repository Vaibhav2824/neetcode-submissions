class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> hs = new HashSet<>();
        for (int n : nums) {
            if (!hs.contains(n))
                hs.add(n);
        }
        int longest = 0;
        for (int i : hs) {
            if (!hs.contains(i - 1)) {
                int length = 1;
                int current = i;
                while (hs.contains(current + 1)) {
                    current++;
                    length++;
                }
                if (longest < length)
                    longest = length;
            }
        }
        return longest;
    }
}
