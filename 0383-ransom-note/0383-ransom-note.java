class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if(ransomNote.length() > magazine.length()) return false;
        char[] ransomNoteChar = ransomNote.toCharArray();
        char[] magazineChar = magazine.toCharArray();
        Arrays.sort(ransomNoteChar);
        Arrays.sort(magazineChar);
        int pointer1 = 0;
        int pointer2 = 0;
        while(pointer1<ransomNoteChar.length && pointer2<magazineChar.length) {
            if(ransomNoteChar[pointer1] == magazineChar[pointer2]) {
                pointer1++;
                pointer2++;
            } else {
                pointer2++;
            }
        }
        return (pointer1 == ransomNoteChar.length) ? true : false;
    }
}