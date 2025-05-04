import java.util.Stack;

class Solution {
    public int[] asteroidCollision(int[] asteroids) {
        Stack<Integer> stack = new Stack<>();

        for (int asteroid : asteroids) {
            boolean destroyed = false;

            while (!stack.isEmpty() && stack.peek() > 0 && asteroid < 0) { 
                // Collision: Right-moving asteroid vs Left-moving asteroid
                if (Math.abs(stack.peek()) < Math.abs(asteroid)) {
                    stack.pop();  // Right-moving asteroid is destroyed
                    continue;
                } else if (Math.abs(stack.peek()) == Math.abs(asteroid)) {
                    stack.pop();  // Both asteroids destroy each other
                }
                destroyed = true;
                break;
            }

            if (!destroyed) {
                stack.push(asteroid);
            }
        }

        return stack.stream().mapToInt(i -> i).toArray();  // Convert stack to int[]
    }
}
