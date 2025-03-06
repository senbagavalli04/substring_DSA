//CODE LINK : https://leetcode.com/problems/longest-palindromic-substring/description/

class Solution {
    public String longestPalindrome(String s) {
        String longest = "";

        int n = s.length();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                String sub = s.substring(i,j+1);
                if(isPalin(sub)){
                     if (longest.length() < sub.length())
                     longest = sub;
                }
            }
        }
        return longest;


    }
    public boolean isPalin (String s){
        int l=0;
        int r = s.length()-1;
        while(l<r){
            if ( s.charAt(l) != s.charAt(r)) return false;
            l++;
            r--;
        
        }
        return true;
    }
}
