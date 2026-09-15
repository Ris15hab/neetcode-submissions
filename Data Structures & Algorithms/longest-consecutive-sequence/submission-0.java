class Solution {
    public int longestConsecutive(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num:nums)
            set.add(num);
        int maxLen = 0;
        for(int num:nums){
            if(!set.contains(num-1)){
                int temp = num;
                while(set.contains(temp))
                    temp+=1;
                maxLen = Math.max(maxLen,temp-num);
            }
        }
        return maxLen;
    }
}
