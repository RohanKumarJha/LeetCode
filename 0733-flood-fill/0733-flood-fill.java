class Solution {
    public void flood(int[][] image, int sr, int sc, int color,int result) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=result
        || image[sr][sc]==color) return;
        if(image[sr][sc] == result) image[sr][sc]=color;
        flood(image,sr+1,sc,color,result);
        flood(image,sr-1,sc,color,result);
        flood(image,sr,sc+1,color,result);
        flood(image,sr,sc-1,color,result);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int result = image[sr][sc];
        flood(image,sr,sc,color,result);
        return image;
    }
}