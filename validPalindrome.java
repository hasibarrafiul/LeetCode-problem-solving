class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll("[^a-zA-Z0-9]", "");
        StringBuilder s2 = new StringBuilder();
        s2.append(s.toLowerCase());
        s2.reverse();
        if((s.toLowerCase()).equals(s2.toString())) return true;
        else return false;
    }
}
