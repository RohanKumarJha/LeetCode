class Solution {
    private void flood(int[][] image, int sr, int sc, int color, int curr_color) {
        if(color == curr_color) return;
        if(sr<0 || sc<0 || sr>=image.length || sc>=image[0].length) return ;
        if(image[sr][sc] != curr_color) return;
        if(image[sr][sc] == curr_color) {
            image[sr][sc] = color;
        }
        flood(image, sr+1, sc, color, curr_color);
        flood(image, sr-1, sc, color, curr_color);
        flood(image, sr, sc+1, color, curr_color);
        flood(image, sr, sc-1, color, curr_color);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        flood(image, sr, sc, color, image[sr][sc]);
        return image;
    }
}