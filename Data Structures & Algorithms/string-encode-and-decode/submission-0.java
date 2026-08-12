class Solution {
    public String encode(List<String> strs) {
        String str = "";
        for (String s : strs) {
            int l = s.length();
            str = str + l + "#" + s;
        }
        return str;
    }
    public List<String> decode(String str) {
        List<String> lst = new ArrayList<>();
        for (int i = 0; i < str.length();) {
            int j = i;
            while (str.charAt(j) != '#') {
                j++;
            }
            int length = Integer.parseInt(str.substring(i, j));
            i = j + 1;
            String word = str.substring(i, i + length);
            lst.add(word);
            i = i + length;
        }
        return lst;
    }
}
