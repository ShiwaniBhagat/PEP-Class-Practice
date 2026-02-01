class Solution {
    public boolean isPalindrome(String b) {
        String s="";
        for(int i=0;i<b.length();i++){
            char c=b.charAt(i);
            if(Character.isLetterOrDigit(c)){
            s+=c;
            }
        }
        s=s.toLowerCase();
        StringBuilder sb=new StringBuilder(s);
        if(sb.reverse().toString().equals(s)) return true;
        return false;
    }
}
