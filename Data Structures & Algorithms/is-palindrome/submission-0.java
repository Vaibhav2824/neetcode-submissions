class Solution {
    public boolean isPalindrome(String s) {
        String a = "", b = "";
        s = s.toLowerCase();
        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c))
                a = a + c;
        }
        for (int i = s.length() - 1; i >= 0; i--) {
            char c = s.charAt(i);
            if (Character.isLetterOrDigit(c))
                b = b + c;
        }
        if (a.equals(b))
            return true;
        else
            return false;
    }
}
