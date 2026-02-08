class Solution {
    public int compress(char[] chars) {
        int ans=0;
        for(int i=0;i<chars.length;i++){
            int j=i+1;
            int c=1;
            char ch=chars[i];
            while(j<chars.length && chars[j]==ch ){
                c++;
                j++;
            }
            chars[ans++]=ch;
            i=j-1;
            if(c>1){
                String a=String.valueOf(c);
            for(char k:a.toCharArray()){
                chars[ans++]=k;
            }
            }
        }
        return ans;
    }
}
