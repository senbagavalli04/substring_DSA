//CODE LINK : https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> st = new HashSet<>();
        int n = s.length();
        int j=0;
        int maxi=0;
        for(int i=0;i<n; i++){
            while (st.contains(s.charAt(i))){
                st.remove(s.charAt(j));
                j++;
            }
            st.add(s.charAt(i));
            maxi = Math.max(maxi,i-j+1);
        }
        return maxi;
    }
}
