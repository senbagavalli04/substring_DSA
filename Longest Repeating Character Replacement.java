//CODE LINK: https://leetcode.com/problems/longest-repeating-character-replacement/

class Solution {
    public int characterReplacement(String s, int k) {
        int[] count = new int[26];
        int res = 0;
        int maxi = 0;
        for(int l=0, r=0; r<s.length();r++){
            char temp = s.charAt(r);
            count[temp - 'A']++;
            maxi = Math.max(maxi , count[temp - 'A']);
            if( maxi + k < r-l+1){
                char t = s.charAt(l);
                count[t - 'A']--;
              l++;
            }
            res = Math.max(res, r-l+1);
        }
        return res;

    }
}
