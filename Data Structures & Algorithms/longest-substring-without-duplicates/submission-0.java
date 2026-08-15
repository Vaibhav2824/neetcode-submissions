class Solution {
    public int lengthOfLongestSubstring(String s) {
        int left = 0;
        int max_length = 0;
        HashSet<Character> map = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            while (map.contains(s.charAt(i))) {
                map.remove(s.charAt(left));
                left++;
            }
            map.add(s.charAt(i));
            max_length = Math.max(max_length, i - left + 1);
        }
        return max_length;
    }
}
