class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        
        long volume = (long)length*width*height;
        
        boolean bulky = (length >= 1e4 || width >= 1e4 || height >= 1e4 || volume >= 1e9) ? true : false;
        
        boolean heavy = mass >= 100 ? true : false;
        
        if (bulky && heavy) return "Both";
        if (bulky) return "Bulky";
        if (heavy) return "Heavy";
        return "Neither";
    }
}