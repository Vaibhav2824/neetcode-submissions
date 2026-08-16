class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if (s1.length() > s2.length())
            return false;
        int left = 0;
        HashMap<Character, Integer> maps1 = new HashMap<>();
        HashMap<Character, Integer> maps2 = new HashMap<>();
        for (Character c : s1.toCharArray()) maps1.put(c, maps1.getOrDefault(c, 0) + 1);
        for (int right = 0; right < s2.length(); right++) {
            maps2.put(s2.charAt(right), maps2.getOrDefault(s2.charAt(right), 0) + 1);
            while (right - left + 1 > s1.length()) {
                char c = s2.charAt(left);
                maps2.put(c, maps2.get(c) - 1);
                if (maps2.get(c) == 0) {
                    maps2.remove(c);
                }
                left++;
            }
            if (maps1.equals(maps2))
                return true;
        }
        return false;
    }
}
