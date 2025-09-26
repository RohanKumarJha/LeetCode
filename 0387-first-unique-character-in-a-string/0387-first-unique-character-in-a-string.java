import java.util.*;

class Solution {
    public int firstUniqChar(String s) {
        Map<Character, Integer> map = new HashMap<>();
        Queue<Character> q = new LinkedList<>();

        // Count frequencies and populate queue
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
            if (map.get(ch) == 1) {
                q.offer(ch);
            }
        }

        // Remove non-unique characters from queue front
        while (!q.isEmpty() && map.get(q.peek()) > 1) {
            q.poll(); // removes head of queue
        }

        // Find index of first unique character
        if (!q.isEmpty()) {
            char result = q.peek();
            for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) == result) return i;
            }
        }

        return -1;
    }
}
