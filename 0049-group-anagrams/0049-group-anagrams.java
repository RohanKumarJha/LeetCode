class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        // If the input array is empty or null, return an empty list. 
        if (strs == null || strs.length == 0) {
            return new ArrayList<>(); 
        }

        // Create a map to store anagram groups. The key is the sorted string, and the value is a list of anagrams.
        Map<String, List<String>> anagramGroups = new HashMap<>();

        // Iterate through each string in the input array.
        for (String str : strs) {

            // Convert the string to a character array.
            char[] charArray = str.toCharArray();
            // Sort the character array.
            Arrays.sort(charArray);
            
            // Convert the sorted character array back to a string.
            String sortedString = new String(charArray); 

            // If the sorted string is not already a key in the map, create a new list for it.
            if (!anagramGroups.containsKey(sortedString)) {
                anagramGroups.put(sortedString, new ArrayList<>()); 
            }

            // Add the original string to the list of anagrams for the sorted string.
            anagramGroups.get(sortedString).add(str); 
        }

        // Return a list of all the lists of anagrams.
        return new ArrayList<>(anagramGroups.values()); 
    }
}