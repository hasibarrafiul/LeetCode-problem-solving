class Solution {
    public int lengthOfLastWord(String s) {
        String s2 = s.strip();
        int n = 0;
        for(int i=s2.length();i>0;i--){
            if(s2.charAt(i-1)!=' '){
                n++;
            }
            else{
                break;
            }
        }
        return n;
    }
}
