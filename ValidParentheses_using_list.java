class Solution {
    public boolean isValid(String s) {
        List<Character> list = new ArrayList<>();
        int list_index = 0;
        if((s.charAt(0)==']' || s.charAt(0)=='}' || s.charAt(0)==')')){
            return false;
        }
        
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==('(')){
                list.add('(');
                list_index++;
            }
            if(s.charAt(i)==('{')){
                list.add('{');
                list_index++;
            }
            if(s.charAt(i)==('[')){
                list.add('[');
                list_index++;
            }
            if(s.charAt(i)==(')')){
                if(list_index==0){
                    return false;
                }
                if(list.get(list_index-1)==('(')){
                    list.remove(list_index-1);
                    list_index--;
                }
                else return false;
            }
            if(s.charAt(i)==('}')){
                if(list_index==0){
                    return false;
                }
                if(list.get(list_index-1)==('{')){
                    list.remove(list_index-1);
                    list_index--;
                }
                else return false;
            }
            if(s.charAt(i)==(']')){
                if(list_index==0){
                    return false;
                }
                if(list.get(list_index-1)==('[')){
                    list.remove(list_index-1);
                    list_index--;
                }
                else return false;
            }
            System.out.println(list.size());
        }
        if(list_index==0){
            return true;
        }
        else{
            return false;
        }
    }
}
