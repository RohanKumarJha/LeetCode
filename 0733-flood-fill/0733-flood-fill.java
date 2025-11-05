class Solution {
    private void check(int[][] image, int sr, int sc, int color,int pixelColor) {
        if(sr==-1 || sc==-1 || sr==image.length || sc==image[0].length || image[sr][sc]!=pixelColor) return ;
        image[sr][sc] = color;
        check(image,sr-1,sc,color,pixelColor);
        check(image,sr+1,sc,color,pixelColor);
        check(image,sr,sc-1,color,pixelColor);
        check(image,sr,sc+1,color,pixelColor);
    }
    
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int pixelColor = image[sr][sc];
        if(pixelColor == color) return image;
        check(image,sr,sc,color,pixelColor);
        return image;
    }
}