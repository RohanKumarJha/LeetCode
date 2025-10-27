class Solution {
    public int beam(String str) {
        int result = 0;
        for(int i=0; i<str.length(); i++) {
            if(str.charAt(i) == '1') result++;
        } return result;
    }

    public int numberOfBeams(String[] bank) {
        int lasser = 0;
        int result = 0;
        for(int i=0; i<bank.length; i++) {
            int laserBeam = beam(bank[i]);
            result += lasser*laserBeam;
            if(laserBeam != 0) lasser=laserBeam;
        } return result;
    }
}