class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int row = image.length;
        int col = image[0].length;

        int[][] res = new int[row][col];

        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                res[i][j] = 1 - image[i][col - 1 - j];
            }
        } 
        return res;
    }
}