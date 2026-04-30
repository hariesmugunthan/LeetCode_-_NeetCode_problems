class Solution {
    public String mergeAlternately(String s1, String s2) {
        int i=0;
        int j=0;
        String s="";
        int l=s1.length()+s2.length()-1;
        while(s.length()<=l){
            if(i<s1.length() && j<s2.length()) {
                s+=s1.charAt(i++);
                s+=s2.charAt(j++);
            }
            else if(i>=s1.length() && j<s2.length()){
                s+=s2.charAt(j++);
            }
            else if(i<s1.length() && j>=s2.length()){
                s+=s1.charAt(i++);
            }
        }
        return s;

    }
}
