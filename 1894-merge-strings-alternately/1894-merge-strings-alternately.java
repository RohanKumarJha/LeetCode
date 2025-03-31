class Solution {
    public String mergeAlternately(String word1, String word2) {
        char[] arr1 = word1.toCharArray();
        char[] arr2 = word2.toCharArray();
        char[] arr3 = new char[arr1.length+arr2.length];
        int pos1 = 0, pos2 = 0;
        for(int i=0; i<(arr1.length+arr2.length); i++) {
            if(pos1 == arr1.length) {
                arr3[i] = arr2[pos2++];
            } else if(pos2 == arr2.length) {
                arr3[i] = arr1[pos1++];
            } else {
                arr3[i] = arr1[pos1++];
                arr3[i+1] = arr2[pos2++];
                i++;
            }
        } 
        String str = new String(arr3);
        return str;
    }
}