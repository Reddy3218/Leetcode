class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        for(int row = 0; row < n; row++){
            int left = 0, right = image[row].length-1;

            while(left <= right){
                int temp = image[row][left]^1;
                image[row][left] = image[row][right]^1;
                image[row][right] = temp;

                left++;
                right--;
            }
        }
        return image;
    }
}