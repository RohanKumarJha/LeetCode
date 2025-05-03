import java.util.*;

class Solution {
    public int minDominoRotations(int[] tops, int[] bottoms) {
        int rotationsA = checkRotations(tops[0], tops, bottoms);
        int rotationsB = checkRotations(bottoms[0], tops, bottoms);
        
        if (rotationsA == -1 && rotationsB == -1) return -1;
        return (rotationsA == -1) ? rotationsB : (rotationsB == -1) ? rotationsA : Math.min(rotationsA, rotationsB);
    }
    
    private int checkRotations(int target, int[] tops, int[] bottoms) {
        int swapTop = 0, swapBottom = 0;
        
        for (int i = 0; i < tops.length; i++) {
            if (tops[i] != target && bottoms[i] != target) return -1;
            if (tops[i] != target) swapTop++; 
            if (bottoms[i] != target) swapBottom++;
        }
        return Math.min(swapTop, swapBottom);
    }
}
