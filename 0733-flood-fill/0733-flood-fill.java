class Solution {
    public void changeMatrix(int[][] image, int sr, int sc, int color,int elm) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]==color || 
        image[sr][sc]!=elm) return ;
        if(image[sr][sc]==elm) image[sr][sc]=color;
        changeMatrix(image,sr+1,sc,color,elm);
        changeMatrix(image,sr-1,sc,color,elm);
        changeMatrix(image,sr,sc+1,color,elm);
        changeMatrix(image,sr,sc-1,color,elm);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        changeMatrix(image,sr,sc,color,image[sr][sc]);
        return image;
    }
}