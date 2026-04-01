class Solution {
    public boolean isPalindrome(String s) {
        String nospaces = s.replaceAll("[^a-zA-Z0-9]","").toLowerCase();
        StringBuilder sb = new StringBuilder(nospaces);
        return nospaces.equals(sb.reverse().toString());
    }
}
