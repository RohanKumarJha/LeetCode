class Solution {
    public void applyFloodFill(int[][] image, int sr, int sc, int color, int answer) {
        if(sr==-1 || sc==-1 || sr>=image.length || sc>=image[0].length || image[sr][sc]!=answer || image[sr][sc]==color) return ;
        image[sr][sc] = color;
        applyFloodFill(image, sr-1, sc, color, answer);
        applyFloodFill(image, sr+1, sc, color, answer);
        applyFloodFill(image, sr, sc-1, color, answer);
        applyFloodFill(image, sr, sc+1, color, answer);
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        int answer = image[sr][sc];
        applyFloodFill(image, sr, sc, color, answer);
        return image;
    }
}