class Solution {
    private void changePixel(int[][] image, int sr, int sc, int org_pixel, int color) {
        if(sr==-1 || sc==-1 || sr==image.length || sc==image[0].length) return ;
        if(image[sr][sc] != org_pixel) return ;
        image[sr][sc] = color;
        changePixel(image, sr-1, sc, org_pixel, color);
        changePixel(image, sr+1, sc, org_pixel, color);
        changePixel(image, sr, sc-1, org_pixel, color);
        changePixel(image, sr, sc+1, org_pixel, color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if(image[sr][sc] == color) return image;
        int org_pixel = image[sr][sc];
        changePixel(image, sr, sc, org_pixel, color);
        return image;
    }
}