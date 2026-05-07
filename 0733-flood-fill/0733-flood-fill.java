class Solution {
    private void flood(int[][] image, int sr, int sc, int color,int original) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc] != original) return;
        image[sr][sc]=color;
        flood(image,sr+1,sc,color,original);
        flood(image,sr-1,sc,color,original);
        flood(image,sr,sc+1,color,original);
        flood(image,sr,sc-1,color,original);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        flood(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}