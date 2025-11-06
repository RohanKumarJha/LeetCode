class Solution {
    private void flood_fill(int[][] image, int sr, int sc, int color,int original_pixel) {
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=original_pixel) return;
        image[sr][sc] = color;
        flood_fill(image,sr-1,sc,color,original_pixel);
        flood_fill(image,sr+1,sc,color,original_pixel);
        flood_fill(image,sr,sc-1,color,original_pixel);
        flood_fill(image,sr,sc+1,color,original_pixel);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int original_pixel = image[sr][sc];
        if(color == original_pixel) return image;
        flood_fill(image,sr,sc,color,original_pixel);
        return image;
    }
}