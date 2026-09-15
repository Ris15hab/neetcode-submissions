class Solution {
    public int maxArea(int[] heights) {
        int left = 0;
        int right = heights.length-1;
        int result = 0;
        while(left<right){
            if(heights[left]<=heights[right]){
                result = Math.max(result,heights[left]*(right-left));
                left+=1;
            }else{
                result = Math.max(result,heights[right]*(right-left));
                right-=1;
            }
        }
        return result;
    }
}
