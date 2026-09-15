class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int freq[] = new int[256];
        int maxLen = 0;
        int left = 0;
        int right = 0;
        while(left<n && right<n){
            char ch = s.charAt(right);
            if(freq[ch]>0){
                maxLen = Math.max(maxLen,right-left);
                while(left<n && freq[ch]>0)
                    freq[s.charAt(left++)]-=1;
            }
            freq[ch]+=1;
            right+=1;
        }
        maxLen = Math.max(maxLen,right-left);
        return maxLen;
    }
}
